package Senai;

public class Jogadores {
	private String nome;

	public Jogadores(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Jogador " + nome + ", ";
	}

}
