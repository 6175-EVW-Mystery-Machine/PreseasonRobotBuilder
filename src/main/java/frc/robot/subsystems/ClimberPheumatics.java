// RobotBuilder Version: 4.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

// ROBOTBUILDER TYPE: Subsystem.

package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ClimberPheumatics extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private DoubleSolenoid innerSolenoid;
private DoubleSolenoid outerSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public ClimberPheumatics() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
innerSolenoid = new DoubleSolenoid(0, PneumaticsModuleType.CTREPCM, 2, 3);
 addChild("InnerSolenoid", innerSolenoid);
 

outerSolenoid = new DoubleSolenoid(0, PneumaticsModuleType.CTREPCM, 1, 0);
 addChild("OuterSolenoid", outerSolenoid);
 


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void ExtentInnerSolenoid() {
        innerSolenoid.set(Value.kForward);
    }
    public void RetractInnerSolenoid() {
        innerSolenoid.set(Value.kReverse);
    }
    public void ExtentOuterSolenoid() {
        outerSolenoid.set(Value.kForward);
    }
    public void RetractOuterSolenoid() {
        outerSolenoid.set(Value.kReverse);
    }

}

