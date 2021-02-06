package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.RobotMap;

public class SuckInCommand extends CommandGroup {

    public SuckInCommand() {

       addParallel(new IntakeCommand());
       addSequential(new TimedCommand(0.25));
       addSequential(new StopIntake());
    }
}