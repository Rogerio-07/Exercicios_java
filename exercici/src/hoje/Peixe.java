package hoje;

public class Peixe extends Animal implements AnimalDeEstimacao{
	
	private String nome;

	public Peixe() {
	
	}
	
	public String getNome() {
		return "o peixe se chama "+this.nome;
	}
	 
	public void setNome(String nome2) {
		this.nome = nome2;
	}
	
	public void brinca() {
		System.out.println("o peixe "+this.nome+" brinca de carrocel aquático.");
		
	}
	
	public void come() {
		System.out.println("o peixe "+this.nome+" come ração para peixes.");
	}
}
