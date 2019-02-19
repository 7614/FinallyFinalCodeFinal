package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Analog version of BallSuccBlow.
 */
public class BallSuccBlow extends Command{

    double dir;

    /**
     * backk suck
     * @param mode hi
     */
    public BallSuccBlow(double dir){
        requires(Robot.ballIntake);
        this.dir = dir;
    }

    @Override
    protected void execute(){
        Robot.ballIntake.setMotor(dir);
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
