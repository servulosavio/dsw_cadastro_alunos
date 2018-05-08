package br.ifrn.dsw.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.dsw.bd.AlunoBD;

@WebServlet("/ListarAlunos.java")
public class ListarAlunos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    	
    	PrintWriter out = response.getWriter();
				
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Lista de Alunos</h1>");
		out.println("<ul>");	
		for (int i = 0; i < AlunoBD.getListaAlunos().size(); i++) {
			out.println("<li>" + AlunoBD.getListaAlunos().toArray()[i] + "</li>");
		}
		out.println("</ul>");
		
		out.println("<h3>Remover Alunos</h3>");
		out.println("<form action=\"remover_aluno\" method=\"post\">");
		out.println("Matrícula: <input type=\"text\" name=\"matricula\"><br>");
		out.println("<input type=\"submit\" value=\"Remover Aluno\">");
		out.println("</form>");
		
		out.println("<a href=\"index.html\">Início</a>");
		out.println("</body>");
		out.println("</html>");
		
		AlunoBD.getListaAlunos();
	}

}