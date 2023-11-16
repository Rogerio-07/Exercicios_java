package hoje;

public class Animal {
	protected int pernas;
	

	public Animal() {
		System.out.println("não tem como idenfiticar qual é o animal.");
	}
	
	public Animal(int pernas1) {
		this.pernas =  pernas1;
		
		if(pernas==4) {
			System.out.println("o animal é um cachorro");
		}
		else if(pernas==6) {
			System.out.println("o animal é uma formiga");
		}
		
		else {
			System.out.println("o animal é um peixe");
			}
		}
	
		public void caminha() {
			//if(pernas==4) {
			//System.out.println("o Cachorro caminha");
			//}
			//if(pernas==6) {
			//	System.out.println("a formiga caminha");
			//}
			//else {
			//	System.out.println("o peixe nada");
			//}
	}
		public void come() {
			//if(pernas==4) {
			//	System.out.println("o Cachorro come ração ou carnes");
			//}
			//if(pernas==6) {
			//	System.out.println("A formiga come folhas e coisas doces");
			//}
			//else {
				//System.out.println("o peixe come ração apropriada");
			//}
		}

}
