package br.com.fiap.beans;

public class Bluray {
	
	//Delimitando o modificador do acesso do atributo como private 
	//para que assim só essa classe possa ter acesso ao mesmos
	
	private String titulo;
	private int duracao;
	private int lancamento;
	private String genero;
	
	//Construtor vazio
	
	public Bluray() {
		
	}
	
	//Construtor com parámetros
	public Bluray(String titulo, int duracao, int lancamento, String genero) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
		this.lancamento = lancamento;
		this.genero = genero;
	}




	//Deve ser criados os getter e setter para poder ter acesso aos atributo que agoram são private
	
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
