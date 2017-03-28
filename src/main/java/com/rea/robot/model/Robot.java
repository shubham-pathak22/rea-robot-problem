package com.rea.robot.model;

public class Robot
{

  private Position position;

  public Robot()
  {
    this.position = new Position();
  }

  /**
   * Returns current position of the robot
   * 
   * @return Current position of the robot
   */
  public Position getCurrentPosition()
  {
    return this.position;
  }

  public void place(Position position)
  {
    this.position = position;
  }

  /**
   * Move the robot by 1 unit in the same direction it is facing
   */
  public void move()
  {
    this.position = changePosition(this.position);
  }

  /**
   * Get the next position if move() is called
   * 
   * @return nextPosition that the robot would move to if move() is called
   */
  public Position getNextPosition()
  {
    return changePosition(
        new Position(new Point(this.getCurrentPosition().getPoint()), this.getCurrentPosition().getDirection()));
  }

  private Position changePosition(Position position)
  {

    switch (position.getDirection()) {
      case NORTH:
        position.changeByPosition(new Point(0, 1));
        break;

      case EAST:
        position.changeByPosition(new Point(1, 0));
        break;
      case SOUTH:
        position.changeByPosition(new Point(0, -1));
        break;
      case WEST:
        position.changeByPosition(new Point(-1, 0));
        break;
      default:
        break;
    }
    return position;

  }

  /**
   * Turn the robot to its left
   */
  public void turnLeft()
  {
    this.position.setDirection(this.position.getDirection().leftDirection());
  }

  /**
   * Turn the robot to its right
   */
  public void turnRight()
  {
    this.position.setDirection(this.position.getDirection().rightDirection());
  }

  /**
   * Report Position of the ROBOT in the format X,Y,Direction
   * 
   * @return String specifying co-ordinates and direction
   */
  public String reportPosition()
  {
    return "" + (int)this.position.getPoint().getX() + "," + (int)this.position.getPoint().getY() + ","
        + this.position.getDirection();
  }

}
