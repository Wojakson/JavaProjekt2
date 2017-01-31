package com.example.eDoc.web.filters;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.eDoc.model.*;

@WebFilter(urlPatterns={"/podglad.jsp"})

public class PodgladFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}
		public void doFilter(ServletRequest request, ServletResponse response,
				FilterChain chain) throws IOException, ServletException {
			
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse) response;
			
			
			HttpSession session = req.getSession();
		
			List<Pacjent> pacjenci =(List<Pacjent>)session.getAttribute("pacjenci") ;
			if (pacjenci == null || pacjenci.size() == 0){
				
				resp.sendRedirect("/eDoc/addPacjent.html");
				
			}
			
			else{
				chain.doFilter(req, resp);
			}
			
		}

		public void init(FilterConfig arg0) throws ServletException {

		}
}
