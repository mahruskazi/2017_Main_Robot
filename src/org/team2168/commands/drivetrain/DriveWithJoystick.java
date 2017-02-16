package org.team2168.commands.drivetrain;

import org.team2168.OI;
import org.team2168.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveWithJoystick extends Command {
	
    public DriveWithJoystick() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.drivetrain);	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    /**
     * Gets the joystick positions from OI and sends them to the drivetrain subsystem.
     * @author Krystina
     */
    protected void execute() {
    	Robot.drivetrain.driveRobot(OI.getDriveTrainLeftJoystick(), OI.getDriveTrainRightJoystick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.driveRobot(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
