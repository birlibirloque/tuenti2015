package tuenti.challenge3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PrimesDetector
{  
  SortedMap<Integer, Integer> popular =  new TreeMap<Integer, Integer>();
  
  public void init(Set<Integer> primes)
  {
    for (Integer i : primes) popular.put(i, 0);
  }
  
  public void countMostPopular(BigInteger number)
  {
    for (Integer i : popular.keySet())
    {
      countTimes(number, i);
    }
  }

  private void countTimes(BigInteger number, Integer i)
  {
    while (number.mod(BigInteger.valueOf(i)) == BigInteger.ZERO) 
    {
      Integer valor = this.popular.get(i);
      this.popular.put(i, ++valor);
      number = number.divide(BigInteger.valueOf(i));
    }    
  }
  
  public Integer[] getMostPopular()
  {
    // Hay que devolverlo ordenado por value, no por key
    ValueComparator bvc =  new ValueComparator(this.popular);
    Map<Integer,Integer> sortedMapByRepetitions = new TreeMap<Integer,Integer>(bvc);
    sortedMapByRepetitions.putAll(this.popular);
    List<Integer> result = new ArrayList<Integer>();
    int count = 0;
    int first  = 0;
    
    for(Map.Entry<Integer,Integer> entry : sortedMapByRepetitions.entrySet()) 
    {
      Integer key = entry.getKey();
      Integer value = entry.getValue();

      if (count == 0)
      {
        result.add(value);
        first = value;
        count++;
      }
      
      if (first == value)
      {        
        result.add(key);
      }
      else
        break;
    }
    
    return result.toArray(new Integer[result.size()]);
  }
}
