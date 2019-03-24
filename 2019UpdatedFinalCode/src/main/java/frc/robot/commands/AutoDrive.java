package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.subsystems.*;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.vision.VisionRunner;
import edu.wpi.first.vision.VisionThread;
import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;

public class AutoDrive extends Command {

    double xSpeed;
    double zRotation;
    private static final int IMG_WIDTH = 320;
    private static final int IMG_HEIGHT = 240;

    private VisionThread visionThread;
    private double centerX = 0.0;

    

    public AutoDrive() {
        // this command will interupt any other command using the drive train

        requires(Robot.driveTrain);

    }

    @Override
    protected boolean isFinished() {
        // the drive command should always be running: you should always
        // be able to push the joystick to move the robot
        return false;

    }

    @Override
    protected void execute() {
        // calls the function of the drive train, which will call an arcade drive method

        // Robot.frontCamera.setResolution(IMG_WIDTH, IMG_HEIGHT);

        // visionThread = new VisionThread(Robot.frontCamera, new SeeNehaGreenScissorPipeline(), pipeline -> {

        //     if (!pipeline.filterContoursOutput().isEmpty()) {

        //         Rect r = Imgproc.boundingRect(pipeline.filterContoursOutput().get(0));

        //         centerX = r.x + (r.width / 2);

        //     }
        // });

        // visionThread.start();
        // double turn = centerX - (IMG_WIDTH / 2);
        // Robot.driveTrain.autonomousDrive(-0.6, turn * 0.005);

    }

}
