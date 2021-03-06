package org.usfirst.frc.team4571.robot;

//import org.usfirst.frc.team4571.robot.commands.drive.AutoDriveCommand;
//import org.usfirst.frc.team4571.robot.commands.drive.RunFor30Minutes;
import org.usfirst.frc.team4571.robot.commands.drive.TeleopDriveCommand;
//import org.usfirst.frc.team4571.robot.commands.intake.IntakeSolenoidCommand;
import org.usfirst.frc.team4571.robot.commands.shifter.ShifterSolenoidCommand;
//import org.usfirst.frc.team4571.robot.subsystems.IntakeSubsystem;
import org.usfirst.frc.team4571.robot.subsystems.ShifterSubsystem;
//import org.usfirst.frc.team4571.robot.commands.drive.TurnDegreesCommand;
//import org.usfirst.frc.team4571.robot.commands.gear.GearPneumaticsCommand;
//import org.usfirst.frc.team4571.robot.commands.gear.GearServoCommand;
//import org.usfirst.frc.team4571.robot.commands.group.TurnThenDrive;
//import org.usfirst.frc.team4571.robot.commands.intake.IntakeRollerCommand;
//import org.usfirst.frc.team4571.robot.commands.intake.IntakeSolenoidCommand;
//import org.usfirst.frc.team4571.robot.commands.mill.ForwardMillCommand;
//import org.usfirst.frc.team4571.robot.subsystems.GearSubsystem;
//import org.usfirst.frc.team4571.robot.subsystems.IntakeSubsystem;
//import org.usfirst.frc.team4571.robot.subsystems.MillSubsystem;
import org.usfirst.frc.team4571.robot.subsystems.TankDriveSubsystem;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * 
 * @author arjunrao87
 *
 */
public class Robot extends IterativeRobot {

	// Joystick
	public static final RobotJoystick LEFT_JOYSTICK = new RobotJoystick(RobotConstants.LEFT_JOYSTICK_PORT);
	public static final RobotJoystick RIGHT_JOYSTICK = new RobotJoystick(RobotConstants.RIGHT_JOYSTICK_PORT);
	public static final RobotJoystick LOGITECH_JOYSTICK = new RobotJoystick(RobotConstants.LOGITECH_JOYSTICK_PORT);

	// Subsystems
	public static final TankDriveSubsystem TANK_DRIVE_SUBSYSTEM = new TankDriveSubsystem();
	//public static final IntakeSubsystem INTAKE_SUBSYSTEM = new IntakeSubsystem();
	public static final ShifterSubsystem SHIFTER_SUBSYSTEM = new ShifterSubsystem();
//	public static final MillSubsystem MILL_SUBSYSTEM = new MillSubsystem();
//	public static final GearSubsystem GEAR_SUBSYSTEM = new GearSubsystem();
//	public static final ShooterSubsystem SHOOTER_SUBSYSTEM = new ShooterSubsystem (); 

	// Commands
	// -- Drive -- //
	public static final TeleopDriveCommand TANK_DRIVE_COMMAND = new TeleopDriveCommand();	
//	public static final RunFor30Minutes RUN_FOR_30_MIN = new RunFor30Minutes();	
//	public static final AutoDriveCommand DRIVE_STRAIGHT_COMMAND = new AutoDriveCommand(12, 0.0);	
//	public static final TurnDegreesCommand TURN_RIGHT_90_DEGREES = new TurnDegreesCommand(90.0);
//	public static final TurnDegreesCommand TURN_LEFT_90_DEGREES = new TurnDegreesCommand(-90.0);
//	public static final TurnDegreesCommand TURN_RIGHT_180_DEGREES = new TurnDegreesCommand(179.9f);
//	public static final TurnDegreesCommand TURN_LEFT_180_DEGREES = new TurnDegreesCommand(-179.9f);
//	public static final TurnDegreesCommand TURN_RIGHT_270_DEGREES = new TurnDegreesCommand(269.9f);
//	public static final TurnDegreesCommand TURN_LEFT_270_DEGREES = new TurnDegreesCommand(-269.9f);
//	public static final TurnDegreesCommand TURN_LEFT_150_DEGREES = new TurnDegreesCommand(-150.0f);
	//public static final TurnThenDrive TURN_RIGHT_45_AND_DRIVE_12_INCHES = new TurnThenDrive(45.0f, 12.0);

	// -- Intake -- //
//	public static final IntakeRollerCommand INTAKE_ROLLER_COMMAND = new IntakeRollerCommand(0.5);
	//public static final IntakeSolenoidCommand INTAKE_SOLENOID_COMMAND = new IntakeSolenoidCommand();
	
	// -- Shifter -- //
	public static final ShifterSolenoidCommand SHIFTER_SOLENOID_COMMAND = new ShifterSolenoidCommand();

	// -- Mill -- //
//	public static final ForwardMillCommand MILL_COMMAND = new ForwardMillCommand();
//
//	// -- Gear -- //
//	public static final GearPneumaticsCommand GEAR_PNEMATICS_COMMAND = new GearPneumaticsCommand();
//	public static final GearServoCommand GEAR_SERVO_COMMAND = new GearServoCommand();

	// -- Shooter -- //
//	public static final ShooterCommand SHOOTER_COMMAND = new ShooterCommand ();
//	public static final AutonomousShooterCommand AUTONOMOUS_SHOOTER = new AutonomousShooterCommand();
	
	@Override
	public void robotInit() {}

	@Override
	public void disabledInit(){
	//Robot.TANK_DRIVE_SUBSYSTEM.disableBoth();
	//.TANK_DRIVE_SUBSYSTEM.reset();
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().removeAll();
		Scheduler.getInstance().run();
	}

	//@Override
	//public void autonomousInit() {
		// TODO : Add autonomous mode picker here + Command Groups
	//}

//	@Override
	//public void autonomousPeriodic() {
		//Scheduler.getInstance().run();
	//}

	@Override
	public void teleopInit() {
		// Instantiate commands
		Scheduler.getInstance().add(TANK_DRIVE_COMMAND);
//		Scheduler.getInstance().add(GEAR_PNEMATICS_COMMAND);
//		Scheduler.getInstance().add(GEAR_SERVO_COMMAND);
//		Scheduler.getInstance().add(MILL_COMMAND);
//		Scheduler.getInstance().add(SHOOTER_COMMAND);
		
		// Setup joystick buttons
//		Robot.LEFT_JOYSTICK.button4WhenPressed(TURN_LEFT_180_DEGREES);
//		Robot.RIGHT_JOYSTICK.button4WhenPressed(TURN_RIGHT_180_DEGREES);
		Robot.LEFT_JOYSTICK.button6WhenPressed(SHIFTER_SOLENOID_COMMAND);
//	Robot.RIGHT_JOYSTICK.button3WhenPressed(TURN_RIGHT_90_DEGREES);
//	Robot.RIGHT_JOYSTICK.button3WhenPressed(TURN_RIGHT_90_DEGREES);
//		Robot.LEFT_JOYSTICK.button1WhenPressed(TURN_LEFT_270_DEGREES);
//		Robot.RIGHT_JOYSTICK.button1WhenPressed(TURN_RIGHT_270_DEGREES);
//		Robot.LEFT_JOYSTICK.button2WhenPressed(TURN_RIGHT_45_AND_DRIVE_12_INCHES);
//		Robot.LOGITECH_JOYSTICK.button5WhenPressed(TURN_LEFT_90_DEGREES);
////		Robot.RIGHT_JOYSTICK.button2WhenPressed(SHOOTER_COMMAND);
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}