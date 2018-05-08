package br.ifrn.dsw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.dsw.bd.AlunoBD;
import br.ifrn.dsw.models.Aluno;


@WebServlet("/add_aluno")
public class AdicionarAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		int matricula = Integer.parseInt(request.getParameter("matricula"));
   		String nome = request.getParameter("nome");
   		
   		Aluno novo = new Aluno();
   		
   		novo.setMatricula(matricula);
   		novo.setNome(nome);
   		AlunoBD.adicionarAluno(novo);
   		
   		
   		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Aluno Adicionado com Sucesso!</h1>");
		out.println("<ul>");
		
		out.println("<li><a href=\"adiciona-aluno.html\">Adicionar Novo Aluno</a></li>");
		out.println("<li><a href=\"index.html\">Início</a></li>");	
				
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
   		
   		
	}

}
