package lista_me;

	public class Motor {
		public int numCilindro;
		public int potencia;
	
		Motor(){
			this.numCilindro = 0;
			this.potencia = 0;
		}
	
		Motor(int numCilindro, int potencia){
			this.numCilindro = numCilindro;
			this.potencia = potencia;
		}
		
		void setCilindro(int cilindro) {
			this.numCilindro = cilindro;
		}
		
		void setPotencia(int potencia) {
			this.potencia = potencia;
		}
		
		public void exibirDados() {
			
		System.out.println("Numero de cilindros é "+this.numCilindro+"\n e a Potencia é "+this.potencia);
		
		}
		
		}
	
