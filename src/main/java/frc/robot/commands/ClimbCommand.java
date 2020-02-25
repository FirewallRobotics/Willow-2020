package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.RobotMap;

public class ClimbCommand extends CommandGroup {

    public ClimbCommand() {
       addSequential(new ExtendArmsCommand());
       addSequential(new TimedCommand(RobotMap.EXTEND_ARMS_TIME));
       addSequential(new PullupCommand());
    }
}