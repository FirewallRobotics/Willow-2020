package frc.robot;

//import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.AnalogPotentiometer;
//import edu.wpi.first.wpilibj.BuiltInAccelerometer;

//import edu.wpi.first.wpilibj.CameraServer;
//import edu.wpi.first.wpilibj.Counter;
//import edu.wpi.first.wpilibj.CounterBase.EncodingType;
//import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.DriverStation;
//import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.PIDSourceType;
//import edu.wpi.first.wpilibj.Preferences;

//import edu.wpi.first.wpilibj.livewindow.LiveWindow;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
    public static int PULLUP_ELEVATOR1_ADDRESS        = 8;
    public static int PULLUP_ELEVATOR2_ADDRESS        = 9;
    public static int INTAKE_VICTOR_ADDRESS           = 10;
    public static int SECOND_INDEXER_ADDRESS          = 11;

    // PWM motor controllers
    public static int FIRST_INDEXER_ADDRESS           = 0;
    //public static int SECOND_INDEXER_ADDRESS          = 1;
    //public static int INTAKER_ADDRESS                 = 2;
    public static int FIRST_ELEVATOR_ADDRESS          = 3;
    public static int SECOND_ELEVATOR_ADDRESS         = 4;
    
    // Speed constants
    public static double DRIVETRAIN_DEADBAND          = 0.26;
    public static double TURRET_SPEED                 = 0.25;
    public static double MOTOR_TEST_SPEED             = 0.5;
    public static double INTAKER_MOTOR_SPEED          = .8;
    public static double INDEXER_CONVEYOR_SPEED       = -1.0;
    public static double FLUSH_CONVEYOR_SPEED         = 1.0;
    public static double UPPER_INDEXER_SPEED          = -1.0;
    public static double LOW_SHOOTER_SPEED            = 0.80;
    public static double FULL_SHOOTER_SPEED           = 1.0;

    // Joystick constants
    public static double LOW_JOY_SPEED                = 0.50;
    public static double FULL_JOY_SPEED               = 0.75;
    
    // DIO constants
    public static int INTAKER_SWITCH                  = 0;
    public static int INDEXER_SWITCH_1                = 2;
    public static int INDEXER_SWITCH_2                = 3;
    public static int INDEXER_SWITCH_3                = 4;
    //public static int INDEXER_SWITCH_4              = 4;
    //public static int INDEXER_SWITCH_5              = 5;
    public static int LED_RELAY_ADDRESS               = 1;

    // Random constants
    public static double FLUSH_INDEXER_TIME           = 5.0;
    public static double EXTEND_ARMS_TIME             = 3.0;
    public static double AUTO_DRIVE_FORWARD_SPEED     = 0.30;
    public static double SHOOT_TIMEOUT                = 7;

    //Which PID slot to pull gains from. Starting 2018, you can choose from
    //0,1,2 or 3. Only the first two (0,1) are visible in web-based configuration.
    public static final int kSlotIdx                  = 0;
    //Talon SRX/ Victor SPX will supported multiple (cascaded) PID loops. For
    //now we just want the primary one.
    public static final int kPIDLoopIdx               = 0;
     //Set to zero to skip waiting for confirmation, set to nonzero to wait and
     //report to DS if action fails.
    public static final int kTimeoutMs                = 30;

    //Add this after the last lines in RobotMap.java:
    public static final double kP                     = 0.25;
    public static final double kI                     = 0.001;
    public static final double kD                     = 20;
    public static final double kF                     = 1023.0/7200.0;
    public final int kIzone                           = 300;
    public final double kPeakOutput                   = 1.00;
        
    public static void init() {

    }
}
