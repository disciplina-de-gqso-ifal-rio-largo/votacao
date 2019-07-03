package edu.ifal.votacao;

public class ControleTest {

	public static void main(String[] args) {
		Controle controle = new Controle();
		int idade; 
		boolean podeVotar;
		
		/**
		 * Teste 1
		 */
		idade = 10;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Falhou no teste 1");
		else
			System.out.println("Passou no teste 1");
		
		/**
		 * Teste 2
		 */
		idade = 20;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Passou no teste 2");
		else
			System.out.println("Falhou no teste 2");
		
		/**
		 * Teste 3
		 */
		idade = 16;
		podeVotar = controle.permiteVotar(idade);
		if(podeVotar)
			System.out.println("Passou no teste 3");
		else
			System.out.println("Falhou no teste 3");
		
		

	}

}
