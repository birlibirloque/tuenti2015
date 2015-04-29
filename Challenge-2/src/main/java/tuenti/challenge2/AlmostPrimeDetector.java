package tuenti.challenge2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AlmostPrimeDetector 
{
 
  public AlmostPrimeDetector() {
    super();
  }

  public int numberOfAlmostPrimesBetween2(int i, int j) 
  {
    Set<Integer> primos = Primes.getPrimes(j);
    Map<Integer,Integer> claves = new HashMap<Integer, Integer>();
    for (int k=i; k<=j; k++) claves.put(k, 0);
    
    int tope = (int) Math.floor(Math.sqrt(j)) + 1;
    Iterator<Integer> it =  claves.keySet().iterator();
    while(it.hasNext())
    {
      Integer key = (Integer) it.next();
      for (int d=2; d <= tope; d++)
      {
        if (key > d) 
        {
          if (key % d == 0)
          {
            int r = key / d;
            if (primos.contains(d) && primos.contains(r)) 
            {
              Integer valor = claves.get(key);
              claves.put(key,++valor);
            }
          }
        }
        else
          break;
      }
    }
    
    return contarCasiPrimos(claves);
  }
   
  public int numberOfAlmostPrimesBetween(int i, int j) 
  {
    Set<Integer> primos = Primes.getPrimes(j);
    Map<Integer,Integer> claves = new HashMap<Integer, Integer>();
    for (int k=i; k<=j; k++) claves.put(k, 0);
    int tope = (int) Math.floor(Math.sqrt(j)) + 1;
    
    for (int d=2; d < tope; d++)
    {
      int m = i/d;      
      if(m < 2)
         m = 2;
      int key = d*m;
      while(key <= j)
      {
        if(claves.containsKey(key))
        {
          Integer valor = claves.get(key);
          if (primos.contains(m) && primos.contains(d))
          {          
            claves.put(key,++valor);
          }
          else
          {
            claves.put(key,valor+3);
          }
        }
        m++;
        key = d*m;
      }
   }
  
   return contarCasiPrimos(claves);
 }
 
 private int contarCasiPrimos(Map<Integer, Integer> map)
  { 
   Integer contador = 0;
   
   Iterator<Integer> it = map.keySet().iterator();
   while(it.hasNext())
   {
     Integer key = (Integer) it.next();
     Integer valor = map.get(key);
     if (valor >= 1 && valor <= 2) contador++;
   }
   return contador;
  }
}