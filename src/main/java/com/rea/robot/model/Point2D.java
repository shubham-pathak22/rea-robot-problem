package com.rea.robot.model;

public abstract class Point2D
{

  protected Point2D()
  {
  }

  /**
   * Returns the X coordinate in double precision
   * 
   * @return X coordinate
   */
  public abstract double getX();

  /**
   * Returns the Y coordinate in double precision
   * 
   * @return Y coordinate
   */
  public abstract double getY();

  /**
   * Sets the location of this point to specified double coordinates
   * 
   * @param x
   *          new X coordinate
   * @param y
   *          new Y coordinate
   */
  public abstract void setLocation(double x, double y);

  /**
   * Sets the location to the same coordinates as specified in Point2D object
   * 
   * @param point2D
   *          the specified Point2D to which to set this Point2D
   */
  public void setLocation(Point2D point2D)
  {
    setLocation(point2D.getX(), point2D.getY());
  }

  @Override
  public String toString()
  {
    return "Point2D [getX()=" + getX() + ", getY()=" + getY() + "]";
  }

}
