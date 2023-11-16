package Exerc3;

public class Vendedor extends Empregado {
	private double percentualComissao;
	
	Vendedor(){
		
	}
	
	Vendedor(String nome1, double salario1, double percentualComissao1){
		
		this.nome = nome1;
		this.salario = salario1;
		this.percentualComissao = percentualComissao1;
		
	}
	
	public double getPercentual() {
		return this.percentualComissao;
	}
	
	public void setPercentual(double comissao) {
		this.percentualComissao = comissao;
	}
	
	public double CalcularSalario() {
		double Salario2 = this.salario * getPercentual();
		
		return Salario2;
	}
		
	public String ToString() {
		return "O empregado é um vendedor de nome "+getNome()+" com salario de "+getSalario()+" e salario comissionado de "+CalcularSalario()+" com percentual de "+getPercentual();
	
	}
	
	
	
	
}
