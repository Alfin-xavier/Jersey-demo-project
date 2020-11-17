package com.atmecs.demo_project;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee 
{
	private String name;
	private int employeeId;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getEmployeeId() 
	{
		return employeeId;
	}
	public void setEmployeeId(int employeeId) 
	{
		this.employeeId = employeeId;
	}
	
}
