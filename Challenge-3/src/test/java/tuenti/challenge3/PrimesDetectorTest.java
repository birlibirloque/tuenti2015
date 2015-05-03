package tuenti.challenge3;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;

public class PrimesDetectorTest 
{
  PrimesDetector detector = new PrimesDetector();
      
  @Test public void
  should_return_5_two_times_in_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);
    detector.init(primes);    
    detector.countMostPopular(new BigInteger("150"));
    Integer[] popular = detector.getMostPopular();
    assertEquals((Integer)2, popular[0]);
    assertEquals((Integer)5, popular[1]);
  }
  
  @Test public void
  should_return_once_in_every_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);
    detector.init(primes);
    detector.countMostPopular(new BigInteger("210"));
    Integer[] popular = detector.getMostPopular();   
    assertEquals((Integer)1, popular[0]);
    assertEquals((Integer)2, popular[1]);
    assertEquals((Integer)3, popular[2]);
    assertEquals((Integer)5, popular[3]);
  }
  
  @Test public void
  should_return_3_and_5_forth_times_in_5_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(5);    
    detector.init(primes);
    detector.countMostPopular(new BigInteger("708750"));
    Integer[] popular = detector.getMostPopular();   
    assertEquals((Integer)4, popular[0]);
    assertEquals((Integer)3, popular[1]);
    assertEquals((Integer)5, popular[2]);
  }
  
  @Test public void
  should_return_11__times_for_7_11_41_71_in_25_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(25);
    detector.init(primes);
    detector.countMostPopular(new BigInteger("40538103498493480651153838410835479173634905226439438419127626062846124183452713356194863055629541265643379109659815000056205516418464789277779504467899236242704451184542077940173615366017064843750"));
    Integer[] popular = detector.getMostPopular();   
    assertEquals((Integer)11, popular[0]);
    assertEquals((Integer)7, popular[1]);
    assertEquals((Integer)11, popular[2]);
    assertEquals((Integer)41, popular[3]);
    assertEquals((Integer)71, popular[4]);
  }
  
  @Test public void
  should_return_11_times_for_21_in_25_firstprimes()
  {
    Set<Integer> primes = Primes.getFirstPrimes(25);
    detector.init(primes);
    detector.countMostPopular(new BigInteger("40538103498493480651153838410835479173634905226439438419127626062846124183452713356194863055629541265643379109659815000056205516418464789277779504467899236242704451184542077940173615366017064843750"));
    detector.countMostPopular(new BigInteger("10825376407127149593583471686162437023520040887300745203347565782593113725393343036787683306078877246882697455114469093546787448597745277353853047068376837385461372986595393464834645784591175188886561665558474898138278617101808000000"));
    Integer[] popular = detector.getMostPopular();   
    assertEquals((Integer)21, popular[0]);
    assertEquals((Integer)11, popular[1]);
  }
  
}
