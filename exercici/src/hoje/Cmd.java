package hoje;

public class Cmd {
	
	public static void main (String [] args) {
		
		Formiga a = new Formiga(6);
		Animal b = new Cachorro("Ted", 6);
		a.come();
		
		Cachorro c = new Cachorro ("Billy",4);
		c.setNome("Ted");
		c.scan();
		c.brinca();
		c.come();
		
		Peixe d = new Peixe();
		d.setNome("tito");
		d.brinca();
		d.come();
		
		Animal e = new Peixe();
		e.come();
		
		Animal f = new Animal();	
	}

}
