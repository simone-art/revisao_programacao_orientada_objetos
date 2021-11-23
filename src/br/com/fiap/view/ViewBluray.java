package br.com.fiap.view;

import java.util.Scanner;

import br.com.fiap.beans.Bluray;

public class ViewBluray {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		 System.out.println("Cadastro de filme!");
		 String titulo, genero;
		 int id, duracao, lancamento;
		 
		 System.out.println("Por favor, informe o id: ");
	      id = leitor.nextInt();
		 System.out.println("Por favor, informe o nome do filme: ");
	      titulo = leitor.nextLine();
	      System.out.println("Por favor, informe o gênero do filme: ");
	      genero = leitor.nextLine();
	      System.out.println("Por favor, informe a duração do filme: ");
	      duracao = leitor.nextInt();
	      System.out.println("Por favor, informe o ano de lancamento do filme: ");
	      lancamento = leitor.nextInt();
	        
	        Bluray bluray = new Bluray(id, titulo, duracao, lancamento, genero);
	        System.out.println("O filme " + bluray.getTitulo() + " foi cadastrado");
	    
	      
	}

}
