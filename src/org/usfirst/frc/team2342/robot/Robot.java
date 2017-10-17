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
	RobotDrive myRobot = new RobotDrive(0, 1);
	Joystick stick = new Joystick(0);
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
		//Jokes for your entertainment
		SmartDashboard.putString("DB/String 0", "Q: Why did the student eat his homework?");
		SmartDashboard.putString("DB/String 1", "A: Because his teacher said it was a peace of cake!");
		SmartDashboard.putString("DB/String 2", "Q: How does Moses make his tea?");
		SmartDashboard.putString("DB/String 3", "A: Hebrews it!");
		SmartDashboard.putString("DB/String 4", "Q: What do you call a fake noodle?");
		SmartDashboard.putString("DB/String 5", "A: An impasta!");
		SmartDashboard.putString("DB/String 6", "Q: Why did the ghost ride the elevator?");
		SmartDashboard.putString("DB/String 7", "A: To lift his spirits!");
		SmartDashboard.putString("DB/String 8", "Q: What kind of shoes do artists wear?");
		SmartDashboard.putString("DB/String 9", "A: Sketchers!");
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		myRobot.arcadeDrive(stick);
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		LiveWindow.run();
	}
}
