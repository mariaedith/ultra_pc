package br.inatel.ehealth.ultra_pc;


import br.inatel.ehealth.ultra_pc.cliente.Cliente;
import br.inatel.ehealth.ultra_pc.computador.Componente;
import br.inatel.ehealth.ultra_pc.computador.Computador;
import br.inatel.ehealth.ultra_pc.computador.MemoriaUSB;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Maria Edith", 123, 2);
		
		Computador pc1 = new Computador("AlienWare", 6000, 4, "SteamOS");
		Computador pc2 = new Computador("Positivo da Xuxa", 1800, 4, "Windows 98");
		
		pc1.addComponentes(new Componente("GPU", "Geforce RTX 3080"));
		pc1.addComponentes(new Componente("CPU", "Intel i5"));
		pc1.addComponentes(new Componente("SSD", "1TB"));
		pc1.addComponentes(new Componente("RAM", "32GB"));

		pc1.mostraPcConfig();
		
		cliente.addComputador(pc1);
		
		pc2.addComponentes(new Componente("CPU", "Pentium III"));
		pc2.addComponentes(new Componente("HD", "100GB"));
		pc2.addComponentes(new Componente("RAM", "1GB"));
		pc2.addComponentes(new Componente("Modem", "Discado"));
		pc2.addMemoriaUSB(new MemoriaUSB("Kingston", 8));
		
		pc2.mostraPcConfig();
		
		cliente.addComputador(pc2);
		
		System.out.println("\n" + "Valor total da compra = " + cliente.calculaCompra());
	}

}
