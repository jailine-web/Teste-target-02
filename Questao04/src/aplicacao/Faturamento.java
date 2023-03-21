package aplicacao;

import java.util.Scanner;

public class Faturamento {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor total de vendas da empresa no mês: ");
		double valorTotal = ler.nextDouble();
		
		System.out.print("Digite o valor mensal de faturamento da filial: ");
		double valorMensal = ler.nextDouble();
		
		double porcentagem = faturamento(valorTotal, valorMensal);
		
		System.out.println("A porcentagem de faturamento mensal da filial foi de: "+String.format("%.2f", porcentagem)+"%");
	}
	
	public static double faturamento(double valorT, double valorM) {
		double resultado;
		resultado = (valorM*100)/valorT;
		return resultado;
	}

}
