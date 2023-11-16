package Exerc3;

public class Execucao {

	public static void main(String[] args) {
		
		Empregado Rogerio = new Empregado();
		Rogerio.setNome("Rogerio");
		Rogerio.setSalario(1000);
		
		
		Vendedor b = new Vendedor("Joao", 2000, 1.2);
		
		Empregado c = new Vendedor();
		
		b.CalcularSalario();
		
		System.out.println(b.ToString());
			
		}
		
		//System.out.println(Rogerio.ToString());
		
	}


