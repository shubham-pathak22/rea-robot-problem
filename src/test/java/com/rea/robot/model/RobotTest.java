package com.rea.robot.model;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest
{

  @Test
  public void testBasic()
  {
    Robot robot = new Robot();
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getX(), 0);
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getY(), 0);
    Assert.assertEquals(Direction.NORTH, robot.getCurrentPosition().getDirection());
  }

  @Test
  public void testPlace()
  {
    Robot robot = new Robot();
    robot.place(new Position(new Point(4, 5), Direction.EAST));
    Assert.assertEquals(4, robot.getCurrentPosition().getPoint().getX(), 0);
    Assert.assertEquals(5, robot.getCurrentPosition().getPoint().getY(), 0);
    Assert.assertEquals(Direction.EAST, robot.getCurrentPosition().getDirection());

  }

  @Test
  public void testMove()
  {
    Robot robot = new Robot();
    robot.move();
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getX(), 0);
    Assert.assertEquals(1, robot.getCurrentPosition().getPoint().getY(), 0);
    Assert.assertEquals(Direction.NORTH, robot.getCurrentPosition().getDirection().NORTH);

  }

  @Test
  public void testTurnLeft()
  {
    Robot robot = new Robot();
    robot.turnLeft();
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getX(), 0);
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getY(), 0);
    Assert.assertEquals(Direction.WEST, robot.getCurrentPosition().getDirection());

  }

  @Test
  public void testTurnRight()
  {
    Robot robot = new Robot();
    robot.turnRight();
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getX(), 0);
    Assert.assertEquals(0, robot.getCurrentPosition().getPoint().getY(), 0);
    Assert.assertEquals(Direction.EAST, robot.getCurrentPosition().getDirection());

  }

  @Test
  public void testReport()
  {
    Robot robot = new Robot();
    String report = robot.reportPosition();
    Assert.assertEquals("0,0,NORTH", report);
  }

}
