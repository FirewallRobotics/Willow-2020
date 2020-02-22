package frc.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class CaptureBalls extends CommandGroup {

    public CaptureBalls() {
       addSequential(new DriveToPowerCell());
       addSequential(new IndexerCommand());
       addSequential(new IntakeCommand());
    }
}