package exerc2;

public class Executar2 {

	public static void main(String[] args) {
		
		Automovel a = new Automovel();
		a.setCor("marron");
		a.setLitros(10);
		a.setMarca("fiat");
		a.setModelo("Mobi");
		a.andar(65,4);
		a.abastecer(15);
		
		//System.out.println(a.toString());
		System.out.println(a.getLitros());
	}

}
