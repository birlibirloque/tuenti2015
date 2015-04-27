package com.naos.tuenti.challange1;

public class Urinary
{
  private long walls;

  public long getWalls()
  {
    return walls;
  }

  public void setWalls(long walls)
  {
    this.walls = walls;
  }

  public long getSimultaneosMen()
  {    
    return (this.walls /2) + (this.walls % 2);
  } 
}
