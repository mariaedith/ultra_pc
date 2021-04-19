package br.inatel.ehealth.ultra_pc.cliente;

import br.inatel.ehealth.ultra_pc.computador.Computador;

public class Cliente {
	
	private String nome;
	private long cpf;
	private Computador computador[];
	
	
	public Cliente(String nome, long cpf, int qntComputador) {
		this.nome = nome;
		this.cpf = cpf;
		this.computador = new Computador [qntComputador];
	}

	public double calculaCompra() {
		double total = 0;
		for (int i = 0; i < computador.length; i++) {
			total += computador[i].getPreco();
		}
		return total;
	}
	
	public void addComputador (Computador computador) {
		for (int i = 0; i < this.computador.length; i++) {
			if(this.computador[i] == null)//posi��o vaga
			{   
			this.computador[i] = computador;
			break;
			}
		}
	}
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public long getCpf() {
		return cpf;
	}
}
