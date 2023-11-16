package exercicio_interface2;

public class Cachorro extends Animal implements AnimalDeEstimacao{
	
	private String nome;
	
	
	public Cachorro(String nome1) {
		
		this.nome = nome1;
		this.pernas = 4;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome2) {
		this.nome = nome2;
	}
	
	public void brincar() {
		System.out.println("O "+this.nome+" brinca correndo atraz de seu dono.\n");
	}
	
	public void Comer() {
		System.out.println("O "+this.nome+" gosta de comer rações cheirosas.\n");
	}
	
	public void scanAnimal() {
		System.out.println("o Cachorro "+getNome()+" é um animal de "+pernas+" patas.\n");
	}
	

}
