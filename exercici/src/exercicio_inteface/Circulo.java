package exercicio_inteface;

public class Circulo implements FormaGeometrica {
	
	private Ponto centro;
	private double raio;

	public Circulo (Ponto p, double r) {
		this.centro = p;
		this.raio = r;
	}
	
	public String forma() {
		return "Circulo: centro = " +centro.forma()+"; raio = "+raio;
	}
	
	public void mostrar() {
		System.out.println(this.forma());	
	}
}
