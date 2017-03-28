package com.rea.robot.model;

/**
 * Interface defining a TableTop
 *
 */
public interface TableTop
{

  /**
   * Method that returns whether placing the object in a given position is valid
   * 
   * @param position
   *          Position at which object will be placed
   * @return True if the position is valid. False otherwise
   */
  public boolean isValidPosition(Position position);
}
