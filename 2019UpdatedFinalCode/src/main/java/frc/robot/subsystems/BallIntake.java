package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.BallSuccBlow;

public class BallIntake extends Subsystem{
    private PWMVictorSPX motor = new PWMVictorSPX(RobotMap.BALLINTAKE);

    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new BallSuccBlow(motor));
    }

    public void setMotor(double power){
        motor.set(power);
    }
    
    public void kill(){
        // TODO: Why is this twice?
        motor.set(0);
        motor.set(0);
    }
}