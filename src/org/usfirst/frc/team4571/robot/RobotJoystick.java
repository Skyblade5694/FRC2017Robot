package org.usfirst.frc.team4571.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

//TODO : Is this the right configuration for the joystick or do we need more  buttons?
public class RobotJoystick extends Joystick {

	private Button button1, button2, button3, button4, button5, button6;
	private double tuningParameter;

	public RobotJoystick(int port) {
		super(port);
		this.button1 = new JoystickButton(this, 1);
		this.button2 = new JoystickButton(this, 2);
		this.button3 = new JoystickButton(this, 3);
		this.button4 = new JoystickButton(this, 4);
		this.button5 = new JoystickButton(this, 5);
		this.button6 = new JoystickButton(this, 6);
		this.tuningParameter = RobotConstants.JOYSTICK_TUNING_PARAMETER;
	}

	public RobotJoystick button1WhenPressed(Command command) {
		this.button1.whenPressed(command);
		return this;
	}

	public RobotJoystick button1WhenReleased(Command command) {
		this.button1.whenReleased(command);
		return this;
	}

	public RobotJoystick button2WhenPressed(Command command) {
		this.button2.whenPressed(command);
		return this;
	}

	public RobotJoystick button2WhenReleased(Command command) {
		this.button2.whenReleased(command);
		return this;
	}

	public RobotJoystick button3WhenPressed(Command command) {
		this.button3.whenPressed(command);
		return this;
	}

	public RobotJoystick button3WhenReleased(Command command) {
		this.button3.whenReleased(command);
		return this;
	}

	public RobotJoystick button4WhenPressed(Command command) {
		this.button4.whenPressed(command);
		return this;
	}

	public RobotJoystick button4WhenReleased(Command command) {
		this.button4.whenReleased(command);
		return this;
	}
	public RobotJoystick button5WhenPressed(Command command) {
		this.button5.whenPressed(command);
		return this;
	}
	public RobotJoystick buttonxWhenReleased(Command command) {
		this.button5.whenReleased(command);
		return this;
	}
    public RobotJoystick button6WhenPressed(Command command) {
    	this.button6.whenPressed(command);
    	return this;
    }
    public RobotJoystick button6WhenReleased(Command command) {
    	this.button6.whenReleased(command);
    	return this;
    }
	public Button getButton1() {
		return this.button1;	
	}

	public Button getButton2() {
		return this.button2;
	}

	public Button getButton3() {
		return this.button3;
	}

	public Button getButton4() {
		return this.button4;
	}
	public Button getButton5() {
		return this.button5;
	}
	public Button getButton6() {
		return this.button6;
	}
	public double getXAxisSpeed() {
		return adjustForSensitivity(this.getRawAxis(0), getTuningParameter());
	}

	public double getYAxisSpeed() {
		return adjustForSensitivity(this.getRawAxis(1), getTuningParameter());
	}

	public double getTuningParameter() {
		return tuningParameter;
	}

	// Taken from 
	//	- https://www.chiefdelphi.com/forums/showthread.php?p=921992
	//  - https://www.chiefdelphi.com/media/papers/2421
	/**
	 * Run some calculations to figure out how sensitive we want the joystick to be
	 * 
	 * @param originalValue : Value passed in to calculate sensitivity
	 * @param tuningParameter : Ranges from 0 - 1. 
	 * 			  When tuningParametera = 0, result = original Value   i.e. not adjusted for sensitivity
	 * 			  When tuningParameter  = 1, result = originalValue ^3 i.e. very sensitive
	 * @return value corrected for sensitivity
	 */
	public double adjustForSensitivity( double originalValue, double tuningParameter ) {
		if( tuningParameter == 0 ) {
			tuningParameter = RobotConstants.JOYSTICK_TUNING_PARAMETER;
		}
		return ( ( Math.pow(originalValue, 3) * tuningParameter ) + ( ( 1 - tuningParameter ) * originalValue ) );
	}
}