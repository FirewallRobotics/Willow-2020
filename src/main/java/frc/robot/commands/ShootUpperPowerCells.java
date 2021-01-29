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
       addSequential(new TimedCommand(0.75));
       addSequential(new FlushIndexerCommand());
       //addSequential(new TurnOffLEDCommand());
    }
}