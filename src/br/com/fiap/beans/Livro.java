package br.com.fiap.beans;

public class Livro extends Produto{
	
	private String autor;
	private String editora;
	private int edicao;
	
	
	public Livro(int id, String titulo, int duracao, int lancamento, String autor, String editora, int edicao) {
		super(id, titulo, duracao, lancamento);
		this.autor = autor;
		this.editora = editora;
		this.edicao = edicao;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public int getEdicao() {
		return edicao;
	}


	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	

	
	
}
