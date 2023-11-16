package exerc2;

public class Funcionario {
	public String nome;
	public double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public void addAumento(double valor){
	this.salario = this.salario + valor;

	}
	
	public double ganhoAnual(){
	this.salario = this.salario*12;
	return this.salario;

	}
	public String getNome() {
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
		
	}

	public void exibeDados(){
	
	System.out.println("nome: "+this.nome+ " e salario: "+this.salario);

	}


}
