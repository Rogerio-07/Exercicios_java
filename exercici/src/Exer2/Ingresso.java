package Exer2;

public class Ingresso {
	protected double valor;
	
	public Ingresso(){
		
	}

	Ingresso(double valor1){
		this.valor = valor1;	
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor2) {
		this.valor = valor2;
	}
	
	public String ToString() {
		return "O valor do Ingresso é: "+getValor();
	}
	
	
}
