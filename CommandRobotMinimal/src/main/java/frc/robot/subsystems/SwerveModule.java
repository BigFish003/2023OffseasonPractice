package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.hardware.AbsoluteEncoder.EncoderConfig;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SwerveModule {
    private static CANSparkMax LEFT_FRONT_DRIVE_SPEED_MOTOR;
    private static CANSparkMax LEFT_BACK_DRIVE_SPEED_MOTOR;
    private static CANSparkMax RIGHT_FRONT_DRIVE_SPEED_MOTOR;
    private static CANSparkMax RIGHT_BACK_DRIVE_SPEED_MOTOR;

    private static CANSparkMax LEFT_FRONT_DRIVE_DIRECTION_MOTOR;
    private static CANSparkMax LEFT_BACK_DRIVE_DIRECTION_MOTOR;
    private static CANSparkMax RIGHT_FRONT_DRIVE_DIRECTION_MOTOR;
    private static CANSparkMax RIGHT_BACK_DRIVE_DIRECTION_MOTOR;

    public static Encoder LEFT_FRONT_DRIVE_DISTANCE_ENCODER;
    public static Encoder LEFT_BACK_DRIVE_DISTANCE_ENCODER;
    public static Encoder RIGHT_FRONT_DRIVE_DISTANCE_ENCODER;
    public static Encoder RIGHT_BACK_DRIVE_DISTANCE_ENCODER;
    public static Encoder DRIVE_DISTANCE_ENCODERS;

    public static Encoder LEFT_FRONT_DRIVE_DIRECTION_ENCODER;
    public static Encoder LEFT_BACK_DRIVE_DIRECTION_ENCODER;
    public static Encoder RIGHT_FRONT_DRIVE_DIRECTION_ENCODER;
    public static Encoder RIGHT_BACK_DRIVE_DIRECTION_ENCODER;
    
  
    public void drive() {
        LEFT_FRONT_DRIVE_SPEED_MOTOR = new CANSparkMax(RobotMap.LEFT_FRONT_DRIVE_SPEED_MOTOR_PIN);
        LEFT_BACK_DRIVE_SPEED_MOTOR = new CANSparkMax(RobotMap.LEFT_FRONT_DRIVE_SPEED_MOTOR_PIN);
        RIGHT_FRONT_DRIVE_SPEED_MOTOR;
        private static CANSparkMax RIGHT_BACK_DRIVE_SPEED_MOTOR;
    
        private static CANSparkMax LEFT_FRONT_DRIVE_DIRECTION_MOTOR;
        private static CANSparkMax LEFT_BACK_DRIVE_DIRECTION_MOTOR;
        private static CANSparkMax RIGHT_FRONT_DRIVE_DIRECTION_MOTOR;
        private static CANSparkMax RIGHT_BACK_DRIVE_DIRECTION_MOTOR;
    
    }
}
