package iscae.mr;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/ws-rst/admin/*")
public class Authentification implements Filter {


    public Authentification() {
    	
    }

	public void destroy() {
		
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String user = request.getParameter("user");
		String pas = request.getParameter("password");
		
		if(memoire.isConnected(user)){
			chain.doFilter(request, response);
		}
		
		PrintWriter out = response.getWriter();
		out.print("Vous n'avez pas le droit");
		
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
