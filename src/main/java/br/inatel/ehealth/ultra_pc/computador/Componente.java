package br.inatel.ehealth.ultra_pc.computador;

public class Componente {

	private String tipo;
	private String nome;
	
	public Componente(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	//Getters
	public String getTipo() {
		return tipo;
	}

	public String getNome() {
		return nome;
	}
	
	
}
