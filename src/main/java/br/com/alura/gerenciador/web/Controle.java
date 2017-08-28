package br.com.alura.gerenciador.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/controle")
public class Controle extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// qual tarefa quero executar?

		String tarefa = req.getParameter("tarefa");
        
		
		if (tarefa == null) 
			throw new IllegalArgumentException("Você esqueceu de passar a Tarefa");
		
		try {
			// Nome da classe que desejamos executar
			String nomeDaClasse = "br.com.alura.gerenciador.web." + tarefa; 
			
			//API de Java que permite a criação dinâmica de objetos
			
			Class<?> type = Class.forName(nomeDaClasse);
						
			//instancia de um objeto do tipo da classe anterior
			Tarefa instancia = (Tarefa) type.newInstance();
			String pagina = instancia.executa(req, resp);
			System.out.println("pagina: " + pagina);
			// para qual página desejo ir?
			
			RequestDispatcher dispacher = req.getRequestDispatcher(pagina);
			dispacher.forward(req, resp);
			
		} catch (Exception e) {
			throw new ServletException(e);
		} 
		
		
	}
		
}
