package com.naos.tuenti.challenge1;

import org.junit.Assert;
import org.junit.Test;

import com.naos.tuenti.challange1.Urinary;

public class TestUrinary
{  
  @Test
  public void testMen1Wall()
  {
    Urinary u = new Urinary();
    u.setWalls(1);
    long men = u.getSimultaneosMen();
    Assert.assertEquals(1, men);
  }
  
  @Test
  public void testMen2Wall()
  {
    Urinary u = new Urinary();
    u.setWalls(2);
    long  men = u.getSimultaneosMen();
    Assert.assertEquals(1, men);
  }
  
  @Test
  public void testMen5Wall()
  {
    Urinary u = new Urinary();
    u.setWalls(5);
    long men = u.getSimultaneosMen();
    Assert.assertEquals(3, men);
  }
  
  @Test
  public void testMen7Wall()
  {
    Urinary u = new Urinary();
    u.setWalls(7);
    long men = u.getSimultaneosMen();
    Assert.assertEquals(4, men);
  }
}
