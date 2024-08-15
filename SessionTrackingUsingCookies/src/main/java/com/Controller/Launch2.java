package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/logout")
public class Launch2 extends HttpServlet{
 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookies[] = req.getCookies();
		Cookie cook = null;
		for (Cookie c : cookies) {
			if(c.getName().equals("check")) {
				cook=c;
			}
		}
		
		cook.setMaxAge(0);
		resp.addCookie(cook);
		resp.sendRedirect("login.html");
	}
}
