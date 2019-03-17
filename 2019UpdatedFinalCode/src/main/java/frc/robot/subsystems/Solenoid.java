/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.*;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Solenoid extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    DoubleSolenoid pistonSolenoid = new DoubleSolenoid(2, 4);

    @Override
    public void initDefaultCommand() {
        
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public void pistonPush(){
        pistonSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void pistonRetract(){
        pistonSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void pistonStop(){
        pistonSolenoid.set(DoubleSolenoid.Value.kOff);
    }

   



}
