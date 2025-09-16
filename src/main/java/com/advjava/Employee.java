package com.advjava;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Employee extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String last = req.getParameter("last");
		
		String dob = req.getParameter("dob");		
		String gender = req.getParameter("gender");
		
		String mob = req.getParameter("mob");
		long mob1 = Long.parseLong(mob);
		
		String email = req.getParameter("email");
		String pswd = req.getParameter("pswd");
		
		String exp = req.getParameter("exp");
		float exp1 = Float.parseFloat(exp);

		String country = req.getParameter("country");
		String state = req.getParameter("state");
		String addr = req.getParameter("addr");
		String dept = req.getParameter("dept");
		String desig = req.getParameter("desig");
		
		String doj = req.getParameter("doj");
		
		String sal = req.getParameter("sal");
		float sal1 = Float.parseFloat(sal);
		
		
		System.out.println("----- Data coming from Frontend to Backend throught the server-----");
		System.out.println();
		
		System.out.println("First name: " + name);
		System.out.println("First last: " + last);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Gender: " + gender);
		System.out.println("Mobile no: " + mob1);
		System.out.println("Email: " + email);
		System.out.println("Password: " + pswd);
		System.out.println("Experience: " + exp1);
		System.out.println("Country: " + country);
		System.out.println("State: " + state);
		System.out.println("Address: " + addr);
		System.out.println("Department: " + dept);
		System.out.println("Designation: " + desig);
		System.out.println("Date of joining: " + doj);
		System.out.println("Expected salary in lpa: " + sal1);


		

		

		

		
		


		

		
	}
}
