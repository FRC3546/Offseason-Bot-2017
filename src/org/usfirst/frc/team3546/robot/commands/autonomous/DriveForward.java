package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3546.robot.Robot;

/**
 * Created by Wobot on 12/20/2016.
 */
public class DriveForward extends Command{

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
        Robot.robotDriveTrain.setMotorOutputs(-.5, -.5);
    }

    @Override
    protected boolean isFinished() {
        if(timeSinceInitialized() > 5) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    protected void end() {
        Robot.robotDriveTrain.stop();

    }

    @Override
    protected void interrupted() {
        end();

    }
}

