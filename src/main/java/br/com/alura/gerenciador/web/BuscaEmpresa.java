package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;


@WebServlet(urlPatterns="/busca")
public class BuscaEmpresa implements Tarefa {
	
	
		@Override
		public java.lang.String executa(HttpServletRequest req, HttpServletResponse resp) {
			

			String filtro = req.getParameter("filtro");//pega o parametro do filtro ex. filtro=oo: pega o "oo"
			Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
			req.setAttribute("empresas", empresas);//set as empresas para a view
			return "/WEB-INF/paginas/buscaEmpresa.jsp";					
			
		}

	
	
	
}
