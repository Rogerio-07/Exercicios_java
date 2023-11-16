package exercici;

import java.util.ArrayList;

public class Exec {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(new Veiculo("XPO-0987", 2010));
		veiculos.add(new Veiculo("MNM-0978", 2016));
		
		ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
		veiculos.add(new Caminhao("HHH - 3456", 2005,6));
		
		for(Veiculo veiculo : veiculos) {
			veiculo.exibirDados();
		}
		for(Caminhao caminhao : caminhoes) {
			caminhao.exibirDados();
		}
	}

}
