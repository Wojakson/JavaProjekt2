package com.example.eDoc.web.filters;

import java.io.IOException;

import com.example.eDoc.model.Pacjent;
import com.example.eDoc.web.SessionKey;
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


@WebFilter(urlPatterns={"/pacjentServlet", "/podglad.jsp","/finalize"})
public class AddPacjentFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpSession session = req.getSession();
        Pacjent pacjent = (Pacjent) session.getAttribute(SessionKey.pacjent);
        if(pacjent==null){
            ((HttpServletResponse) response).sendRedirect("/eDoc/index.html");
        }
        else{
            chain.doFilter(request, response);
        }
    }

	

	public void destroy() {
		// TODO Auto-generated method stub

	}

}
