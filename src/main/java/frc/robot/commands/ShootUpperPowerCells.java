package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.RobotMap;

public class ShootUpperPowerCells extends CommandGroup {

    public ShootUpperPowerCells() {
       //addSequential(new LightUpLEDCommand());
       //addSequential(new ShooterMoveCommand());
       //addParallel(new adjustTurretCommand());
       addParallel(new StartShooterCommand());
       addParallel(new FlushIndexerCommand());
       //addParallel(new TimedCommand(RobotMap.FLUSH_INDEXER_TIME));
       //addSequential(new TurnOffLEDCommand());
    }
}