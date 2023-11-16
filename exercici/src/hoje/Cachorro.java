package hoje;

public class Cachorro extends Animal implements AnimalDeEstimacao{
	
	private String nome;
	
	public Cachorro() {
		
	}
	public Cachorro(String nome1, int pernas1) {
		super(pernas1);
		
		this.nome = nome1;
		if(pernas==4) {
			System.err.println("o Animal é um cachorro.");
		}
		
		
	}
		
	public String getNome() {
		return "o nome do cachorro é "+nome;
		
	}
	
	public void setNome(String nome2) {
		this.nome = nome2;
	}
	
	public void brinca() {
		System.out.println("o cachorro "+this.nome+" gosta brincar com bola.");
	}
	
	public void come() {
		System.out.println("o cachorro "+this.nome+" come ração e carnes.");
	}
	
	public void scan() {
		System.out.println("o nome do cachorro é: "+this.nome);
	}

}
