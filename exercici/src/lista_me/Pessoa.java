package lista_me;

	public class Pessoa {
		public int idade;
		public int dia;
		public int mes;
		public int ano;
		public String nome;
	
		Pessoa(){
		
		}
		
		Pessoa(String nome, int dia, int mes, int ano){
		this.nome = nome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		}
		
		public void calcularIdade(int dia, int mes, int ano) {

			if(mes < this.mes){
				this.idade = (ano - this.ano)-1; 	
				}else{
					this.idade = ano - this.ano;
				}

				}

				
		
		public int informeIdade() {
			return this.idade;
		}
		
		public String informeNome() {
			return this.nome;
		}
		
		public void ajustaDatadeNascimento(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
