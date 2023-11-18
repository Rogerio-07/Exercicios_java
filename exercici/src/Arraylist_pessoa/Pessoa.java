package Arraylist_pessoa;

public class Pessoa {
	public String nome;
	public int idade;
	public int codigo_cadastro;
	
	

	public Pessoa(String nome1, int idade1) {
		this.nome = nome1;
		this.idade = idade1;
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCodigo_cadastro() {
		return codigo_cadastro;
	}

	public void setCodigo_cadastro(int codigo_cadastro) {
		this.codigo_cadastro = codigo_cadastro;
	}

	public String ToString() {
		return "nome: "+this.nome+", idade:"+this.idade;
	}
}
