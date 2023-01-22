package frc.robot.commands;

import frc.robot.*;
import edu.wpi.first.wpilibj.command.Command;

public class arcDrive extends Command {
	
	public arcDrive() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.drivebase);
	}
	@Override
	// Called just before this Command runs the first time
	protected void initialize() {
	}
	@Override
	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double left = Robot.oi.stick.getRawAxis(3)+(.5*Robot.oi.stick.getRawAxis(0))-Robot.oi.stick.getRawAxis(2);
		double right = Robot.oi.stick.getRawAxis(3)-(.5*Robot.oi.stick.getRawAxis(0))-Robot.oi.stick.getRawAxis(2);
		//double sens = (Robot.oi.stick.getThrottle() + 1) / 2;
		Robot.drivebase.teleopDrive(left , right);
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
	}
}