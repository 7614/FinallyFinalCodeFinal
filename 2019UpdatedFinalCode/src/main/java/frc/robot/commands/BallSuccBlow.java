package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Now using analog technology!
 */
public class BallSuccBlow extends Command {

    double dir;

    /**
     * @param dir double in [-1,1], I hope. No error checking.
     */
    public BallSuccBlow(double dir){
        requires(Robot.ballIntake);
        this.dir = dir;
    }

    @Override
    protected void execute(){
    }
    
    @Override
    protected boolean isFinished() {
        return true;
    }
}
