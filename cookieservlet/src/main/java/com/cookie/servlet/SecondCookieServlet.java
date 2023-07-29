package com.cookie.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondCookieServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) {
	
	try {response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie []ck=request.getCookies();
		out.print("Hello"+ck[0].getValue());
	out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}}
