package com.rea.robot;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest
{

  @Test
  public void testNoArgumentPosition()
  {
    Position position = new Position();
    Point point = new Point();
    assertEquals(point.getX(), position.getPoint().getX(), 0);
    assertEquals(point.getY(), position.getPoint().getY(), 0);
    assertEquals(Direction.NORTH, position.getDirection());
  }

  @Test
  public void testChangePoint()
  {
    Position position = new Position(new Point(1, 2), Direction.NORTH);
    position.changeToPosition(new Point(3, 2));
    assertEquals(3, position.getPoint().getX(), 0);
    assertEquals(2, position.getPoint().getY(), 0);
    assertEquals(Direction.NORTH, position.getDirection());
  }

  @Test
  public void testChangePosition()
  {
    Position position = new Position(new Point(1, 2), Direction.NORTH);
    position.changeToPosition(new Point(3, 2), Direction.EAST);
    assertEquals(3, position.getPoint().getX(), 0);
    assertEquals(2, position.getPoint().getY(), 0);
    assertEquals(Direction.EAST, position.getDirection());
  }

}
