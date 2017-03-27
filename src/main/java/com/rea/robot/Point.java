package com.rea.robot;

/**
 * A point representing a location in (x,y) coordinate space, specified in
 * integer position
 *
 */
public class Point extends Point2D
{

  private int x;
  private int y;

  /**
   * Constructs and initializes Point at (0,0) position
   */
  public Point()
  {
    this(0, 0);
  }

  /**
   * Constructs a Point using specified coordinates
   * 
   * @param x
   *          X coordinate of the point specified as integer
   * @param y
   *          Y coordinate of the point specified as integer
   */
  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Constructs and initializes a Point with same location as specified Point
   * object
   * 
   * @param p
   */
  public Point(Point p)
  {
    this(p.x, p.y);
  }

  @Override
  public double getX()
  {
    return x;
  }

  @Override
  public double getY()
  {
    return y;
  }

  @Override
  public void setLocation(double x, double y)
  {
    this.x = (int)Math.floor(x + 0.5);
    this.y = (int)Math.floor(y + 0.5);
  }

  /**
   * Sets the location of this point to specified integer coordinates
   * 
   * @param x
   *          the x coordinate specified as integer
   * @param y
   *          the y coordinate specified as integer
   */
  public void setLocation(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString()
  {
    return "Point [x=" + x + ", y=" + y + "]";
  }

}
