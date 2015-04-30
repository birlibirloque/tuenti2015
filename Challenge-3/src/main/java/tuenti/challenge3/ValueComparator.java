package tuenti.challenge3;

import java.util.Comparator;
import java.util.SortedMap;

class ValueComparator implements Comparator<Integer> 
{
  SortedMap<Integer, Integer> base;
  public ValueComparator(SortedMap<Integer, Integer> base) 
  {
      this.base = base;
  }

  // Order from higher to lowest
  public int compare(Integer a, Integer b) 
  {
      if (base.get(a) > base.get(b)) 
      {
        return -1;
      } 
      else if (base.get(a) < base.get(b))
      {
        return 1;
      } 
      else if (a > b)
      {
        return 1;
      }
      else
        return -1;
  }
}