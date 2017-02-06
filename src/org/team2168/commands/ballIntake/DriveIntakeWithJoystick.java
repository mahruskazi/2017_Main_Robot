package org.team2168.commands.ballIntake;

import org.team2168.OI;

import org.team2168.Robot;

import edu.wpi.first.wpilibj.command.Command;
/*
 * Command for Intake
 * @author kvictorino thanks John
 */


public class DriveIntakeWithJoystick extends Command {
	
	public DriveIntakeWithJoystick(){
		// Use requires() here to declare subsystem dependencies
		requires(Robot.ballIntake);
	}
	
    // Called just before this Command runs the first time
	protected void initialize(){
	}
	
    // Called repeatedly when this Command is scheduled to run
	protected void execute(){
		Robot.ballIntake.driveIntake(OI.operatorJoystick.getLeftStickRaw_Y());	
	}
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.ballIntake.driveIntake(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}