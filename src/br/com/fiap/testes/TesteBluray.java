package br.com.fiap.testes;

import br.com.fiap.beans.Bluray;

public class TesteBluray {
	
	public static void main(String[] args) {
		
		
		//Instanciando o objeto
		Bluray bluray = new Bluray();
		
		//Como o atributo titulo passou a ser private, só se pode ter acesso 
		//com os getters e setter 
		bluray.setTitulo("Homen Aranha: Sem volta para casa");
		System.out.println(bluray.getTitulo());
		
	}

}
