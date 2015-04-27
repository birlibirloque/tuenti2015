package tuenti.challenge2;

import java.util.HashSet;
import java.util.Set;

public class AlmostPrimeDetector {

	Set<Integer> CartesianProductPrimes = new HashSet<Integer>();

	public AlmostPrimeDetector(Set<Integer> primes) {
		super();
		this.CartesianProductPrimes = this.cartesianProduct(primes,primes);
	}

	private Set<Integer> cartesianProduct(Set<Integer> primes1, Set<Integer> primes2) {
		Set<Integer> cartesianProduct = new HashSet<>();
		for (Integer prime1 : primes1) {
	    for (Integer prime2 : primes2) {
	    	cartesianProduct.add(prime1*prime2);
	    }
    }
		return cartesianProduct;
  }

	public boolean isAlmostPrime(int i) {
		if (this.CartesianProductPrimes.contains(i)) {
			return true;
		}
		return false;
	}

}
