package br.ifrn.dsw.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.dsw.bd.AlunoBD;

@WebServlet("/remover_aluno")
public class RemoverAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String matricula = request.getParameter("matricula");
		PrintWriter out = response.getWriter();
		
		int mat = Integer.parseInt(matricula);
		if(AlunoBD.removerAluno(mat)){
//			request.getRequestDispatcher("/").forward(request, response);
			out.println("Matrícula removida com sucesso!");
			response.sendRedirect("ListarAlunos.java");
		}else {
			out.println("Matrícula: "+matricula +" não existente.");
		}
		
	}

}
