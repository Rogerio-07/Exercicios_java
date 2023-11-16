package Exer2;

public class IngressoVIP extends Ingresso{
	private double ValorAdicional;
	
	public IngressoVIP() {
		
	}
	
	public IngressoVIP(double ValorAdicional1) {
		
		this.ValorAdicional = ValorAdicional1;
	}
	
	public double getValorAdicional() {
		return this.ValorAdicional;
	}
	
	public void setValorAdicional(double ValorAdicional2) {
		this.ValorAdicional = ValorAdicional2;
	}
	
	public String ToString() {
		double valor9 = 0;
				valor9 = this.valor + this.ValorAdicional;
		
		//valor = this.valor + this.ValorAdicional;
		return "O valor do ingresso ViP é: "+valor9;
	}
	
	
}
