/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  public static final int FRONTRIGHTMOTOR = 8;
  public static final int FRONTLEFTMOTOR = 1;
  public static final int BACKRIGHTMOTOR = 9;
  public static final int BACKLEFTMOTOR = 2;
  public static final int JOYSTICKPORT = 2;
  public static final int BALLINTAKE = 7;
  public static final int FLAPUPPERLIMITSWITCH = 16;
  public static final int FLAPLOWERLIMITSWITCH = 17;
  public static final int HATCHMOTOR =0;

  public class XBOX {
    public static final int BUMPER_L = 5;
    public static final int BUMPER_R = 6;
    public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4; 
  }
}
