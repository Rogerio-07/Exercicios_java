package Exer2;

public class Execucao {

	public static void main(String[] args) {
		Ingresso a = new Ingresso();
		a.setValor(10);
		//System.out.print(a.getValor());
		
		Ingresso b = new Ingresso();
		b.setValor(3);
		//System.out.print(b.ToString());
		
		IngressoVIP c = new IngressoVIP();
		c.setValor(10);
		c.setValorAdicional(5);
		
		System.out.println(c.ToString());
			
		

	}

}
