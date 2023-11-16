package exercicio_interface2;

public class Peixe extends Animal implements AnimalDeEstimacao {
	
	private String nome;
	
	
	public Peixe(String nome1) {
		this.nome = nome1;
		this.pernas = 0;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome2) {
		this.nome = nome2;
	}
	
	public void brincar() {
		System.out.println("O peixe "+getNome()+" brinca no aquario com as bolhas.\n");
	}
	
	public void comer() {
		System.out.println("o peixe "+getNome()+ " come a ração apropriada.\n");
	}
	
	public void scanAnimal() {
		System.out.println("o peixe "+getNome()+" não possui pernas e sim barbatanas.\n");
	}

}
