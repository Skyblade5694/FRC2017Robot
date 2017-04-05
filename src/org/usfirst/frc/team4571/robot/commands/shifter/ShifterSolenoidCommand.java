package org.usfirst.frc.team4571.robot.commands.shifter;

import org.usfirst.frc.team4571.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShifterSolenoidCommand extends Command {
	
	private boolean Shifter;
	
    public ShifterSolenoidCommand() {
    	requires(Robot.SHIFTER_SUBSYSTEM);
    	Shifter = true;
          
    }

    protected void initialize() {

    }
	protected void execute() {
		if(Shifter){
			Robot.SHIFTER_SUBSYSTEM.pushUp();
		}else{
			Robot.SHIFTER_SUBSYSTEM.pushDown();
		}
		Shifter = !Shifter;
	}
	
	protected boolean isFinished() {
		return true;
	}
	
	protected void end() {
	}
	
	protected void interrupted() {
	}
}
