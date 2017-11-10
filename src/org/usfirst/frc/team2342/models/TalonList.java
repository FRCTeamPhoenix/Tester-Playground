package org.usfirst.frc.team2342.models;



import org.usfirst.frc.team2342.robot.PIDGains;

public class TalonList {
	private static int len = 9;
	public Talon[] talonList = new Talon[len];
	
	 
	public TalonList() {
		PIDGains distance = new PIDGains(0,0,0,0,0,0);
	talonList[0] = new Talon(1,distance,distance,1.0,1.0,false);
	}
	
	
	
}
