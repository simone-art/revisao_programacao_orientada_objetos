package br.com.fiap.beans;

public class Produto {
	
	private int id;
	private String titulo;
	private int duracao;
	private int lancamento;
	
	//Construtores com todos os parâmetros
	public Produto(int id, String titulo, int duracao, int lancamento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.duracao = duracao;
		this.lancamento = lancamento;
	}
	
	//Getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	


}
