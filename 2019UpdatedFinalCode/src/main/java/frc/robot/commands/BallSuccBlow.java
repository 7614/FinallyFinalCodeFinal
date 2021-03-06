package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.PWMSpeedController;

/**
 * Now using analog technology!
 */
public class BallSuccBlow extends Command {

    PWMSpeedController motor;

    public static double DEFANG = 1.5;

    /**
     * @param dir double in [-1,1], I hope. No error checking.
     */
    public BallSuccBlow(PWMSpeedController motor){
        requires(Robot.ballIntake);
        this.motor = motor;
    }

    @Override
    protected void execute(){
        final double DEADZONE = 0.00;

        double right = Robot.m_oi.getRightTrigger();
        double left  = Robot.m_oi.getLeftTrigger();
        
        right = Math.pow(right,1);
        left = Math.pow(left,1);

        if(right < DEADZONE) right = 0;
        if(left  < DEADZONE) left = 0;
        
        double power = (left - right)*2;

        

        power /= DEFANG;

        // clamp into [-1,1]
        // https://stackoverflow.com/questions/16656651/
        power = Math.max(Math.min(power ,1),-1);

        motor.set(power);
    }
    
    @Override
    protected boolean isFinished() {
        return false;
    }
}
