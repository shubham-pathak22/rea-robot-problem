package com.rea.robot.model;

public class SquareTableTop implements TableTop
{

  private int length;
  private int width;

  public SquareTableTop(int length, int width)
  {
    this.length = length;
    this.width = width;
  }

  public boolean isValidPosition(Position position)
  {
    if (position.getPoint().getX() < 0 || position.getPoint().getX() > this.length) {
      return false;
    }
    if (position.getPoint().getY() < 0 || position.getPoint().getY() > this.width) {
      return false;
    }
    return true;
  }

}
