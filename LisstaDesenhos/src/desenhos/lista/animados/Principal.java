
package desenhos.lista.animados;
import javax.swing.*;

public class Principal {
	// Estrutura de dados que armazenará os dados dos filmes ... 
	private static String[][] desenhosAnimados;
	 // Indices dos campos dos desenhos ...
	 static int CODIGO = 0;
	 static int NOME = 1;
	 static int CLASSIFICACAO = 2;
	 static int ANO = 3;
	 static int TEMPO = 4;
	 static int QTD_ESTOQUE = 5;
	 static int VALOR = 6;
	 static String opcao;
	// String do menu ...
	final static String MENU = "CADASTRO DE DESENHOS ANIMADOS\n\n"   
	+ "1 - Cadastrar Desenhos\n"   
	+ "2 - Alterar todos os dados pelo código\n"   
	+ "3 - Listar desenhos por faixa etária\n"   
	+ "4 - Sair";
	public static void main(String[] args) {
		
		do {
			 opcao = JOptionPane.showInputDialog(null,MENU);
			switch(opcao) {
				case "1":
					cadastrarDesenhoAnimado();
					break;
				case "2": 
					alterarDesenhosAnimados();
					break;
				case "3":
					listarDesenhosAnimados();
					break;
				case "4":
					break;
				default:
					JOptionPane.showMessageDialog(null, "Você deve escolher uma opção do menu!");				
			}
		} while( opcao  != "4") ;
		
	}
	 static void cadastrarDesenhoAnimado() {
		String nome;
		String classificacao;
		String ano;
		String tempoDeDuracao;
		String qtdEstoque;
		String valor;
		int quantidadeDeCadastros = Integer.parseInt(JOptionPane.showInputDialog("Quantos desenhos animados você quer cadastrar ?"));
		String  desenhosAnimados[][] = new String[quantidadeDeCadastros][7];		
		for(int i=0; i < quantidadeDeCadastros; i++) {
			nome = JOptionPane.showInputDialog("Qual o nome do desenho ?");
			classificacao = JOptionPane.showInputDialog("Qual a classificação do desenho ?");
			ano = JOptionPane.showInputDialog("Qual o ano de lanámento do filme ?");
			tempoDeDuracao = JOptionPane.showInputDialog("Qual o tempo de duração ?");
			qtdEstoque = JOptionPane.showInputDialog("Qual a quantidade em estoque ?");
			valor = JOptionPane.showInputDialog("Qual o valor do aluguel para este filme ?");
			desenhosAnimados[i][CODIGO] = Integer.toString(i+1) ; // O código é o valor do i. 1, 2, 3, etc ...
			desenhosAnimados[i][NOME] = nome;
			desenhosAnimados[i][CLASSIFICACAO] = classificacao;
			desenhosAnimados[i][ANO] = ano;
			desenhosAnimados[i][TEMPO] = tempoDeDuracao;
			desenhosAnimados[i][QTD_ESTOQUE] = qtdEstoque;
			desenhosAnimados[i][VALOR] = valor;
		}
		JOptionPane.showMessageDialog(null,"Todos os Desenhos foram cadastrados com sucesso !");
	}
	public static void alterarDesenhosAnimados() {
		String codigoAPesquisar = JOptionPane.showInputDialog("Qual o codigo do filme a ser alterado ?");
		for(int i=0; i<desenhosAnimados.length; i++) {
			if(desenhosAnimados[i][CODIGO].equals(codigoAPesquisar)) {
				String codigo = desenhosAnimados[i][CODIGO];
				String nome = JOptionPane.showInputDialog("Qual o novo nome do filme de código [" + codigo + "].");
				String classificacao = JOptionPane.showInputDialog("Qual o nova classificação do filme de código [" + codigo + "].");
				// Demais campos ...
				desenhosAnimados[i][NOME] = nome;
				desenhosAnimados[i][CLASSIFICACAO] = classificacao;
				// Demais campos atribuidos ... 
			}
		}
	}
	private static void listarDesenhosAnimados() {
		String classificacao= JOptionPane.showInputDialog("Qual a faixa dos filmes ?");
		for(int i=0; i<desenhosAnimados.length; i++) {
			if(desenhosAnimados[i][CLASSIFICACAO].equals( classificacao )) {
				// aqui tu já achou o cara, e é só recuperar os dados das colunas, e imprimir da forma que o Sr quiser ! 
			}
		}
	}
}