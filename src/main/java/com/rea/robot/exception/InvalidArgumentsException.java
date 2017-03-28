package com.rea.robot.exception;

public class InvalidArgumentsException extends Exception
{

  public InvalidArgumentsException()
  {
    super("Incorrect number of arguments for given command");
  }

}
