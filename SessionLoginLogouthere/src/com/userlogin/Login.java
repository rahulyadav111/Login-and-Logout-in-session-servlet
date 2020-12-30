package com.userlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;



@WebServlet(
		urlPatterns = { "/Login" }, 
		initParams = { 
				@WebInitParam(name = "username", value = "admin"), 
				@WebInitParam(name = "password", value = "123")
		})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String uname=request.getParameter("username");
		String pas=request.getParameter("password");
		ServletConfig config=getServletConfig();
		String usr=(String)config.getInitParameter("username");
		String pass=(String)config.getInitParameter("password");
		if (uname.equals(usr)&& pas.equals(pass))
				{
						User obj=new User();
						obj.setUsername(uname);
						obj.setPassword(pas);
						obj.setFlag(1);
						HttpSession session=request.getSession();
						session.setAttribute("bean",obj);
						
					response.sendRedirect("menu.html");
					System.out.println("welcome to you user name is "+uname );
					
				}
		else {
			
			PrintWriter out=response.getWriter();
			out.println("your user or password is not correct here!");
			out.println("<a href='index.jsp'></a>");
		}
				
				
				
		
		
		
	}

}
