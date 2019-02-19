/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * An example command. You can replace me with your own command.
 */
public class MoveFlap extends Command {
  int moveDir;

  public MoveFlap(int direction) {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.flap);
    this.moveDir = direction;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    // If the forward limit switch is pressed, we want to keep the values between -1
    // and 0
    // if (Robot.flapLimitSwitch.flapUpperLimitSwitch.get()) {
    //   moveDir = Math.min(moveDir, 0);
    // }
    // // If the reversed limit switch is pressed, we want to keep the values between 0
    // // and 1
    // else if (Robot.flapLimitSwitch.flapLowerLimitSwitch.get()) {
    //   moveDir = Math.max(moveDir, 0);
    // }
    switch (moveDir) {
    case 1:
      Robot.flap.erect();
      break;
    case -1:
      Robot.flap.flaccid();
      break;
    case 0:
      Robot.flap.stop();
      break;
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
  return true;
 }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
