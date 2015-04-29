package tuenti.challenge2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AlmostPrimeDetector 
{
 
  public AlmostPrimeDetector() {
    super();
  }

  public int numberOfAlmostPrimesBetween(int i, int j) 
  {
    Integer result = 0;
    for (int number = i; number <= j; ++number)
    {
      if (IsKPrime(number))
      {
          result++;
      }
    }
    return result;
  }
  
  public Boolean IsKPrime(int number)
  {
    int K = 2;
    int primes = 0;
    for (int p = 2; p * p <= number && primes < K; ++p)
    {
      while (number % p == 0 && primes < K)
      {
          number /= p;
          ++primes;
      }
    }
    
    if (number > 1)
    {
      ++primes;
    }
    return primes == K;
  }     
}