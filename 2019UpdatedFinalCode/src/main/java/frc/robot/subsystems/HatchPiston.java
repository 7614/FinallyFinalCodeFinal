package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class HatchPiston extends Subsystem {
  // Initialize Solenoid objects (each individual piston)
  Solenoid sol1 = new Solenoid(RobotMap.SOL1);
  Solenoid sol2 = new Solenoid(RobotMap.SOL2); // Solenoid ID values assumed; may be different

  @Override
  public void initDefaultCommand() {
    sol1.setPulseDuration(0.5);
  }

  public void pushHatch() {
    sol1.startPulse();
  }
}
