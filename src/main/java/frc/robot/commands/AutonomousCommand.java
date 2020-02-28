// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
//import edu.wpi.first.wpilibj.command.TimedCommand;

//import frc.robot.Robot;
import frc.robot.RobotMap;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public AutonomousCommand() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
       
       /* Top 3 vote getters for what to do in autonomous:
       ** 1. Cross line, shoot 3 balls at top goal, collect more balls, shoot...
       ** 2. Move to low goal and shoot 3 balls
       ** 3. Position ourselves in a defensive manner.
       */
      
       //addSequential(new DriveForwardCommand(RobotMap.AUTO_DRIVE_FORWARD_SPEED));
       addSequential(new LightUpLEDCommand());
       addParallel(new ShooterMoveCommand());
       //addParallel(new adjustTurretCommand());
       addSequential(new StartShooterCommand());
       addSequential(new FlushIndexerCommand(RobotMap.FLUSH_INDEXER_TIME));
       addSequential(new StopShooter());
       addSequential(new TurnOffLEDCommand());
    }

    // Called just before this Command runs the first time
    /*@Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }*/
}
