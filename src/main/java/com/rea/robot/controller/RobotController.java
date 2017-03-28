package com.rea.robot.controller;

import com.rea.robot.exception.InvalidPositionException;
import com.rea.robot.model.Command;
import com.rea.robot.model.Position;
import com.rea.robot.model.Robot;
import com.rea.robot.model.TableTop;

/**
 * 
 *
 */
public class RobotController
{

  private TableTop tableTop;
  private Robot robot;

  public RobotController(TableTop tableTop, Robot robot)
  {
    this.tableTop = tableTop;
    this.robot = robot;
  }

  /**
   * Executes a command 
   * @param command Command
   * @param args Other arguments as required by for execution
   * @throws InvalidPositionException
   */
  public void executeCommand(Command command, Object... args) throws InvalidPositionException
  {
    switch (command) {
      case PLACE:
        if (this.tableTop.isValidPosition((Position)args[0])) {
          this.robot.place((Position)args[0]);
        } else {
          throw new InvalidPositionException();
        }
        break;
      case MOVE:
        if (this.tableTop.isValidPosition(this.robot.getNextPosition())) {
          this.robot.move();
        } else {
          throw new InvalidPositionException();
        }
        break;

      case LEFT:
        this.robot.turnLeft();
        break;
      case RIGHT:
        this.robot.turnRight();
        break;
      case REPORT:
        System.out.println(this.robot.reportPosition());
        break;
    }
  }

}
