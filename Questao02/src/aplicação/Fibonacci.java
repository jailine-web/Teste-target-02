package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		List<Integer> num = new ArrayList<>();
		
		int anterior = 0, atual = 1, proximo = 0;
		
		for (int i = 0; i < 50;i++) {
			
			num.add(anterior);
			//System.out.print(anterior + " ");
			proximo = atual + anterior;
			anterior = atual;
			atual = proximo;
		}
		
		System.out.print("Digite o número que deseja saber se faz parte da sequência de Fibonnacci: ");
		int n = ler.nextInt();
		
		if(num.contains(n)) 
			System.out.println("O número pertence a sequência de Fibonacci!");
		else {
			System.out.println("O número não pertence a sequência de Fibonacci!");
		}
	}
	

}
