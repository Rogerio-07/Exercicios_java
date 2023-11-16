package exercicio_interface2;

public class Formiga extends Animal {
	
	public Formiga() {
		this.pernas = 16;
	}
	
	public void comer() {
		System.out.println("As formigas comem folhas e demais particulas que sejam doces.\n");

	}
	public void scanAnimal() {
		System.out.println("A formiga possui "+pernas+" pernas.\n");
	}

}
