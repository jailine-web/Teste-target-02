package aplicacao;

import java.util.Scanner;

public class InversaoDeString {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a palavra(String) que deseja inverter: ");
		String palavra = ler.next();

		System.out.println(stringReversa(palavra));

	}

	public static String stringReversa(String palavra) {
		String palavraReversa = "";

		for (int i = palavra.length() - 1; 0 <= i; i--) {
			palavraReversa += palavra.charAt(i);
		}
		return palavraReversa;
	}

}
