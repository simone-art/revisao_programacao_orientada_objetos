package br.com.fiap.beans;

public class Bluray extends Produto{
	
	//Delimitando o modificador do acesso do atributo como private 
	//para que assim só essa classe possa ter acesso ao mesmos
	
	private String genero;
	
	//Construtor
	
	public Bluray(int id, String titulo, int duracao, int lancamento, String genero) {
		super(id, titulo, duracao, lancamento);
		this.genero = genero;
	}


	//Deve ser criados os getter e setter para poder ter acesso aos atributo que agoram são private
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	

}
