package exercicio_inteface;

public class Ponto implements FormaGeometrica{
	private double coordx;
	private double coordy;

	
	public Ponto(double x, double y) {
		this.coordx = x;
		this.coordy = y;
	}
	
	 public String forma() {
		 return "Ponto: (coordx = "+ this.coordx+" coordy = "+this.coordy +")";
	 }
	 
	public void mostrar() {
		System.out.println(this.forma());
	}
}
