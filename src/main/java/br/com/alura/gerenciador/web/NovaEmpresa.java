package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;
import sun.rmi.server.Dispatcher;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresa implements Tarefa{


	@Override
	public java.lang.String executa(HttpServletRequest req, HttpServletResponse resp) {
		
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		req.setAttribute("nome", nome);// set no nome para continuar na session e enviar o nome para a proxima tela
		return "/WEB-INF/paginas/novaEmpresa.jsp";
		
	}
		
		
	
	
}
