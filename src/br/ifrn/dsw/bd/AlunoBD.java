package br.ifrn.dsw.bd;

import java.util.ArrayList;
import java.util.List;

import br.ifrn.dsw.models.Aluno;

public class AlunoBD {
	
	public static List<Aluno> alunos = new ArrayList<Aluno>();
	
	public static boolean adicionarAluno(Aluno aluno) {
		return alunos.add(aluno);
	}
	
	public static Aluno buscarAluno(int matricula) {
		for(Aluno aluno: alunos) {
			if(aluno.getMatricula() == matricula) {
				return aluno;
			}
		}
		return null;
	}
	
	public static List<Aluno> getListaAlunos() {
		return alunos;
	}
	
	public static boolean removerAluno(int matricula) {
		Aluno aluno = buscarAluno(matricula);
		return alunos.remove(aluno);
	}
	
}
