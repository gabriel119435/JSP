package domain;

public class Pessoa {
	private String nome;
	private String sexo;
	private String carro;
	private String foguete;

	public Pessoa(String nome, String sexo, String carro, String foguete) {
		this.nome = nome;
		this.sexo = sexo;
		this.carro = carro;
		this.foguete = foguete;
	}

	public String getNome() {
		return nome;
	}

	public String getFoguete() {
		return foguete;
	}

	public String getCarro() {
		return carro;
	}

	public String getSexo() {
		return sexo;
	}
}
