// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import frc.robot.RobotMap;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.Controller;
import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.*;
import java.util.ResourceBundle.Control;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.*;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {
    private WPI_TalonSRX leftMaster = new WPI_TalonSRX(RobotMap.LEFT_MASTER_DRIVETRAIN_ADDRESS);
    private WPI_TalonSRX rightMaster = new WPI_TalonSRX(RobotMap.RIGHT_MASTER_DRIVETRAIN_ADDRESS);
    private WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.LEFT_SLAVE_DRIVETRAIN_ADDRESS);
    private WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.RIGHT_SLAVE_DRIVETRAIN_ADDRESS);
    private static DifferentialDrive m_myRobot;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        m_myRobot = new DifferentialDrive(leftMaster, rightMaster);
        m_myRobot.setDeadband(RobotMap.DRIVETRAIN_DEADBAND);
        leftSlave.follow(leftMaster);
        rightSlave.follow(rightMaster);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    public static void Drive(double y, double y2, boolean extraButtonPressed) {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS
    //String driveChoiceSelected = SmartDashboard.getString("Drive Choice List", "CurvatureDrive");
    //switch(driveChoiceSelected) {
        //case "CurvatureDrive":
            //m_myRobot.curvatureDrive(y, y2, extraButtonPressed);
            //break;
        //case "TankDrive":
            //m_myRobot.tankDrive(y, y2);
            //break;
        //default:
    // default to curvature drive
            m_myRobot.arcadeDrive(y, y2);
            //break;
    }
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.