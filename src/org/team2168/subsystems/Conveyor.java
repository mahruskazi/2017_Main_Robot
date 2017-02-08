package org.team2168.subsystems;

import org.team2168.RobotMap;
import org.team2168.commands.conveyor.driveConveyorWithJoystick;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Conveyor extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private static Spark conveyorMotor;
    
    private static Conveyor instance = null;
	
	private Conveyor() {
		
		conveyorMotor = new Spark(RobotMap.CONVEYOR_MOTOR);
	
	
	}
	
	public void driveConveyor(double speed) {
		if (RobotMap.REVERSE_CONVEYOR)
			speed = -speed;
	
		conveyorMotor.set(speed);
	}
	
	public static Conveyor getInstance(){
		if(instance == null)
			instance = new Conveyor();
		
		return instance;
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new driveConveyorWithJoystick());
    }
}

