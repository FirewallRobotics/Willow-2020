package frc.robot.commands;

import java.util.concurrent.DelayQueue;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Robot;

public class AutonomousShoot extends CommandGroup {

    public AutonomousShoot() {
        addParallel(new StartShooterCommand());
        addParallel(new FlushIndexerCommand());
        //addSequential(new NewDriveForwardCommand());
    }
}
