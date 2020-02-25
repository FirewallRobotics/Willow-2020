package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
//import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.RobotMap;

public class ShootLowerPowerCells extends CommandGroup {

    public ShootLowerPowerCells() {
       addSequential(new FlushIndexerLowerShootCommand(RobotMap.FLUSH_INDEXER_TIME));
       addSequential(new StopIndexer());
    }
}