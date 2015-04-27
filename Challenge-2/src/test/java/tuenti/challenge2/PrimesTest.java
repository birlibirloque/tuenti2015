package tuenti.challenge2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

public class PrimesTest {

	@Test public void
	should_return_a_set_with_no_integer_when_max_is_less_than_3(){
		Set<Integer> primes = Primes.getPrimes(2);
		assertEquals(0, primes.size());
	}

	@Test public void
	should_return_a_set_with_prime_2_when_max_is_3(){
		Set<Integer> primes = Primes.getPrimes(3);
		assertEquals(1, primes.size());
		assertTrue(primes.contains(2));
	}

	@Test public void
	should_return_a_set_with_4_begining_primes_when_max_is_10(){
		Set<Integer> primes = Primes.getPrimes(10);
		assertEquals(4, primes.size());
		assertTrue(primes.contains(2));
		assertTrue(primes.contains(3));
		assertTrue(primes.contains(5));
		assertTrue(primes.contains(7));
	}

	@Test public void
	should_return_a_set_with_8_begining_primes_when_max_is_20(){
		Set<Integer> primes = Primes.getPrimes(20);
		assertEquals(8, primes.size());
		assertTrue(primes.contains(2));
		assertTrue(primes.contains(3));
		assertTrue(primes.contains(5));
		assertTrue(primes.contains(7));
		assertTrue(primes.contains(11));
		assertTrue(primes.contains(13));
		assertTrue(primes.contains(17));
		assertTrue(primes.contains(19));
	}
}
