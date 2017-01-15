package org.usfirst.frc.team3546.robot.subsystems;

import org.usfirst.frc.team3546.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	
	private final Relay sweeperBarRotationMotor = RobotMap.ballIntakeSweeperBarRotationMotor;
	private final DoubleSolenoid sweeperBarPositionSolenoid = RobotMap.ballIntakeSweeperBarPositionSolenoid;
	
	public static final DoubleSolenoid.Value ARM_UP = DoubleSolenoid.Value.kForward;
	public static final DoubleSolenoid.Value ARM_DOWN = DoubleSolenoid.Value.kReverse;


public void sweeperBarIn () { sweeperBarRotationMotor.set(Relay.Value.kReverse); }

public void sweeperBarOut () { sweeperBarRotationMotor.set(Relay.Value.kForward); }

public void sweeperBarStop () { sweeperBarRotationMotor.set(Relay.Value.kOff); }

public void setArmUp() { sweeperBarPositionSolenoid.set(ARM_UP); }

public void setArmDown() { sweeperBarPositionSolenoid.set(ARM_DOWN); }

public void invertArm() {
	if(sweeperBarPositionSolenoid.get() == ARM_DOWN){
		sweeperBarPositionSolenoid.set(ARM_UP);
	}else{
		sweeperBarPositionSolenoid.set(ARM_DOWN);
	}

}

public DoubleSolenoid.Value getBarPosition() { return sweeperBarPositionSolenoid.get(); }

protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}

}