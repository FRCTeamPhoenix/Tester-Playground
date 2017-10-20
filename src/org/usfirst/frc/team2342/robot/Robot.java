package org.usfirst.frc.team2342.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	RobotDrive myRobot = new RobotDrive(0, 3);
	Joystick stick = new Joystick(0);
	Joystick stick2 = new Joystick(1);
	Timer timer = new Timer();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
	}

	/**
	 * This function is run once each time the robot enters autonomous mode
	 */
	@Override
	public void autonomousInit() {
		timer.reset();
		timer.start();
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		// Drive for 2 seconds
		if (timer.get() < 2.0) {
			myRobot.drive(-0.5, 0.0); // drive forwards half speed
		} else {
			myRobot.drive(0.0, 0.0); // stop robot
		}
	}

	/**
	 * This function is called once each time the robot enters tele-operated
	 * mode
	 */
	@Override
	public void teleopInit() {
		//Memes for your entertainment
		SmartDashboard.putString("DB/String 0", "D4NK M3M35 ACTIVATED");
		SmartDashboard.putString("DB/String 1", "P3P3 ACTIVATED");
		SmartDashboard.putString("DB/String 2", "GN0M3 CH1LD ACTIVATED");
		SmartDashboard.putString("DB/String 3", "D0G3 ACTIVATED");
		SmartDashboard.putString("DB/String 4", "5HR3K ACTIVATED");
		SmartDashboard.putString("DB/String 5", "D4T B01 ACTIVATED");
		SmartDashboard.putString("DB/String 6", "P1CKL3 R1CK ACTIVATED");
		SmartDashboard.putString("DB/String 7", "MY N4M3 1S J3FF ACTIVATED");
		SmartDashboard.putString("DB/String 8", "1llUM1N4T1 ACTIVATED");
		SmartDashboard.putString("DB/String 9", "SN00P D0G ACTIVATED");
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		myRobot.tankDrive(-stick.getY() * 0.3, -stick2.getY() * 0.3);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
