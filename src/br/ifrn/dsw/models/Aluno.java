package br.ifrn.dsw.models;

public class Aluno {
	
	private int matricula;
	private String nome;
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return Aluno.this.getNome() + " - Matr�cula: " + Aluno.this.getMatricula();
	}
	
}
