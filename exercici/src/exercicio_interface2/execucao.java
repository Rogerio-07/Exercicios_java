package exercicio_interface2;

public class execucao {

	public static void main(String[] args) {
	
	Formiga a = new Formiga();
	a.comer();
	a.scanAnimal();
	
	Cachorro b = new Cachorro( "Fredy");
	b.scanAnimal();
	b.brincar();
	b.Comer();
	
	Peixe c = new Peixe("tod");
	c.scanAnimal();
	c.brincar();
	c.comer();
	c.setNome("pole");
	c.getNome();
	c.scanAnimal();
	
	Animal d = new Peixe("lili");
	d.comer();
	
	
	 
	}

}
