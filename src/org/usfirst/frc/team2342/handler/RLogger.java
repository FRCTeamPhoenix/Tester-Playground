package osg.usfirst.frc.team2342.handler;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * The RLogger logs files and then writes them into a CSV format.
 * WARNING: You have to do it in your own CSV format.
 */

public class RLogger 
{
	private String m_fname = "";
	private FileWriter fw = null;
	private BufferedWriter bw = null;
	
	/*
	 * This constructor takes the names of files and utilizes them.
	 */

	public RLogger(String fname) throws IOException
	{
		this.m_fname = fname;
		this.fw = new FileWriter(this.m_fname);
		this.bw = new BufferedWriter(this.fw);
	}
	
	/*
	 * This is the getM_fname method. It returns the name of the file.
	 */

	public String getM_fname() 
	{
		return m_fname;
	}
	
	/*
	 * This is the setM_fname method. It returns the name of the file.
	 */

	public void setM_fname(String m_fname) 
	{
		this.m_fname = m_fname;
	}
	
	/*
	 * This is the write method which writes the values of the file.
	 */

	public void write(String content) throws IOException
	{
		this.bw.write(content);
	}

	//TODO Read
}
