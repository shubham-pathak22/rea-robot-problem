package com.rea.robot.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SquareTableTopTest
{

  @Test
  public void validPositionTest()
  {
    SquareTableTop top = new SquareTableTop(5, 5);
    Position validPosition = new Position(new Point(1, 2), Direction.NORTH);
    assertTrue(top.isValidPosition(validPosition));
  }

  @Test
  public void invalidPositionTest1()
  {
    SquareTableTop top = new SquareTableTop(5, 5);
    Position invalidPosition = new Position(new Point(6, 6), Direction.NORTH);
    assertFalse(top.isValidPosition(invalidPosition));
  }

  @Test
  public void invalidPositionTest2()
  {
    SquareTableTop top = new SquareTableTop(5, 5);
    Position invalidPosition = new Position(new Point(-1, -1), Direction.NORTH);
    assertFalse(top.isValidPosition(invalidPosition));
  }

  @Test
  public void invalidPositionTest3()
  {
    SquareTableTop top = new SquareTableTop(5, 5);
    Position invalidPosition = new Position(new Point(-1, 4), Direction.NORTH);
    assertFalse(top.isValidPosition(invalidPosition));
  }

  @Test
  public void invalidPositionTest4()
  {
    SquareTableTop top = new SquareTableTop(5, 5);
    Position invalidPosition = new Position(new Point(4, -1), Direction.NORTH);
    assertFalse(top.isValidPosition(invalidPosition));
  }

}
