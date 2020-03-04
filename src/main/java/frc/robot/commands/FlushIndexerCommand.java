package frc.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Indexer;

public class FlushIndexerCommand extends Command {

    public FlushIndexerCommand() {
        requires(Robot.indexer);// indexer is needed to intake the ball
    }

    protected void initialize() {
        setTimeout(RobotMap.FLUSH_INDEXER_TIME);
    }

    /*
    *execute() - intake power cell
    */
    protected void execute() {
        Indexer.flush();
    }


    /*
    * isFinished
    */
    protected boolean isFinished() {
        return isTimedOut();
        //return false;
    }

    protected void end() {

    }

    protected void interrupted() {

    }
}