package Arraylist_pessoa;
import java.util.*;

public class Exec {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		int comando;
		
		do{
			System.out.println("o que deseja fazer?\n 1-Cadastrar pessoa \n 2-Consultar lista de pessoas cadastradas \n 3-Deletar pessoa cadastrada \n 4-sair do programa");
			comando = ler.nextInt();
			
			if(comando==1) {
				
				System.out.println("informe o nome da pessoa: ");
				String nome = ler.next();
				
				System.out.println("informe a idade da pessoa: ");
				int idade = ler.nextInt();
				
				Pessoa p = new Pessoa(nome, idade);
				lista.add(p);
				
				for(int i=0;i<lista.size();i++) {		
					System.out.println("Cadastro realizado com sucesso! Codigo de cadastro: "+i);
				}	
				System.out.print("\n");
				
			}if(comando==2) {
				
				System.out.println("Pessoas cadastradas: ");
				for(Pessoa p:lista) {
					System.out.println(p.ToString()+", codigo de cadastro: "+lista.indexOf(p));
				}
				System.out.print("\n");
			}if(comando==3) {
				
				System.out.println("informe o codigo de cadastro da pessoa a ser excluida: ");
				int codigo = ler.nextInt();
				
				for(int i=0;i<lista.size();i++) {
					if(codigo==i) {
						lista.remove(i);
						System.out.println(lista.indexOf(i)+" removida com sucesso!\n");
					}
				}
				}
			
			}while(comando>0&&comando<4);
				System.out.println("sistema finalizado");
					
		}
				
				
	}


	


