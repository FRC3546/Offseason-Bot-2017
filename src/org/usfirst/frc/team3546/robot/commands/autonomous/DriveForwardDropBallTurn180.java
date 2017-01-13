package org.usfirst.frc.team3546.robot.commands.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3546.robot.commands.SweeperArmPositionLower;
import org.usfirst.frc.team3546.robot.commands.SweeperArmPositionRaise;
import org.usfirst.frc.team3546.robot.commands.SweeperBarRotationOut;

/**
 * Created by User on 1/9/2017.
 */
public class DriveForwardDropBallTurn180 extends CommandGroup {
    public DriveForwardDropBallTurn180(){
        addSequential(new DriveForward());
        addSequential(new SweeperArmPositionLower());
        addSequential(new SweeperBarRotationOut(), 1);
        addSequential(new SweeperArmPositionRaise());
        addSequential(new Turn180());
        addSequential(new DriveForward());
        addSequential(new Turn180());
    }
    //don't print in here
}
