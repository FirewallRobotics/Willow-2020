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
//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.PIDOutput;
//import edu.wpi.first.wpilibj.PIDSource;
//import edu.wpi.first.wpilibj.XboxController;
//import edu.wpi.first.wpilibj.Controller;
//import edu.wpi.first.wpilibj.GenericHID;
//import edu.wpi.first.wpilibj.PWMVictorSPX;
//import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.*;
//import java.util.ResourceBundle.Control;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.smartdashboard.*;
import edu.wpi.first.networktables.*;
import com.ctre.phoenix.motorcontrol.ControlMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {
    private static WPI_TalonSRX leftMaster = new WPI_TalonSRX(RobotMap.LEFT_MASTER_DRIVETRAIN_ADDRESS);
    private static WPI_TalonSRX rightMaster = new WPI_TalonSRX(RobotMap.RIGHT_MASTER_DRIVETRAIN_ADDRESS);
    private WPI_VictorSPX leftSlave = new WPI_VictorSPX(RobotMap.LEFT_SLAVE_DRIVETRAIN_ADDRESS);
    private WPI_VictorSPX rightSlave = new WPI_VictorSPX(RobotMap.RIGHT_SLAVE_DRIVETRAIN_ADDRESS);
    private static DifferentialDrive m_myRobot;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    private static NetworkTableInstance inst = NetworkTableInstance.getDefault();
    private static NetworkTable table = inst.getTable("powerball");
    private static NetworkTableEntry x = table.getEntry("X");
    private static NetworkTableEntry y = table.getEntry("Y");
    private static NetworkTableEntry radius = table.getEntry("R");
    private static NetworkTable goalTable = inst.getTable("goal");
    private static NetworkTableEntry goalX = goalTable.getEntry("X");
    private static NetworkTableEntry goalY = goalTable.getEntry("Y");
    private static NetworkTableEntry goalRadius = goalTable.getEntry("R");
    
    public static double goalMaxRadius = 195;
    private static double goalMinRadius = 10;
    private static double goalMaxOutR = 1;
    private static double goalMinOutR = -1;
    private static double goalNeutralOffSetR = 0.25;
    private static double goalPGainR = 0.250;
    private static double goalMaxX = 300;
    private static double goalMinX = 10;
    private static double goalMaxx = 1;
    private static double goalMinx = -1;
    private static double goalNeutralOffSetX = 0;
    private static double goalPGainX = 0.25;
    private static double goalScaledX = 0;
    public static double goalScaledRadius = 0;
    public static double MaxRadius = 195;
    private static double MinRadius = 10;
    private static double MaxOutR = 1;
    private static double MinOutR = -1;
    private static double NeutralOffSetR = 0.25;
    private static double PGainR = 0.250;
    private static double MaxX = 300;
    private static double MinX = 10;
    private static double Maxx = 1;
    private static double Minx = -1;
    private static double NeutralOffSetX = 0;
    private static double PGainX = 0.25;
    private static double ScaledX = 0;
    public static double ScaledRadius = 0;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public DriveTrain() {
        // Factory default Talons and Victors before configuring
        leftMaster.configFactoryDefault();
        rightMaster.configFactoryDefault();
        leftSlave.configFactoryDefault();
        rightSlave.configFactoryDefault();
        
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
        setDefaultCommand(new DriveTrainCommand());
    }

    @Override
    public void periodic() {
        SmartDashboard.putNumber("goalScaledX", goalScaledX);
        SmartDashboard.putNumber("goalScaledRadius",goalScaledRadius);
        SmartDashboard.putNumber("ScaledX", ScaledX);
        SmartDashboard.putNumber("ScaledRadius",ScaledRadius);

    }

    public static void Drive(double y, double y2, boolean extraButtonPressed) {

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS
        String driveChoiceSelected = SmartDashboard.getString("DriveChoice", "ArcadeDrive");
        System.out.println("DriveChoice " + driveChoiceSelected);
        switch (driveChoiceSelected) {
        case "CurvatureDrive":
            m_myRobot.curvatureDrive(y, y2, extraButtonPressed);
            break;
        case "TankDrive":
            m_myRobot.tankDrive(y, y2);
            break;
        default:
            // default to curvature drive
            m_myRobot.arcadeDrive(y, y2);
            break;
        }
    }

    public static void testMotors(double motorSpeed) {
        m_myRobot.tankDrive(motorSpeed, motorSpeed);
    }

    public static void driveToPowerCell() {
        double X = Math.round(x.getDouble(-1));
        double Radius = Math.round(radius.getDouble(-1));
        if (X == -1) {
            ScaledX = 0;
            ScaledRadius = 0;
        } else {
            ScaledX = PGainX * ((((Maxx - Minx) * ((X - MinX) / (MaxX - MinX))) + Minx) - NeutralOffSetX);
            ScaledRadius =  PGainR * ((((MaxOutR - MinOutR)*((Radius - MinRadius)/(MaxRadius - MinRadius))) + MinOutR) -  NeutralOffSetR);
        }
        
        Double LeftSpeed = (ScaledRadius +  ScaledX);
        Double RightSpeed = -(ScaledRadius -  ScaledX);
        //System.out.println("ScaledX: "+ ScaledX + " ScaledRadius: " + ScaledRadius);
        //System.out.println("LeftSpeed: "+ LeftSpeed + " RightSpeed: " + RightSpeed);
        leftMaster.set(ControlMode.PercentOutput,  -RightSpeed);
        rightMaster.set(ControlMode.PercentOutput, -LeftSpeed);

    }

	public void moveToShootingSpot() {
        double X = Math.round(goalX.getDouble(-1));
        double Radius = Math.round(goalRadius.getDouble(-1));
        if (X == -1) {
            goalScaledX = 0;
            goalScaledRadius = 0;
        } else {
            goalScaledX = goalPGainX * ((((goalMaxx - goalMinx) * ((X - goalMinX) / (goalMaxX - goalMinX))) + goalMinx) - goalNeutralOffSetX);
            goalScaledRadius =  goalPGainR * ((((goalMaxOutR - goalMinOutR)*((Radius - goalMinRadius)/(goalMaxRadius - goalMinRadius))) + goalMinOutR) -  goalNeutralOffSetR);
        }
        
        Double LeftSpeed = (goalScaledRadius +  goalScaledX);
        Double RightSpeed = -(goalScaledRadius -  goalScaledX);
        //System.out.println("goalScaledX: "+ goalScaledX + " goalScaledRadius: " + goalScaledRadius);
        //System.out.println("LeftSpeed: "+ LeftSpeed + " RightSpeed: " + RightSpeed);
        leftMaster.set(ControlMode.PercentOutput,  -RightSpeed);
        rightMaster.set(ControlMode.PercentOutput, -LeftSpeed);
	}
}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
