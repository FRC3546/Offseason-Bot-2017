package org.usfirst.frc.team3546.robot.subsystems;

import org.usfirst.frc.team3546.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	private final RobotDrive driveTrainMotors = RobotMap.driveTrainMotors;

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		//left blank
	}
	public void stop(){
		driveTrainMotors.tankDrive(0, 0);
	}
	public void takeJoystickInputs(Joystick leftJoystick, Joystick rightJoystick){
		driveTrainMotors.tankDrive(leftJoystick, rightJoystick);
	}
	
}
