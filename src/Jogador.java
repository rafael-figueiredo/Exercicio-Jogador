/* Crie uma classe para representar um jogador de futebol, com os atributos nome, posição, data de nascimento, nacionalidade,  altura e peso.
 *  Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos os dados do jogador. 
 *  Crie um método para calcular a idade do jogador e outro método para mostrar quanto tempo falta para o jogador se aposentar.
 *  Para isso, considere que os jogadores da posição de goleiro, se aposentam em média aos 40 anos, os jogadores da defesa aos 37
 *  os meio campos aos 36 e os atacantes aos 36.*/
public class Jogador {
	//Atributos
	private String nome, posicao, nacionalidade;
	private int anoNasc, idade;
	private float altura, peso;
	
	//Métodos Públicos
	
	public Jogador(String nome, String posicao, String nacionalidade, int dataNasc, float altura, float peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.nacionalidade = nacionalidade;
		this.anoNasc = dataNasc;
		this.idade = 0;
		this.altura = altura;
		this.peso = peso;
	}
	
	//Método para calcular idade do jogador
	public void calcularIdade() {
		this.setIdade(2021 - this.getDataNasc());
		System.out.println("O jogador " + this.getNome() + " possuí " + this.getIdade() + " anos.");
	}
	
	public void Aposentar() {
		if(this.getPosicao() == "Goleiro") {
			int tempo;
			tempo = 40 - this.getIdade();
			
			if(tempo <= 0) {
				System.out.println("O jogador "+ this.getNome() + " está aposentado.");
			}else {
				System.out.println("O jogador "+ this.getNome() + " tem mais " + tempo + " anos de carreira para se aposentar");
			}
			
		} else if(this.getPosicao() == "Defesa") {
			int tempo;
			tempo = 37 - this.getIdade();
			
			if(tempo <= 0) {
				System.out.println("O jogador "+ this.getNome() + " está aposentado.");
			}else {
				System.out.println("O jogador "+ this.getNome() + " tem mais " + tempo + " anos de carreira para se aposentar");
			}
			
		} else if(this.getPosicao() == "Meio Campo") {
			int tempo;
			tempo = 36 - this.getIdade();
			
			if(tempo <= 0) {
				System.out.println("O jogador "+ this.getNome() + " está aposentado.");
			}else {
				System.out.println("O jogador "+ this.getNome() + " tem mais " + tempo + " anos de carreira para se aposentar");
			}
			
		} else if(this.getPosicao() == "Atacante") {
			int tempo;
			tempo = 36 - this.getIdade();
			
			if(tempo <= 0) {
				System.out.println("O jogador "+ this.getNome() + " está aposentado.");
			}else {
				System.out.println("O jogador "+ this.getNome() + " tem mais " + tempo + " anos de carreira para se aposentar");
			}
			
		}else {
			System.out.println("Posição incorreta!");
		}
			
	}
	
	//Métodos Especiais
	public String getNome() {   
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getDataNasc() {
		return anoNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.anoNasc = dataNasc;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
	public String dadosJogador() {
		return "Jogador [nome = " + nome + ", posicao = " + posicao + ", nacionalidade = " + nacionalidade + ", dataNasc = "
				+ anoNasc + ", altura = " + altura + ", peso = " + peso + "]";
	}
}
