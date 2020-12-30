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


@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session =request.getSession();
		User obj=(User)	session.getAttribute("bean");
		obj.setFlag(0);
		//response.sendRedirect("menu.html");
		PrintWriter out =response.getWriter();
		out.println("you are successfully logged out ");
		
		
		
		
		
		
	}


}
