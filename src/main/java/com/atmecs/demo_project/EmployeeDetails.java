package com.atmecs.demo_project;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("employee")
public class EmployeeDetails 
{
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		emp.setEmployeeId(1181);
		emp.setName("Alfin");
		return emp;
	}
}
