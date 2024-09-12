package desafios.controleDeFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner tec = new Scanner(System.in); 
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = tec.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = tec.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		tec.close();
	} // fim da main

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois) 
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		//realizar o for para imprimir os números com base na variável contagem
		else {
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	} //fim da void contar
} //fim da classe