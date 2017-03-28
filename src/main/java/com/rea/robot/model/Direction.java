package com.rea.robot.model;

/**
 * 
 * Direction to which the object is facing namely (NORTH, EAST, SOUTH, WEST)
 */
public enum Direction
{
  NORTH(0), EAST(1), SOUTH(2), WEST(3);

  private int directionVal;

  private static final int MAX_DIRECTIONS = 4;

  private static Direction[] directions = new Direction[MAX_DIRECTIONS];

  static {
    int i = 0;
    for (Direction directionEnum : Direction.values()) {
      directions[i++] = directionEnum;
    }
  }

  private Direction(int directionVal)
  {
    this.directionVal = directionVal;

  }

  /**
   * 
   * @return current Direction
   */
  public Direction getCurrentDirection()
  {
    return directions[this.directionVal];
  }

  /**
   * 
   * @return Direction to the left of current one
   */
  public Direction leftDirection()
  {
    return rotate(-1);
  }

  /**
   * 
   * @return Direction to the right of current one
   */
  public Direction rightDirection()
  {
    return rotate(1);
  }

  private Direction rotate(int i)
  {
    int newIndex = (this.directionVal + i + MAX_DIRECTIONS) % MAX_DIRECTIONS;
    return directions[newIndex];
  }

}
