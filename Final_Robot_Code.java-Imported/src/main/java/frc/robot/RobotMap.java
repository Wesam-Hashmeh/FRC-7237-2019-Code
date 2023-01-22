package frc.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// drivebase spark ports
	public static int tLeft = 0;
	public static int tRight = 1;
	public static int bLeft = 2;
	public static int bRight = 3;
	//drivebase victor ports
	public static int vLeft = 1;
	public static int vRight = 2;
	// beak arm spark port
	public static int beakMotor = 4;
	// Wheel arm intake motor
	public static int wheelMotor = 6;
	// Solenoid (Pistons)
	public static int vPCM = 1;
	public static int vSolenoidOpen = 0;
	public static int vSolenoidClose = 7;	
}