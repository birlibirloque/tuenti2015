package tuenti.challenge3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main
{
  private static final int FIRST_PRIMES_NUMBER = 25;
  PrimesDetector detector = new PrimesDetector();
  
  public static void main (String args[])
  {
    new Main();
  }
  
  Main()
  {
    try 
    {
      //FileReader fr = new FileReader("src/test/resources/submitInput.txt");
      FileReader fr = new FileReader("src/test/resources/sample.txt");
      FileWriter writer = new FileWriter("src/test/resources/output.txt");
      BufferedReader reader = new BufferedReader(fr);      
        
      Set<Integer> primes = Primes.getFirstPrimes(FIRST_PRIMES_NUMBER);      
            
      String linea = reader.readLine(); // num cases      
      while((linea = reader.readLine()) != null)
      {
        int initDay = Integer.valueOf(linea.split(" ")[0]);
        int endDay  = Integer.valueOf(linea.split(" ")[1]);

        detector.init(primes);
        Integer[] mostPopular = readFromRock(initDay, endDay);
        writeOutPut(mostPopular, writer);
      }
 
      reader.close();
      writer.close();
    }
    catch(Exception e)
    {
      System.out.println("Excepcion leyendo fichero "+ e);
    }
  }
  
  private Integer[] readFromRock(int start, int end)
  {
    try
    {
      FileReader fr = new FileReader("src/test/resources/numbers.txt");    
      BufferedReader rock = new BufferedReader(fr);
    
      int lineCounter = 0;
      String line = null;
      while((line = rock.readLine()) != null)
      {
        if ((start <= lineCounter) && (end > lineCounter))
        {
          detector.countMostPopular(Double.valueOf(line));
        }
        
        lineCounter++;
      }
    }
    catch (Exception e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } 
    
    return detector.getMostPopular();
  }
  
  private void writeOutPut(Integer[] mostPopular, FileWriter writer) throws IOException
  {
    for (Integer i: mostPopular)
    {
      writer.write(i + " ");
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
