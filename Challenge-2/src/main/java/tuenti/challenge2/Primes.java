package tuenti.challenge2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Primes {

	public static Set<Integer> getPrimes (Integer max) {
		int tope = (int) Math.floor(Math.sqrt(max)) + 1;
		 
		List<Long> compuestos = new ArrayList<Long>();
		int pos = 0;
		for (int i = 2; i <= tope; i++) {
			if (!compuestos.contains(Long.valueOf(i))) {
				for (int j = i; j <= max / i + 1; j++)
					compuestos.add(Long.valueOf(i * j));
			}
		}
 
		Set<Integer> primes = new HashSet<>();
		int c = 0;
		for (pos = 2; pos < max; pos++) {
			if (!compuestos.contains(Long.valueOf(pos)))
			  primes.add(pos);
		}
		return primes;
	}
}
