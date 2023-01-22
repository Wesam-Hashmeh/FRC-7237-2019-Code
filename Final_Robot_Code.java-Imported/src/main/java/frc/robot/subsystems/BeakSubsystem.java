package frc.robot.subsystems;

import frc.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BeakSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Spark beakMotor = new Spark(RobotMap.beakMotor);
	DoubleSolenoid sole = new DoubleSolenoid (RobotMap.vPCM,RobotMap.vSolenoidOpen,RobotMap.vSolenoidClose);
	public void beakLift() {
		beakMotor.set(0.5);
	}
	public void beakLower() {
		beakMotor.set(-0.5);
	}

	public void beakStop() {
		beakMotor.set(0);
	}
	public void beakForward(){
		sole.set(Value.kForward);
	}
	public void beakReverse(){
		sole.set(Value.kReverse);
	}
	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new OpenBeak());
	}
}