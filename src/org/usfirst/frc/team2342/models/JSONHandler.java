package org.usfirst.frc.team2342.models;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONHandler {
	private String m_fname;
	private File m_fileHandler;
	private ObjectMapper m_mapper = new ObjectMapper();
	private boolean m_fExists;
	
	public JSONHandler(String fname) {
		m_mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		this.m_fname = fname;
		this.m_fileHandler = new File(fname);
		this.m_fExists = m_fileHandler.exists();
		if (m_fExists == true) {
			System.out.println("File exists, we are good to go.");
		}
		else {
			System.out.println("This file does not exists.");
			System.out.println("If you want to next time use the write function to create a json file.");
		}
	}
	
	public String getFname() {
		return this.m_fname;
	}
	
	public void setFname(String name) {
		this.m_fname = name;
	}
	
	public <T> void write(T t) throws JsonGenerationException, JsonMappingException, IOException {
		m_mapper.writeValue(m_fileHandler, t);
	}
	
	public <T> T read(Class<T> pass) throws JsonGenerationException, JsonMappingException, IOException {
		return m_mapper.readValue(m_fileHandler, pass);
	}
}
