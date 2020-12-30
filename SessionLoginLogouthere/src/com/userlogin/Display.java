package com.userlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;


@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session =request.getSession();
		User obj=(User)	session.getAttribute("bean");
		if(obj.getFlag()==1)
		{
			out.println("hello welcome to "+obj.getUsername());

		}
		else
		{
			out.println("please login first here ");
			out.println("<a href='login.html'>Login</a>");
			
		}
		
		
		
		
	}

}
