package tuenti.challenge2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlmostPrimeDetectorTest {

	final private AlmostPrimeDetector almostPrimeDetector = new AlmostPrimeDetector();

	@Test public void
	should_return_4_almost_primes_between_1_and_10 () {
		almostPrimeDetector.setPrimes(Primes.getPrimes(10));
		assertEquals(4,almostPrimeDetector.numberOfAlmostPrimesBetween(1,10));
	}

	@Test public void
	should_return_3_almost_primes_between_10_and_20 () {
		almostPrimeDetector.setPrimes(Primes.getPrimes(20));
		assertEquals(3,almostPrimeDetector.numberOfAlmostPrimesBetween(10,20));
	}
}
