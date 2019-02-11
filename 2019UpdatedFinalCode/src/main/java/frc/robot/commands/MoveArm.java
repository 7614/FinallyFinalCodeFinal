package frc.robot.commands;

import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.PIDInterface;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.PIDCommand;
import frc.robot.*;
import frc.robot.commands.*;

/**
 *
 */
public class MoveArm extends Command {

    //direction that the angle will move towards;
    int angleMoveDir;
   
    public MoveArm(int angleMoveDir) {
        this.angleMoveDir=angleMoveDir;
        requires(Robot.arm);
        requires(Robot.potentiometer);
        
        setTimeout(.9);
    }


   
    protected void initialize() {
        // setAngle = Robot.arm.targetAngle;
        // currentAngle =0;
        // deltaAngle =0;
        // deltaAngleRate=0;
        // speed=0;
        // lastDeltaAngle=0;

    }

    protected void execute() {
        Robot.arm.targetAngle+=this.angleMoveDir;
        armControl();
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        Robot.arm.stopElbow();
        Robot.arm.stopShoulder();
        Robot.arm.stopWrist();
    }

    //THIS NEEDS TESTING
    // final static double INTERVAL = 0.02;
    // final static double KP=0.5;
    // final static double KI=0.5;
    // private double setAngle;
    // private double currentAngle;
    // private double deltaAngle;
    // private double deltaAngleRate;
    // private double speed;
    // private double lastDeltaAngle;

    // public double ShoulderPID(){
         
    //      currentAngle = Robot.potentiometer.getShoulderRotDegrees();
    //      deltaAngle = currentAngle - setAngle;
    //      deltaAngleRate = (deltaAngle - lastDeltaAngle)/INTERVAL;
    //      speed = KP * deltaAngle + KI * deltaAngleRate;
    //      lastDeltaAngle=currentAngle;
    //      return speed;
    // }
    

    public void armControl() {
        //PID MIGHT BE REQUIRED LOL


        // if((Robot.potentiometer.getShoulderRotDegrees()<Robot.arm.targetAngle)&&(!Robot.limitSwitch.shoulderIsMax())){
        //     Robot.arm.moveShoulder(1);
        // }else if(Robot.potentiometer.getShoulderRotDegrees()>Robot.arm.targetAngle){
        //     Robot.arm.moveShoulder(-1);
        // }

        // if((Robot.potentiometer.getElbowRotDegrees()<Robot.arm.targetAngle)&&(!Robot.limitSwitch.elbowisMax())){
        //     Robot.arm.moveElbow(1);
        // }else if(Robot.potentiometer.getElbowRotDegrees()>Robot.arm.targetAngle){
        //     Robot.arm.moveElbow(-1);
        // }


    }

    protected void interrupted() {
        end();
    }
}