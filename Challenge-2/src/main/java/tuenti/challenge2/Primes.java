package tuenti.challenge2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Primes {

	public static Set<Integer> getPrimes (Integer max) 
	{  
	  Map<Integer,Boolean> posiblesPrimos = new HashMap<Integer, Boolean>();	  
	  for (int i=2; i<=max; i++) posiblesPrimos.put(i, true);
	  
	  int tope = (int) Math.floor(Math.sqrt(max)) + 1;	  
	  for (int i=2; i <= tope; i++)
	  {
	    if (posiblesPrimos.get(i))
	    {
	      for (int j=i; j < max/i +1; j++) 
	        posiblesPrimos.put(j*i, false);
	    }
	  }
	  
		return damePrimos(posiblesPrimos);
	}
	
	public static Set<Integer> damePrimos(Map<Integer, Boolean> map)
	{
	  TreeSet<Integer> primos = new TreeSet<Integer>();
	  Iterator<Integer> it = map.keySet().iterator();
	  while(it.hasNext())
	  {
	    Integer key = (Integer) it.next();
	    if (map.get(key)) primos.add(key);
    }
	  
	  return primos;
	}
}
