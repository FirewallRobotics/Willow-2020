package frc.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CapturePowerCell extends CommandGroup {

    public CapturePowerCell() {
       //addSequential(new DriveToPowerCell());
       addSequential(new IntakeCommand());
       addSequential(new IndexerCommand()); 
    }
}