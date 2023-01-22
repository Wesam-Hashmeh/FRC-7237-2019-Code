package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is
  public XboxController stick = new XboxController(0);
	Button buttonA = new JoystickButton(stick, 1),
		   buttonB = new JoystickButton(stick, 2),
		   buttonX = new JoystickButton(stick, 3),
		   buttonY = new JoystickButton(stick, 4),
		   buttonLShoulder = new JoystickButton(stick, 5),
		   buttonBack = new JoystickButton(stick, 7),
		   buttonStart = new JoystickButton(stick, 8);
			//button5 = new JoystickButton(stick, 5),
			//button6 = new JoystickButton(stick, 6),
			//button7 = new JoystickButton(stick, 7),
      		
      


	public OI() {
		buttonA.whileHeld(new OpenBeak());
		buttonB.whileHeld(new CloseBeak());
		buttonX.whileHeld(new WheelIntake());
		buttonY.whileHeld(new WheelIntake());
		buttonStart.whileHeld(new BeakForward());
		buttonBack.whileHeld(new BeakReverse());
		buttonLShoulder.whileHeld(new Compress());
		
		//buttonX.whenPressed(new WheelInput());
		//buttonY.whenPressed(new WheelOutput());
		//button6.whenPressed(new DriveToDistance(0.2));
		//button7.whenPressed(new SodaDelivery());
		//button8.whenPressed(new Stow());
		
		
	}
	}
	







