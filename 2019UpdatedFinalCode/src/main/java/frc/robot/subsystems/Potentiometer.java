/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.AnalogPotentiometer;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class Potentiometer extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    AnalogPotentiometer shoulderPot;
    AnalogPotentiometer elbowPot;
    AnalogPotentiometer wristPot;

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.

        /*
         * It's worth noting that an AnalogPotentiometer's get() method does not return
         * an angle when it is setup like we have set it up above. Rather, it just
         * returns the value of that Potentiometer's analog input. Usually this value
         * ranges from 0 - 5ish. You actually can setup a potentiometer to return an
         * angle, but you need to use a different constructor. Measure the analog value
         * of your potentiometer when it is at full range. You can then use this
         * constructor which will make the get() method scale its output to the appriate
         * degree value:
         */


        shoulderPot = new AnalogPotentiometer(RobotMap.SHOULDERPOTENTIOMETER,360);
        elbowPot = new AnalogPotentiometer(RobotMap.SHOULDERPOTENTIOMETER,360);
        wristPot = new AnalogPotentiometer(RobotMap.SHOULDERPOTENTIOMETER,360);
        // setDefaultCommand(new MySpecialCommand());

    }

    public double getShoulderRotDegrees() {
        return shoulderPot.get();
    }

    public double getElbowRotDegrees() {
        return elbowPot.get();
    }

    public double getWristRotDegrees() {
        return wristPot.get();
    }

}
