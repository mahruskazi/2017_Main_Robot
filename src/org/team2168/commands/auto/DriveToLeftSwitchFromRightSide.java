package org.team2168.commands.auto;

import org.team2168.commands.drivetrain.PIDCommands.DriveXDistance;
import org.team2168.commands.drivetrain.PIDCommands.RotateXDistancePIDZZZ;
import org.team2168.commands.gearintake.DriveGearIntakeRollerWithConstant;
import org.team2168.commands.gearintake.LowerGearArmDANGEROUS;
import org.team2168.commands.gearintake.RaiseGearArm;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class DriveToLeftSwitchFromRightSide extends CommandGroup {

    public DriveToLeftSwitchFromRightSide() {
    	addSequential(new DriveXDistance(19.8,0.7,0.05));
    	addSequential(new RotateXDistancePIDZZZ(-90,0.7,0.2));
    	addSequential(new DriveXDistance(20.0,0.7,0.05));
    	addSequential(new RotateXDistancePIDZZZ(-99,0.7,0.2));
    	addSequential(new DriveXDistance(5.0,0.7,0.05));
    	
    	
    	//score on switch (Spit Intake)
   	 	addSequential(new LowerGearArmDANGEROUS(),0.3); 
   	 	addSequential(new DriveGearIntakeRollerWithConstant(-1.0),0.4);
   	 	addSequential(new DriveGearIntakeRollerWithConstant(0.0),0.4);
   	    addSequential(new RaiseGearArm(),0.2);
    }
}
