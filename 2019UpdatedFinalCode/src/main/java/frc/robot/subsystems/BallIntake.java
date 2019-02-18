package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
public class BallIntake extends Subsystem{
    private PWMVictorSPX motor = new PWMVictorSPX(RobotMap.BALLINTAKE);

    @Override
    protected void initDefaultCommand(){

    }
    public void forwardMotor(){
        motor.set(0.1);
    }
   
    public void backwardMotor(){
        motor.set(-0.1);
    }
   
    public void disableMotors(){
        motor.set(0);
        motor.set(0);
    }
}