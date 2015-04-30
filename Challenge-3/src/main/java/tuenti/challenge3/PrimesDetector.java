package tuenti.challenge3;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PrimesDetector
{  
  public static Map<Integer, Integer> getMostPopular(Set<Integer> primes, Double number)
  {
    SortedMap<Integer, Integer> popular =  new TreeMap<Integer, Integer>();
    for (Integer i : primes) popular.put(i, 0);
    
    for (Integer i : popular.keySet())
    {
      countTimes(number, popular, i);
    }

    return popular;
  }

  private static void countTimes(Double number, Map<Integer, Integer> popular, Integer i)
  {
    while (number % i == 0) 
    {
      Integer valor = popular.get(i);
      popular.put(i, ++valor);
      number /= i;
    }    
  }
}
