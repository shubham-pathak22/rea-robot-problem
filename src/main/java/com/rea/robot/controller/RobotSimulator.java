package com.rea.robot.controller;

import java.util.Scanner;

import com.rea.robot.exception.InvalidArgumentsException;
import com.rea.robot.exception.InvalidPositionException;
import com.rea.robot.model.Command;
import com.rea.robot.model.Direction;
import com.rea.robot.model.Point;
import com.rea.robot.model.Position;
import com.rea.robot.model.Robot;
import com.rea.robot.model.SquareTableTop;
import com.rea.robot.model.TableTop;

/**
 * Main class to simulate the robot
 *
 */
public class RobotSimulator
{

  public static void main(String[] args)
  {

    Scanner in;
    in = new Scanner(System.in);

    TableTop squareBoard = new SquareTableTop(4, 4);
    Robot robot = new Robot();
    RobotController robotController = new RobotController(squareBoard, robot);

    System.out.println("Robot Simulator");
    System.out.println("Please Enter a command, Valid commands are:");
    System.out.println("\'PLACE X,Y,NORTH|SOUTH|EAST|WEST\', MOVE, LEFT, RIGHT, REPORT or EXIT");

    boolean keepRunning = true;
    boolean isRobotPlaced = false;
    while (keepRunning) {
      String inputString = in.nextLine();
      if ("EXIT".equals(inputString)) {
        keepRunning = false;
      } else {
        String[] tuple = inputString.split(" ");
        try {
          Command command = Command.valueOf(tuple[0]);
          switch (command) {
            case PLACE:
              if (tuple.length < 2) {
                throw new InvalidArgumentsException();
              }
              String[] place_tuple = tuple[1].split(",");
              if (place_tuple.length < 3) {
                throw new InvalidArgumentsException();
              }
              int x = Integer.parseInt(place_tuple[0]);
              int y = Integer.parseInt(place_tuple[1]);
              Direction direction = Direction.valueOf(place_tuple[2]);
              Position p = new Position(new Point(x, y), direction);
              robotController.executeCommand(command, p);
              isRobotPlaced = true;
              break;

            default:
              if (isRobotPlaced) {
                robotController.executeCommand(command);
              }
              break;
          }

        } catch (NumberFormatException e) {
          System.out.println("Please check the co-ordinates value");
        } catch (IllegalArgumentException e) {
          System.out.println("Please verify if command is a valid command");
        } catch (InvalidArgumentsException e) {
          System.out.println(e.getMessage());
        } catch (InvalidPositionException e) {
          System.out.println(e.getMessage());
        }
      }
    }
    in.close();
  }

}
