package frc.robot.commands;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
public class BallSuccBlow extends Command{

    int succBlowMode;

    /**
     * backk suck
     * @param mode hi
     */
    public BallSuccBlow(int mode){
        requires(Robot.ballIntake);
        this.succBlowMode=mode;
    }

    @Override
    protected void execute(){
        
        if(this.succBlowMode==1){
            Robot.ballIntake.forwardMotor();
            System.out.println("BallSUccForward");
       
        }else if(this.succBlowMode==-1){
         
            Robot.ballIntake.backwardMotor();
            System.out.println("BallSuccBackward");
        }
    }

    @Override
    protected boolean isFinished() {
        return true;
    }
}
