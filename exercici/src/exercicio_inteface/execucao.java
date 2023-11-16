package exercicio_inteface;

public class execucao {

	public static void main(String[] args) {
		Ponto b = new Ponto(6,9);
		b.mostrar();
		
		Circulo a = new Circulo(b,8);
		a.mostrar();
		
		Cilindro c = new Cilindro (a,7);

	}

}
