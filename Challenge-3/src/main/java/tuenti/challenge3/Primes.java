package tuenti.challenge3;

import java.util.Set;
import java.util.TreeSet;

public class Primes 
{
  public static boolean isPrime (int x)
  {
    for (int i = 2; i <= Math.sqrt (x); i++)
    {
      if (x % i == 0)
      {
        return false;
      }
    }

    return true;
  }

  public static Set<Integer> getFirstPrimes(int maxPrimes)
  {
    TreeSet<Integer> primes = new TreeSet<Integer>();
    for (int i = 2; primes.size() < maxPrimes; i++)
    {
      if (isPrime (i))
      {        
        primes.add(i);
      }
    }
    
    return primes;
  }
}
