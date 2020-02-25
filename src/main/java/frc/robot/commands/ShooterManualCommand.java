package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.GenericHID;

import frc.robot.Robot;
import frc.robot.subsystems.Shooter;

public class ShooterManualCommand extends Command {

    public ShooterManualCommand() {
        requires(Robot.shooter);// shooter is required to shoot the ball
    }

    protected void initialize() {
    }

    /*
     * execute() - In our execute method we call a moveTurret() method and the shoot() method.
     */
    protected void execute() {
        Shooter.moveTurret(Robot.oi.get2ndXboxController().getBumper(GenericHID.Hand.kLeft),
                           Robot.oi.get2ndXboxController().getBumper(GenericHID.Hand.kRight));
        Shooter.shoot(Robot.oi.get2ndXboxController().getTriggerAxis(GenericHID.Hand.kLeft));
    }

    /*
     * isFinished - Our isFinished method always returns false meaning this command never completes on it's own. The reason we do this is that this command will be set as the default command for the subsystem. This means that whenever the subsystem is not running another command, it will run this command. If any other command is scheduled it will interrupt this command, then return to this command when the other command completes.
     */
    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
