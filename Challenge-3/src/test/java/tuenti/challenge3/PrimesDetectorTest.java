package tuenti.challenge3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class PrimesDetectorTest 
{
  @Test public void
  should_return_5_two_times_in_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);    
    Map<Integer,Integer> popular = PrimesDetector.getMostPopular(primes, 150D);
    assertEquals((Integer)2, popular.get(5));
  }
  
  @Test public void
  should_return_once_in_every_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);    
    Map<Integer,Integer> popular = PrimesDetector.getMostPopular(primes, 210D);    
    assertEquals((Integer)1, popular.get(2));
    assertEquals((Integer)1, popular.get(3));
    assertEquals((Integer)1, popular.get(5));
    assertEquals((Integer)1, popular.get(7));
  }
  
  @Test public void
  should_return_3_and_5_forth_times_in_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);    
    Map<Integer,Integer> popular = PrimesDetector.getMostPopular(primes, 708750D);    
    assertEquals((Integer)1, popular.get(2));
    assertEquals((Integer)4, popular.get(3));
    assertEquals((Integer)4, popular.get(5));
    assertEquals((Integer)1, popular.get(7));
  }
  
  @Test public void
  should_return_11__times_for_7_11_41_71_in_25_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(25);    
    Map<Integer,Integer> popular = PrimesDetector.getMostPopular(primes, 40538103498493480651153838410835479173634905226439438419127626062846124183452713356194863055629541265643379109659815000056205516418464789277779504467899236242704451184542077940173615366017064843750D);
    assertEquals((Integer)11, popular.get(7));
    assertEquals((Integer)11, popular.get(11));
    assertEquals((Integer)11, popular.get(41));
    assertEquals((Integer)11, popular.get(71));
  }
}
