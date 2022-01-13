package br.com.bibs.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//oi			urlPatterns = nome do servlet
@WebServlet(urlPatterns="/bibs-server")
public class Hello extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// getWriter = dados textuais || get OutputStream = conteúdo binário
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Olá, mundo Servlet.");
		out.println("</body>");
		out.println("</html>");
	}
	

}


/**
 * Para usar o Override escrevi a palavra service, dei ctrl + espaço
 * e escolhi a primeira opção, que cria uma request e uma response
 */