package Exerc3;

public class Empregado {
	
	protected String nome;
	protected double salario;
	
	Empregado(){
		
	}
	
	Empregado(String nome1, double salario1){
		this.nome = nome1;
		this.salario = salario1;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome1) {
		this.nome = nome1;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario1) {
		this.salario = salario1;
	}
	
	public String ToString() {
		return "Nome do Empregado é "+getNome()+" e o seu salario é "+getSalario();
	}
	
}
