import java.util.*; 
public class PedraPapelAtaque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {
          
            String jogador1 = leitor.next();
            String jogador2 = leitor.next();
            
            //Ataque x Pedra: Ataque
			if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra"))
				System.out.println("Jogador 1 venceu");
			else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("pedra"))
				System.out.println("Jogador 2 venceu");

			//Pedra x Papel: Pedra
			else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel"))
				System.out.println("Jogador 1 venceu");
			else if (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel"))
				System.out.println("Jogador 2 venceu");
			
			//Papel x ataque: Ataque
			else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("papel"))
				System.out.println("Jogador 1 venceu");
			else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel"))
				System.out.println("Jogador 2 venceu");
			
			//Papel x Papel: ambos ganham
			else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
				System.out.println("Ambos venceram");
			
			//Pedra x Pedra: não há ganhador
			else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("pedra"))
				System.out.println("Sem ganhador");
			
			//ataque x ataque: todos perdem
			else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
				System.out.println("Aniquilacao mutua");
        }

        leitor.close();
    }
}
