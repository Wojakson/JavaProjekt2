package com.example.eDoc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.eDoc.model.Pacjent;

@WebServlet("/pacjentServlet")
public class PacjentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response)
			throws ServletException, IOException {

		Pacjent pacjent = new Pacjent();
		pacjent.setName(request.getParameter("name"));
		pacjent.setSurname(request.getParameter("surname"));
		pacjent.setAdress(request.getParameter("adress"));
		pacjent.setZipcode(request.getParameter("zipcode"));
		pacjent.setName(request.getParameter("city"));
		pacjent.setSurname(request.getParameter("region"));
		pacjent.setName(request.getParameter("country"));
		pacjent.setSurname(request.getParameter("phone"));
		pacjent.setEmail(request.getParameter("email"));
		HttpSession session = request.getSession();
		session.setAttribute(SessionKey.pacjent, pacjent);
		response.sendRedirect("podglad.jsp");
	} 

}
