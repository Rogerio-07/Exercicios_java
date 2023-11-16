package lista_me;

public class Execucao {

	public static void main(String[] args) {
		
		Pessoa Albert_Einstein  = new Pessoa();
		Pessoa Isaac_Newton = new Pessoa();
		
		Albert_Einstein.ajustaDatadeNascimento(14, 3, 1879);
		Isaac_Newton.ajustaDatadeNascimento(4, 12, 1643);
		
		Albert_Einstein.calcularIdade(7, 10,2023);
		Isaac_Newton.calcularIdade(7, 10, 2023);
		
		System.out.println("Se estivesse vivo, Albert Einstein teria "+Albert_Einstein.informeIdade()+" anos hoje.");
		System.out.println("Se estivesse vivo, Isaac Newton teria "+Isaac_Newton.informeIdade()+" anos hoje.");


	}

}
