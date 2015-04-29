package tuenti.challenge2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlmostPrimeDetectorTest {

  final private AlmostPrimeDetector almostPrimeDetector = new AlmostPrimeDetector();
  
  @Test public void
  should_return_4_almost_primes_between_1_and_10 () {		
  	assertEquals(4,almostPrimeDetector.numberOfAlmostPrimesBetween(1,10));
  }
  
  @Test public void
  should_return_3_almost_primes_between_10_and_20 () {
  	assertEquals(3,almostPrimeDetector.numberOfAlmostPrimesBetween(10,20));
  }
  
  
  @Test public void
  should_return_9_almost_primes_between_20_and_40 () {
    assertEquals(9,almostPrimeDetector.numberOfAlmostPrimesBetween(20,40));
  }	
	
  @Test public void
  should_return_15_almost_primes_between_1_and_40 () {
    assertEquals(15,almostPrimeDetector.numberOfAlmostPrimesBetween(1,40));
  } 
  
  @Test public void
  should_return_2608_almost_primes_between_50_and_10000() {
    assertEquals(2608,almostPrimeDetector.numberOfAlmostPrimesBetween(50,10000));
  }
  
  @Test public void
  should_return_30435_almost_primes_between_1337_and_133700() {
    assertEquals(30435,almostPrimeDetector.numberOfAlmostPrimesBetween(1337, 133700));
  }   
  
	 @Test public void
	should_return_1904324_almost_primes_between_1_and_9999999 () {
	    assertEquals(1904324,almostPrimeDetector.numberOfAlmostPrimesBetween(1,9999999));
	  }
}
