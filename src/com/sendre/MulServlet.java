package com.sendre;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MulServlet
 */
@WebServlet("MulServlet")
public class MulServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int l=10;
		
		HttpSession session=request.getSession();
		int m=(int)session.getAttribute("result");
		
		int finalResult=l*m;
		PrintWriter pw=response.getWriter();
		pw.println("Result is ="+finalResult);
	}

}
