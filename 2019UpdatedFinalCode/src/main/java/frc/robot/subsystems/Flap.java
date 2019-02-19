/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import frc.robot.commands.*;


public class Flap extends Subsystem {
  private PWMVictorSPX motor1 = new PWMVictorSPX(RobotMap.HATCHMOTOR);
  @Override
  protected void initDefaultCommand() {
    // Set the default command for a subsystem here.

    //0 does nothing but it keeps running the command
   // setDefaultCommand(new MoveFlap(0));
  }
  public void erect(){
      motor1.set(-0.5);
  }
  public void flaccid(){
      motor1.set(0.5);
  }
  public void stop(){
      motor1.set(0);
  }

  public void setPower(double power){
      motor1.set(power);
  }
}
