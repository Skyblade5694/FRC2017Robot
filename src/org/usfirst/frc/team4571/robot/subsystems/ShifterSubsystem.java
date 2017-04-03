package org.usfirst.frc.team4571.robot.subsystems;

import org.usfirst.frc.team4571.robot.RobotConstants;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ShifterSubsystem extends Subsystem {

    private DoubleSolenoid UpAndDownSolenoid;
    private Compressor compressor;
    
    public ShifterSubsystem() {
    	this.UpAndDownSolenoid = new DoubleSolenoid(RobotConstants.SHIFTER_FORWARD_SOLENOID_CHANNEL, RobotConstants.SHIFTER_REVERSE_SOLENOID_CHANNEL);
        this.compressor = new Compressor(0);
        this.compressor.setClosedLoopControl(true);
    }
    public void initDefaultCommand() {}
  
    public void initialize() {
    		pushUp();
    		pushDown();
    }
    
    public void pushUp() {
    	this.UpAndDownSolenoid.set(DoubleSolenoid.Value.kForward);	
    }
    
    public void pushDown() {
    	this.UpAndDownSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    public Value getShifterSolenoidValue(){
		return UpAndDownSolenoid.get();
    }	
}
