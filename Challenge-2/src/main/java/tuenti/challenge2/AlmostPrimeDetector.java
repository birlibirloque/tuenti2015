package tuenti.challenge2;

import java.util.HashSet;
import java.util.Set;

public class AlmostPrimeDetector {

	Set<Integer> CartesianProductPrimes = new HashSet<Integer>();

	public AlmostPrimeDetector() {
		super();
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

	public int numberOfAlmostPrimesBetween(int i, int j) {

		int res = 0;
		for (int n = i; n<j+1; n++) {
			if (isAlmostPrime(n)) {
				res++;
			}
    }
		return res;
	}

	private boolean isAlmostPrime(int i) {
		if (this.CartesianProductPrimes.contains(i)) {
			return true;
		}
		return false;
	}

	public void setPrimes(Set<Integer> primes) {
		this.CartesianProductPrimes = this.cartesianProduct(primes,primes);
  }
}