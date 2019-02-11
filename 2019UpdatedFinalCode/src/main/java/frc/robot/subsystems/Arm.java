package frc.robot.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.MoveArm;

import edu.wpi.first.wpilibj.PWMVictorSPX;


public class Arm extends Subsystem {

   // initialize arm motors
   private PWMVictorSPX wrist = new PWMVictorSPX(RobotMap.WRISTMOTOR);
   private PWMVictorSPX elbow = new PWMVictorSPX(RobotMap.ELBOWMOTOR);
   private PWMVictorSPX shoulder = new PWMVictorSPX(RobotMap.SHOULDERMOTOR);

   public double targetAngle;
   final public static double ARMSPEED = 1;

   public void initDefaultCommand() {
      setDefaultCommand(new MoveArm(0));
   }

   public void moveShoulder(double speed) {
      shoulder.set(speed * ARMSPEED);
   }

   public void stopShoulder() {
      shoulder.set(0);
   }

  
   public void moveElbow(double speed) {
      elbow.set(speed * ARMSPEED);
   }

   public void stopElbow() {
      elbow.set(0);
   }

   public void moveWrist(double speed) {
      wrist.set(speed * ARMSPEED);
      
   }

   public void stopWrist() {
      wrist.set(0);
   }

   

   
   

   // how to tell arm to move based on joystick??
}