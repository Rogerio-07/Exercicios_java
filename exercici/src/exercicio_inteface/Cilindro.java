package exercicio_inteface;

public class Cilindro implements FormaGeometrica {
	private Circulo base;
	private double altura;
	
	
	public Cilindro (Circulo c, double h) {
		this.base = c;
		this.altura = h;
	}
	
	public String forma() {
		return "Cilindro: base = "+base.forma()+"; altura = "+altura;
	}
	
	public void mostrar() {
		System.out.println(this.forma());
	}

}
