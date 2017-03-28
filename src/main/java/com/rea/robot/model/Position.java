package com.rea.robot.model;

public class Position
{

  private Point point;
  private Direction direction;

  /**
   * Constructs a new Position object with Point(0,0) and Direction.North
   */
  public Position()
  {
    this.point = new Point();
    this.direction = Direction.NORTH;
  }

  /**
   * Constructs a new Position object with given point and direction
   * 
   * @param point
   *          point with which the position is initialized
   * @param direction
   *          direction in which the object is facing initially
   */
  public Position(Point point, Direction direction)
  {
    this.point = point;
    this.direction = direction;
  }

  public Point getPoint()
  {
    return point;
  }

  public void setPoint(Point point)
  {
    this.point = point;
  }

  public Direction getDirection()
  {
    return direction;
  }

  public void setDirection(Direction direction)
  {
    this.direction = direction;
  }

  /**
   * Changes current position of the object to the given point and direction
   * 
   * @param point
   *          new point of the object
   * @param direction
   *          new direction of the object
   */
  public void changeToPosition(Point point, Direction direction)
  {
    this.point = point;
    this.direction = direction;

  }

  public void changeByPosition(Point point)
  {
    this.point.setLocation(this.getPoint().getX() + point.getX(), this.getPoint().getY() + point.getY());
  }

  /**
   * Changes the current position of the object to given point keeping the
   * direction same
   * 
   * @param point
   *          new point of the object
   */
  public void changeToPosition(Point point)
  {
    this.point = point;
  }

}
