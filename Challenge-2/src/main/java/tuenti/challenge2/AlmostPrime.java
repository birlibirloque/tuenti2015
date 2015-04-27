package tuenti.challenge2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AlmostPrime {

	public static void main(String[] args) {
    try 
    {
      AlmostPrimeDetector almostPimeDetector = new AlmostPrimeDetector();

      FileReader fr = new FileReader("src/test/resources/sample.txt");
      FileWriter writer = new FileWriter("src/test/resources/output.txt");
      BufferedReader reader = new BufferedReader(fr);
 
 
    	Integer min = new Integer(0);
    	Integer max = new Integer(0);
      String linea = reader.readLine();
      while((linea = reader.readLine()) != null)
      {
      	min = Integer.valueOf(linea.split(" ")[0]);
      	max = Integer.valueOf(linea.split(" ")[1]);
      	
        almostPimeDetector.setPrimes(Primes.getPrimes(max));
        
        Integer numberOfAlmostPrimes = almostPimeDetector.numberOfAlmostPrimesBetween(min, max);

        writer.write(numberOfAlmostPrimes.toString() + "\n");
        System.out.println(numberOfAlmostPrimes);
      }
 
      reader.close();
      writer.close();
    }
    catch(Exception e)
    {
      System.out.println("Excepcion leyendo fichero "+ e);
    }
	}

}
