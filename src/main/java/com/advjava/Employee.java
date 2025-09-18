package com.advjava;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Employee extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String name = req.getParameter("name");
		String last = req.getParameter("last");

		String dob = req.getParameter("dob");
		LocalDate dob1 = LocalDate.parse(dob);

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
		LocalDate doj1 = LocalDate.parse(doj);

		String sal = req.getParameter("sal");
		float sal1 = Float.parseFloat(sal);

		// To generate dynamic response
		PrintWriter out = res.getWriter();
		
		// DB connect

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "12345");
			PreparedStatement ps = c.prepareStatement(
					"INSERT INTO emp (first_name, last_name, dob, gender, mob, email, pswd, exp, country, state, addr, dept, desig, doj, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			//set the values
			ps.setString(1, name);
			ps.setString(2, last);
			ps.setDate(3, java.sql.Date.valueOf(dob1));
			ps.setString(4, gender);
			ps.setLong(5, mob1);
			ps.setString(6, email);
			ps.setString(7, pswd);
			ps.setFloat(8, exp1);
			ps.setString(9, country);
			ps.setString(10, state);
			ps.setString(11, addr);
			ps.setString(12, dept);
			ps.setString(13, desig);
			ps.setDate(14, java.sql.Date.valueOf(doj1));
			ps.setFloat(15, sal1);

			int chk = ps.executeUpdate();
			if (chk > 0)
			{
				
				out.println("alert('Data inserted successfully!');");
				//out.println("<h1 style='color:green'>" + "Data is Inserted Successfully" + "<h1/>");
			} 
			
			else
			{
				out.println("<h1 style = 'color:red'>" + "Data is not Inserted " + "<h1/>");

			}
		}

		catch (Exception e)
		{
			out.println("Error = " + e.getMessage());
		}

	}
}
