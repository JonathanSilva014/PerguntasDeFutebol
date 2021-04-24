package logica;

import java.util.Scanner;

public class main{
	
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int pontos = 0;
		System.out.println("Bem Vindo Jogador! Pressione s para continuar");
		String string = scanner.nextLine();
		
		if(string.equals("s")) {
			
			System.out.println("Qual foi o melhor Jogador do mundo no Ano de 2009 ?");
			System.out.println("Opção A Lionel Messi");
			System.out.println("Opção B Cristiano Ronaldo");
			System.out.println("Opção C Frank Lampard");
			string = scanner.nextLine();
			
			if(string.equals("a")) {
				System.out.println("Voce pontuou! Parabens");
				System.out.println("Voce deseja continuar? (s) ou desistir? (d)");
				string = scanner.nextLine();
				
				if(string.equals("s")) {
					System.out.println("Okey Proxima Pergunta!");
				}
				
				
		
				else {
					System.out.println("Game Over! Sua pontuação foi de:" +pontos);
				}
				
			}
			
			else {
				System.out.println("Game Over! Sua pontuação foi de:" +pontos);
			}
			
		}
		
		else {
			System.out.println("Acabou o jogo... você fez 0 pontos");
			
			
		}
		
		System.out.println("Qual foi o clube campeão da champions league de 2012 ?");
		System.out.println("Opção A Liverpool");
		System.out.println("Opção B Real Madrid");
		System.out.println("Opção C Chelsea");
		string = scanner.nextLine();
		
		if(string.equals("c")) {
			System.out.println("Voce pontuou! Parabens");
			System.out.println("Voce deseja continuar? (s) ou desistir? (d)");
			string = scanner.nextLine();
			
			if(string.equals("s")) {
				System.out.println("Okey Proxima Pergunta!");
			}
		
			System.out.println("Qual foi o clube campeão Brasileiro do ano de 2005 ?");
			System.out.println("Opção A Corinthias");
			System.out.println("Opção B Internacional");
			System.out.println("Opção C Goiais");
			string = scanner.nextLine();
		
			if(string.equals("a")) {
				System.out.println("Voce pontuou! Parabens");
				System.out.println("Voce deseja continuar? (s) ou desistir? (d)");
				string = scanner.nextLine();
				
				if(string.equals("s")) {
					System.out.println("Okey Proxima Pergunta!");
				}
				
				
		
				else {
					System.out.println("Game Over! Sua pontuação foi de:" +pontos);
				}
				
			}
		
		
}
	}
}