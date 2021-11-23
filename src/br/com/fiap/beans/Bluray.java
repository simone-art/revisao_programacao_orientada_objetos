package br.com.fiap.beans;

public class Bluray {
	
	//Delimitando o modificador do acesso do atributo como private 
	//para que assim só essa classe possa ter acesso ao mesmos
	
	//Deve ser criados os getter e setter para poder ter acesso aos atributo que agoram são private
	private String titulo;
	private int duracao;
	private int lancamento;
	private String genero;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getLancamento() {
		return lancamento;
	}
	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
