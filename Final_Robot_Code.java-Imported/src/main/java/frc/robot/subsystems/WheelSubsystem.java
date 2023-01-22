package frc.robot.subsystems;

import frc.robot.*;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class WheelSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Spark wheelMotor = new Spark(RobotMap.beakMotor);
	public void wheelIntake() {
		wheelMotor.set(1);
	}
	public void wheelOutake() {
		wheelMotor.set(-1);
	}
	public void wheelStop(){
		wheelMotor.set(0);
	}
	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new WheelInput());		
	}
}