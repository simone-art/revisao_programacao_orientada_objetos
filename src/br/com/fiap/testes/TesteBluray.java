package br.com.fiap.testes;

import br.com.fiap.beans.Bluray;

public class TesteBluray {
	
	public static void main(String[] args) {
		
		
		//Instanciando o objeto
		Bluray bluray = new Bluray();
		
		//Só consegui ter acesso ao titulo ao colocar no atributo o modificar de acesso public
		bluray.titulo = "Homen Aranha: Sem volta para casa";
		
	}

}
