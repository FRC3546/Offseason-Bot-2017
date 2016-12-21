package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3546.robot.commands.SweeperArmPositionLower;
import org.usfirst.frc.team3546.robot.commands.SweeperBarRotationOut;

/**
 * Created by Wobot on 12/20/2016.
 */
public class DriveForwardDropBall extends CommandGroup{
    public DriveForwardDropBall(){
        addSequential(new DriveForward());
        addSequential(new SweeperArmPositionLower());
        addSequential(new SweeperBarRotationOut(), 2);
    }
    //don't print in here
}
