package tuenti.challenge3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class PrimesTest 
{
  @Test public void
  should_return_5_firstPrimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(3);    
    assertEquals(3, primes.size());
    assertTrue(primes.contains(2));    
    assertTrue(primes.contains(3));
    assertTrue(primes.contains(5));
  }
  
  @Test public void
  should_return_10_firstPrimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(10);
    assertEquals(10, primes.size());
    assertTrue(primes.contains(2));    
    assertTrue(primes.contains(3));
    assertTrue(primes.contains(5));
    assertTrue(primes.contains(7));
    assertTrue(primes.contains(11));
    assertTrue(primes.contains(13));
    assertTrue(primes.contains(17));
    assertTrue(primes.contains(19));
    assertTrue(primes.contains(23));
    assertTrue(primes.contains(29));
  }
}
