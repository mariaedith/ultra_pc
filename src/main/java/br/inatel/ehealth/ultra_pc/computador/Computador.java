package br.inatel.ehealth.ultra_pc.computador;

public class Computador {

	private String marca;
	private double preco;
	private Componente componentes[];
	private MemoriaUSB memoria;
	private SistemaOperacional sistemaOp;
	
	//Sistema operacional � composi��o, computador tem que cria-lo
	public Computador(String marca, double preco, int qntComponentes, String nomeSistema) {
		this.marca = marca;
		this.preco = preco;
		this.componentes = new Componente [qntComponentes];
		this.sistemaOp = new SistemaOperacional(nomeSistema);
	}
	
	public void mostraPcConfig() {
		System.out.println("PC");
		System.out.println("Marca: " + this.marca + "\n");
		System.out.println("Pre�o: " + this.preco + "\n");
		System.out.println("Componentes");
		for (int i = 0; i < componentes.length; i++){
	    if (componentes[i] != null)
	    		System.out.println("Nome: " + componentes[i].getNome() + "\n" + "Tipo: " + componentes[i].getTipo());
		}
		System.out.println("\n");
		System.out.println("Mem�ria");
		if(memoria != null)
			System.out.println("Marca: " + memoria.getMarca() + "\n" +  "Capacidade: " + memoria.getCapacidade() + "\n");
		System.out.println("Sistema Operacional: " + sistemaOp.getNome() + "\n");
	}
	
	public void addMemoriaUSB(MemoriaUSB mem) {
		this.memoria = mem;
	}
	
	public void addComponentes(Componente comp) {
		for (int i = 0; i < componentes.length; i++) {
			if(this.componentes[i] == null)//posi��o vaga
			{   
				componentes[i] = comp;
				break;
			}
		}
	}
	
	//Getters
	public double getPreco() {
		return preco;
	}
	
}
