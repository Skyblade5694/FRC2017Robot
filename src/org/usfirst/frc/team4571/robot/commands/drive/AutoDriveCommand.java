//package org.usfirst.frc.team4571.robot.commands.drive;
//
//import org.usfirst.frc.team4571.robot.Robot;
//
//import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//
///**
// * 
// * PID controlled drive command. Zero user inputs.
// * 
// * @author mxhim Team 4571 
// *
// */
//public class AutoDriveCommand extends Command {
//
//	private double distanceInFeet;
//	private double angle;
//
//	public AutoDriveCommand(double distanceInFeet, double angle) {
//		requires(Robot.TANK_DRIVE_SUBSYSTEM);
//		this.distanceInFeet = distanceInFeet;
//		this.angle = angle;
//	}
//
//	protected void initialize() {
//		Robot.TANK_DRIVE_SUBSYSTEM.reset();
//		Robot.TANK_DRIVE_SUBSYSTEM.setBothPIDParameters(distanceInFeet, angle);
//	}
//
//	protected void execute() {
//		smartDashboard();
//		log();   	
//	}
//
//	private void smartDashboard() {
//		SmartDashboard.putNumber("Left Encoder Raw", Robot.TANK_DRIVE_SUBSYSTEM.getLeftEncoder().getRaw() );
//		SmartDashboard.putNumber("Right Encoder Raw", Robot.TANK_DRIVE_SUBSYSTEM.getRightEncoder().getRaw() );
//		SmartDashboard.putNumber("Left Encoder distance", Robot.TANK_DRIVE_SUBSYSTEM.getLeftEncoderDistance() );
//		SmartDashboard.putNumber("Right Encoder distance", Robot.TANK_DRIVE_SUBSYSTEM.getRightEncoderDistance() );
//		SmartDashboard.putNumber("Average distance", Robot.TANK_DRIVE_SUBSYSTEM.getDistance() );
//		SmartDashboard.putNumber("Distance setpoint", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getSetpoint() );
//		SmartDashboard.putNumber("Distance Average Error", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getAvgError()  );
//		SmartDashboard.putNumber("Distance Get Value", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().get() );
//		SmartDashboard.putNumber("Distance Error", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getError() );
//		SmartDashboard.putNumber("Distance P", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getP() );
//		SmartDashboard.putNumber("Distance I", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getI() );
//		SmartDashboard.putNumber("Distance D", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().getD() );
//		SmartDashboard.putNumber( "NavX angle", Robot.TANK_DRIVE_SUBSYSTEM.getNavXAngle() );    
//		SmartDashboard.putNumber("AngleOutput", Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().get());
//		SmartDashboard.putNumber("Angle SetPoint", Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().getSetpoint());
//		SmartDashboard.putNumber("Angle Error", Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().getError()); 
//		SmartDashboard.putNumber("Angle avg error", Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().getAvgError());
//		SmartDashboard.putBoolean("Distance Controller onTarget", Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().onTarget());
//		SmartDashboard.putBoolean("Turn Controller onTarget", Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().onTarget());
//	}
//
//	private void log() {
//		System.out.println("Left Speed ( Distance - Turn )= " +  (Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().get() - Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().get()));
//		System.out.println("Right Speed ( Distance + Turn )= " +  (Robot.TANK_DRIVE_SUBSYSTEM.getDistanceController().get() + Robot.TANK_DRIVE_SUBSYSTEM.getTurnController().get()));
//	}
//
//	protected boolean isFinished() {
//		return Robot.TANK_DRIVE_SUBSYSTEM.isBothFinished();
//	}
//
//	protected void end() {
//		Robot.TANK_DRIVE_SUBSYSTEM.disableBoth();
//	}
//
//	protected void interrupted() {
//		Robot.TANK_DRIVE_SUBSYSTEM.disableBoth();
//	}
//}