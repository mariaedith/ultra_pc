package br.inatel.ehealth.ultra_pc.computador;

public class MemoriaUSB {

	private String marca;
	private long capacidade;
	
	public MemoriaUSB(String marca, long capacidade) {
		this.marca = marca;
		this.capacidade = capacidade;
	}
	
	//Getters e Setters
	public String getMarca() {
		return marca;
	}
	
	public long getCapacidade() {
		return capacidade;
	}
	
}
