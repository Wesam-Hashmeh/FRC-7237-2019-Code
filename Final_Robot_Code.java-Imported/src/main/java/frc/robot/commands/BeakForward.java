package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class BeakForward extends Command {
  public BeakForward() {
    // Use requires() here to declare subsystem dependencies
     requires(Robot.beak);
  }
  @Override
  // Called just before this Command runs the first time
	protected void initialize() {
	}
  @Override
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.beak.beakForward();
	}
  @Override
	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}
  @Override
	// Called once after isFinished returns true
	protected void end() {
	}
  @Override
	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
