package br.com.alura.gerenciador.web;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns="/logout")
public class Logout implements Tarefa{
	
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		

		HttpSession session = req.getSession();
		session.removeAttribute("logado");//apaga somente host
		//session.invalidate(); apaga totalmente cliente e no host
		//resp.sendRedirect("logout.html");// Redireciona como 302			
		return "/WEB-INF/paginas/logout.html";
	}


}
