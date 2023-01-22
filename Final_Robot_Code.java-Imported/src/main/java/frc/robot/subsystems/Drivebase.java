package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.arcDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

public class Drivebase extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	//Spark topLeft = new Spark(RobotMap.tLeft);
	//Spark topRight = new Spark(RobotMap.tRight);
	//Spark bottomRight = new Spark(RobotMap.bRight);
	//Spark bottomLeft = new Spark(RobotMap.bLeft);
	//SpeedControllerGroup left = new SpeedControllerGroup(topLeft,bottomLeft);
	//SpeedControllerGroup right = new SpeedControllerGroup(topRight,bottomRight);
	//DifferentialDrive drive = new DifferentialDrive(left, right);
	VictorSPX left_Spx = new VictorSPX(RobotMap.vLeft);
	VictorSPX right_Spx = new VictorSPX(RobotMap.vRight);
	//DifferentialDrive drive = new DifferentialDrive(left,right);
	public void teleopDrive(double left, double right) {
	//	drive.arcadeDrive(move, turn);
	right_Spx.set(ControlMode.PercentOutput, right);
	left_Spx.set(ControlMode.PercentOutput, left);
	}
	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		setDefaultCommand(new arcDrive());
	}
}