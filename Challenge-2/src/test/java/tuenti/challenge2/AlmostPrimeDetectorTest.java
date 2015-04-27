package tuenti.challenge2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class AlmostPrimeDetectorTest {

	private AlmostPrimeDetector almostPrimeDetector;

	@Test public void
	should_return_true_for_number_4 () {
		almostPrimeDetector = new AlmostPrimeDetector(Primes.getPrimes(10));
		assertTrue(almostPrimeDetector.isAlmostPrime(4));
	}

	@Test public void
	should_return_false_for_number_3 () {
		almostPrimeDetector = new AlmostPrimeDetector(Primes.getPrimes(10));
		assertFalse(almostPrimeDetector.isAlmostPrime(3));
	}

	@Test public void
	should_return_false_for_number_5 () {
		almostPrimeDetector = new AlmostPrimeDetector(Primes.getPrimes(10));
		assertFalse(almostPrimeDetector.isAlmostPrime(3));
	}
}
