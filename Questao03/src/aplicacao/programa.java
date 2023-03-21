package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Faturamento;

public class programa {

	public static void main(String[] args) {

		List<Faturamento> fat = new ArrayList<>();
		
		String caminho = "C:\\Users\\Jai\\Documents\\Teste target\\faturamento.csv";
		Scanner leitor = new Scanner(System.in);
		
		try(BufferedReader ler = new BufferedReader(new FileReader(caminho))){
			String linha = ler.readLine();
			
			while(linha != null) {
				
				String[] dados = linha.split(",");
				
				fat.add(new Faturamento(dados[0], Double.parseDouble(dados[1]),  Double.parseDouble(dados[1])));
				
				linha = ler.readLine();
			}
			
			for(Faturamento f : fat) {
				System.out.println(f);
				
			}
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
