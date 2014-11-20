// A Point object represents a pair of (x, y) integer coordinates.
// Reference Building Java Programs pp 505-517
import java.lang.*;
public class Point
{
  int x;
  int y;
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public String toString()
  {
    String a=(Integer.toString(x)+", "+Integer.toString(y));
    return a;
  }
  public double distanceFromOrigin()
  {
    double a=x*x+y*y;
    return Math.sqrt(a);
  }
  public double distance (int t, int z)
  {
    return Math.sqrt((x-t)*(x-t)+(y-z)*(y-z));
  }
  public void setX (int a)
  {
    x=a;
  }
  public void setY (int a)
  {
    y=a;
  }
  public void translate (int t, int z)
  {
    x+=t;
    y+=z;
  }
}
