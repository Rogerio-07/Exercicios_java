package exerc2;

public class Assistente extends Funcionario {
	
	public int matricula;
	
	
	public Assistente(String nome, double salario,int matricula) {
		super(nome, salario);
		this.matricula = matricula;
		
	}

	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int novamatricula) {
		this.matricula = novamatricula;
	}
	@Override
	public void exibeDados(){
		
		System.out.println("funcionario: "+this.nome+ ",salario: "+this.salario+" e matricula "+this.matricula);
	
		}
	
}

