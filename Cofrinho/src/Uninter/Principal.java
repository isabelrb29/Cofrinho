package Uninter;

import java.util.Scanner;

public class Principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//instanciando o scanner para conseguir processar o que o usuario digita
		Scanner usuario = new Scanner(System.in);
		
		//instanciando o objeto poupanca da classe Cofrinho para ser usado nessa classe principal
		Cofrinho poupanca = new Cofrinho();
		
		//variaveis
		int operacao;
		double valorMoeda = 0;
		int tipoMoeda;
		Moeda moeda;
		
		//Menu Principal
		System.out.println("POUPANCA:");
		System.out.println("1 - Adicionar moedas");
		System.out.println("2 - Remover moedas");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular total em Real");
		System.out.println("0 - Encerrar");
		System.out.println();
		operacao = usuario.nextInt();
		
		//looping para escolha de operacao do menu
		while(operacao != 0) {
			switch(operacao) {
			
			//operacao: Adicionar moedas
			case 1:
				tipoMoeda = 0;
				//looping para que o usuario escolha uma opacao valida
				while(tipoMoeda != 1 && tipoMoeda != 2 && tipoMoeda != 3) {
					//mini menu para escolha da moeda
					System.out.println("Qual a moeda deseja adicionar?");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					tipoMoeda = usuario.nextInt();
				}
				//iniciando a variavel moeda sem valor
				moeda = null;
				//caso moeda escolhida = dolar
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Dolar(valorMoeda);
				}
				//caso moeda escolhida = euro
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Euro(valorMoeda);
				}
				//caso moeda escolhida = real
				else {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Real(valorMoeda);
				}
				//adicionando o valor digitado na lista de moedas
				poupanca.adicionar(moeda);
				System.out.println("Operacao realizada com sucesso!");
				break;
				
			//operacao: Remover moedas
			case 2:
				tipoMoeda = 0;
				//looping para que o usuario escolha uma opacao valida
				while(tipoMoeda != 1 && tipoMoeda != 2 && tipoMoeda != 3) {
					//mini menu para escolha da moeda
					System.out.println("Qual a moeda deseja remover?");
					System.out.println("1 - Dolar");
					System.out.println("2 - Euro");
					System.out.println("3 - Real");
					tipoMoeda = usuario.nextInt();
				}
				moeda = null;
				//caso moeda escolhida = dolar
				if(tipoMoeda == 1) {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Dolar(valorMoeda);
				}
				//caso moeda escolhida = euro
				else if(tipoMoeda == 2) {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Euro(valorMoeda);
				}
				//caso moeda escolhida = real
				else {
					System.out.println("Digite o valor: ");
					valorMoeda = usuario.nextDouble();
					moeda = new Real(valorMoeda);
				}
				//removendo o valor digitado da lista de moedas
				poupanca.remover(moeda);
				System.out.println("Operacao realizada com sucesso!");
				break;
				
			//operacao: Listar moedas
			case 3:
				poupanca.listagemMoedas();
				break;
				
			//operacao: Calcular valor total em reais
			case 4:
				double valorTotalConvertido = poupanca.totalConvertido();
				System.out.printf("O valor total convertido para real eh: %.2f\n", valorTotalConvertido);
				break;
				
			//caso o usuario digite um valor fora dos citados no menu	
			default:
				System.out.println("Operacao invalido.");
			}
			//mostrando novamente o menu para nova operacao
			System.out.println("\nPOUPANCA:");
			System.out.println("1 - Adicionar moedas");
			System.out.println("2 - Remover moedas");
			System.out.println("3 - Listar moedas");
			System.out.println("4 - Calcular total em Real");
			System.out.println("0 - Encerrar");
			operacao = usuario.nextInt();
		}
		
	}

}
