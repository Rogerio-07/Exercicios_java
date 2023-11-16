package exerc2;

public class Contador {
	public int itens;
	
	
	public Contador() {
		
	}
	public Contador(int itens) {
		
		
	}
	
	public Contador(int itens, double valor) {
		valor = 0;
	}
	
	public Contador (String Funcionario, int itens, double valor) {
		
	}
	public int zerar() {
		this.itens = 0;
		return itens;
		
	}
	public int incrementar() {
		this.itens = itens + 1;
		return itens;
	
	}
	

}
