package exerc2;

public class Automovel {

		public String cor;
		public String marca;
		public String modelo;
		public int litros;
		
		public Automovel() {
			
		}
		
		public Automovel(String cor, String marca, String modelo, int litros) {
			this.cor = cor;
			this.marca = marca;
			this.modelo = modelo;
			this.litros = litros;
		}
		
		public Automovel(int combustivel) {
			this.litros = combustivel;
		}

		public String getCor() {
			return this.cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public String getMarca() {
			return this.marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return this.modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getLitros() {
			return this.litros;
		}

		public void setLitros(int litros) {
			this.litros = litros;
		}
		public String toString() {
			return "cor: "+getCor()+"\nmarca:"+getMarca()+"\nmodelo: "+getModelo()+"\nKM/litros: "+getLitros();
		}
		public void andar(int km, int litroconsumido){
			this.litros = this.litros - litroconsumido;
	
		}
		
		public void abastecer(int novolitro) {
			this.litros = this.litros + novolitro;
		}
		
}
