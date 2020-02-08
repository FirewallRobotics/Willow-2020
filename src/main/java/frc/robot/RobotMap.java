package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Preferences;

import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // CAN motor controllers
    public static int LEFT_MASTER_DRIVETRAIN_ADDRESS  = 1;
    public static int RIGHT_MASTER_DRIVETRAIN_ADDRESS = 2;
    public static int LEFT_SLAVE_DRIVETRAIN_ADDRESS   = 3;
    public static int RIGHT_SLAVE_DRIVETRAIN_ADDRESS  = 4;
    public static int TURRET_ADDRESS                  = 5;
    public static int FIRST_SHOOTER_ADDRESS           = 6;
    public static int SECOND_SHOOTER_ADDRESS          = 7;
    
    // PWM motor controllers
    public static int INTAKER_ADDRESS                 = 0;
    public static int FIRST_INDEXER_ADDRESS           = 1;
    public static int SECOND_INDEXER_ADDRESS          = 2;
    public static int THIRD_INDEXER_ADDRESS           = 3;
    
    // Other constants
    public static double DRIVETRAIN_DEADBAND          = 0.26;
    public static double TURRET_SPEED                 = 0.25;
    

    public static void init() {

    }
}
