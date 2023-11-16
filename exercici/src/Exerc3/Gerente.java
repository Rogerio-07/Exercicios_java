package Exerc3;

public class Gerente extends Empregado {
	private String departamento;
	
	Gerente(){
		
	}
	
	public String getDepartamento() {
		return this.departamento;
	}
	
	public void setDepartamento(String departamento1) {
		this.departamento = departamento1;
	}
	
	public String ToString() {
		return "O nome do Gerente é "+getNome()+ ", o seu salario é "+getSalario()+ "e faz parte do departamento "+getDepartamento();
	}
	
}
