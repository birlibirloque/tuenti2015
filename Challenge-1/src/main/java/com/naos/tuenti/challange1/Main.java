package com.naos.tuenti.challange1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main
{
  public static void main(String[] args)
  {
    new Main();
  }
  
  private Main()
  {    
    try 
    {
      Urinary urinary = new Urinary();     
      FileReader fr = new FileReader("src/test/resources/sample.txt");
      FileWriter writer = new FileWriter("src/test/resources/output.txt");
      BufferedReader reader = new BufferedReader(fr);
 
 
      String linea = reader.readLine();
      while((linea = reader.readLine()) != null)
      {
        urinary.setWalls(Long.parseLong(linea));
        writer.write(Long.toString(urinary.getSimultaneosMen()) + "\n");
        System.out.println(urinary.getSimultaneosMen());
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
