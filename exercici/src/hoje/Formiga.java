package hoje;

public class Formiga extends Animal {
	
	
	public Formiga(int pernas2) {
		this.pernas = pernas2;
		
		if(pernas==6) {
			System.out.println("O animal é uma formiga.");
		}
		else {
			System.out.println("O animal não é uma formiga.");
		}
		
	}
	
	public void come() {
		
		System.out.println("a formiga come folhas e coisas doces.");
		
	}

}
