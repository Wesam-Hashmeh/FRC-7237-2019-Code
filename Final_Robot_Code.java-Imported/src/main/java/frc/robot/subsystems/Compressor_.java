package frc.robot.subsystems;

import frc.robot.commands.Compress;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.*;

public class Compressor_ extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Compressor compress = new Compressor();
  public void Compress(){
    compress.setClosedLoopControl(true);
  }
  public void Stop_Compress(){
    compress.setClosedLoopControl(false);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Compress());
  } 
}
