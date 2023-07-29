package com.cookie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstCookieServlet extends HttpServlet{
public void doPost( HttpServletRequest request,HttpServletResponse response) throws IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String username=request.getParameter("username");
	out.print("welcome"+username);
	Cookie cookie=new Cookie("username",username);
	response.addCookie(cookie);
	out.print("<form action='SecondCookieServlet'> ");
	out.print("<input type='submit'value='GO'>");
	out.print("</form>");
	out.close();
}

}
