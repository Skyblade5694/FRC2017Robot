//package org.usfirst.frc.team4571.robot.commands.intake;
//
//import org.usfirst.frc.team4571.robot.Robot;
//
//import edu.wpi.first.wpilibj.command.Command;
//
//public class IntakeSolenoidCommand extends Command {
//
//	//private boolean isRollerOut;
//	private boolean isShifterDown;
//
//	public IntakeSolenoidCommand() {
//		requires(Robot.INTAKE_SUBSYSTEM);
//		isShifterDown = true;
//	}
//
//	protected void initialize() {
////		Robot.INTAKE_SUBSYSTEM.initialize();
////		isRollerOut = true;
////		isRollerDown = true;
//	}
//	
//	protected void execute() {
////		if( isRollerOut ){
////			Robot.INTAKE_SUBSYSTEM.stopRoller();
////			Robot.INTAKE_SUBSYSTEM.pushIn();
////		} else{
////			Robot.INTAKE_SUBSYSTEM.pushOut();
////		}
////		isRollerOut = !isRollerOut;
//		if(isShifterDown){
//			Robot.INTAKE_SUBSYSTEM.pushUp();
//		}else{
//			Robot.INTAKE_SUBSYSTEM.pushDown();
//		}
//		isShifterDown = !isShifterDown;
//	}
//	
//	protected boolean isFinished() {
//		return true;
//	}
//	
//	protected void end() {
//	}
//	
//	protected void interrupted() {
//	}
//}