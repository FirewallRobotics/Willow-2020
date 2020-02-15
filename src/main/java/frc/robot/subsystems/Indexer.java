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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalInput;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Indexer extends Subsystem {
    private static Spark spark1 = new Spark(RobotMap.FIRST_INDEXER_ADDRESS);
    private static Spark spark2 = new Spark(RobotMap.SECOND_INDEXER_ADDRESS);
    private static Spark spark3 = new Spark(RobotMap.THIRD_INDEXER_ADDRESS);
    private static DigitalInput Button1 = new DigitalInput(RobotMap.INDEXER_SWITCH_1);
    private static DigitalInput Button2 = new DigitalInput(RobotMap.INDEXER_SWITCH_2);
    private static DigitalInput Button3 = new DigitalInput(RobotMap.INDEXER_SWITCH_3);
    private static DigitalInput Button4 = new DigitalInput(RobotMap.INDEXER_SWITCH_4);
    private static DigitalInput Button5 = new DigitalInput(RobotMap.INDEXER_SWITCH_5);
    private static int numberCellsInIndexer = 0;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public Indexer() {
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
        SmartDashboard.putBoolean("Button1.get", Button1.get());
        SmartDashboard.putBoolean("Button2.get", Button1.get());
        SmartDashboard.putBoolean("Button3.get", Button1.get());
        SmartDashboard.putBoolean("Button4.get", Button1.get());
        SmartDashboard.putBoolean("Button5.get", Button1.get());

        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public static void testMotors(double motorSpeed) {
        spark1.set(motorSpeed);
        spark2.set(motorSpeed);
        spark3.set(motorSpeed);
    }
    //Index with no balls we are going to keep the conveyor running until we pick up a ball.
    //We will then read when the sensor is hit and stop the conveyor every time and repeat 
    //until we go to shoot the balls. Intake proccess after intake will be automatic.
    public void index() {
        if (Button5.get()){
            spark1.set(0);
            spark2.set(0);
            spark3.set(0);
            numberCellsInIndexer = 5;
        }
        else if (Button4.get() && numberCellsInIndexer == 3){
            spark1.set(0);
            spark2.set(0);
            spark3.set(0);
            numberCellsInIndexer = 4;
        }
        else if (Button3.get() && numberCellsInIndexer == 2){
            spark1.set(0);
            spark2.set(0);
            spark3.set(0);
            numberCellsInIndexer = 3;
        }
        else if (Button2.get() && numberCellsInIndexer == 1){
            spark1.set(0);
            spark2.set(0);
            spark3.set(0);
            numberCellsInIndexer = 2;
        }
        else if (Button1.get() && numberCellsInIndexer == 0){
            spark1.set(0);
            spark2.set(0);
            spark3.set(0);
            numberCellsInIndexer = 1;
        }
        else {
            spark1.set(RobotMap.INDEXER_CONVEYOR_SPEED);
            spark2.set(RobotMap.INDEXER_CONVEYOR_SPEED);
            spark3.set(RobotMap.INDEXER_CONVEYOR_SPEED);
        }
    }
    public void flush() {
        spark1.set(RobotMap.INDEXER_CONVEYOR_SPEED);
        spark2.set(RobotMap.INDEXER_CONVEYOR_SPEED);
        spark3.set(RobotMap.INDEXER_CONVEYOR_SPEED);
    }
}

