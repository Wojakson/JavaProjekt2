package com.example.eDoc.web;

import com.example.eDoc.dao.*;
import com.example.eDoc.model.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns="/finalize")
public class FinalizeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        HttpSession session = request.getSession();
        
        IRepositoryCatalog catalog;

            try {
				Class.forName("org.hsqldb.jdbcDriver");
				catalog = new RepositoryCatalog("jdbc:hsqldb:hsql://localhost/workdb");
				Pacjent pacjent = (Pacjent) session.getAttribute("pacjent");
	            List<Pacjent> pacjenci = (List<Pacjent>)session.getAttribute("pacjenci");
	            
	            catalog.pacjenci().add(pacjent);
	            catalog.saveAndClose();
	            session.removeAttribute("pacjent");
	            response.sendRedirect("addPacjent.html");
			} catch (Exception e) {

				e.printStackTrace();
			}
            
            
        }
}
    
