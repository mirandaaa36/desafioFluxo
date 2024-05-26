package desafioFluxo;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		int parametroUm = terminal.nextInt();
		int parametroDois = terminal.nextInt();
		
		try {
			
			// chamando método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException exception) {
			// Imprime a mensagem: o segundo parâmetro deve ser maior que o primeiros
			System.out.println(exception.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		// validar se parametroUm é MAIOR que o parametroDois e lançar exceção
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		int contagem = parametroDois - parametroUm;
		
		// realizar o for para imprimir com base na variável contagem
		for (int i=0; i <= contagem; i++) {
			
			System.out.println("Imprimindo o número " + (i+1));
		}
		
		
	}
	
	
	
	

}
