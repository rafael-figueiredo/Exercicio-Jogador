
public class Principal {
	public static void main(String args[]) {
		Jogador[] j = new Jogador[2];
		j[0] = new Jogador("Nelson", "Defesa", "Brasileiro", 1960, 1.75f, 70.0f);
		j[1] = new Jogador("Rafael", "Atacante", "Brasileiro", 2000, 1.70f, 79.0f);
		
		System.out.println(j[0].dadosJogador());
		
		System.out.println("");
		
		j[0].calcularIdade();
		
		System.out.println("");
		
		j[0].Aposentar();
		
		System.out.println("");
		
		System.out.println(j[1].dadosJogador());
		
		System.out.println("");
		
		j[1].calcularIdade();
		
		System.out.println();
		
		j[1].Aposentar();
	}
}
