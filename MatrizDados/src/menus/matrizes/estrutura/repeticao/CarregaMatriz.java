package menus.matrizes.estrutura.repeticao;

import javax.swing.JOptionPane;

public class CarregaMatriz {

//Método responsável por preencher Matrizes
public static void PreencheMatriz(String Cad[][], int totalCad){

	//variavel responsável por definir quantidade de usuários a serem cadastrados
	int qtdadeCad = Integer.parseInt(JOptionPane.showInputDialog("Quantos Usuários deseja Cadastrar?"));
	
	
	for(int i=0;i<qtdadeCad;i++) {
		Cad[i+totalCad-1][0] = JOptionPane.showInputDialog("NOME:");
		Cad[i+totalCad-1][1] = JOptionPane.showInputDialog("ENDEREÇO:");
		Cad[i+totalCad-1][2] = JOptionPane.showInputDialog("TELEFONE:");
		Cad[i+totalCad-1][3]=  JOptionPane.showInputDialog("IDADE:");
		Cad[i+totalCad-1][4]=  JOptionPane.showInputDialog("PROFISSÃO:");
		JOptionPane.showMessageDialog(null,"CADASTRADO REALIZADO:"
				+ "\n"+ Cad[i+totalCad-1][0]+ " cadastrado com SUCESSO","CADASTRAR",1);
		
	}
	totalCad=totalCad+qtdadeCad-1;
	JOptionPane.showMessageDialog(null,"totalCad = "+ totalCad );
	
	
}

public static void MostraMatriz(String Cad[][],int totalCad){

	//String Cad[][] =  new String[5][5];
	int qtdadeCad = Integer.parseInt(JOptionPane.showInputDialog("Quantos Usuários deseja Apresentar?"));
	
	for(int i=0;i<qtdadeCad;i++) {
		
		JOptionPane.showMessageDialog(null,"CADASTRADO COM REALIZADO:"
				+ "\n NOME:"+ Cad[i][0]+ 
				"\nENDEREÇO:" + Cad[i][1]+
				"\nTELEFONE:" + Cad[i][2]+
				"\nIDADE:"+ Cad[i][3] +
				"\nPROFISSAO:"+ Cad[i][4],"CADASTRAR",1);
		
	}
	
}

public static void ExcluiMatriz(String Cad[][],int totalCad){

	
	MostraMatriz(Cad,totalCad);
	int qtdadeCad = Integer.parseInt(JOptionPane.showInputDialog("Qual usuário Deseja excluir?"));
	for(int i=0;i<qtdadeCad;i++) {
		Cad[i][0] = "";
		Cad[i][1] = "";
		Cad[i][2] = "";
		Cad[i][3]=  "";
		Cad[i][4]=  "";
		JOptionPane.showMessageDialog(null,"Exclusão  REALIZADA:"
				+ "\n"+ qtdadeCad+ " Usuarios excluidos","EXCLUIR",1);
		
	}
	
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalCad=0;
		String Menu = ("ENTRE COM A OPÇAO \n"
				+ "1 - Cadastrar \n"
				+ "2 - Mostrar Dados \n"
				+ "3 - Excluir Dados \n"
				+ "4 - SAIR");
		 String Cad[][] =  new String[10][5];
		 
		int Op;
		do {
			Op = Integer.parseInt(JOptionPane.showInputDialog(Menu));
			switch (Op){
			case 1:
				JOptionPane.showMessageDialog(null,"OPÇAO ESCOLHIDA: 1  CADASTRAR DADOS","MENU",1);
				totalCad=totalCad+1;
				PreencheMatriz(Cad,totalCad);
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"OPÇAO ESCOLHIDA: 2  MOSTRAR DADOS","MENU",1);
				MostraMatriz(Cad,totalCad);
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"OPÇAO ESCOLHIDA: 3  EXCLUIR DADOS","MENU",1);
				ExcluiMatriz(Cad,totalCad);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"OPÇAO ESCOLHIDA: 4  SAIR DO PROGRAMA","MENU",1);
				JOptionPane.showMessageDialog(null,"ATÉ LOGO","MENU",1);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Escolha uma OPACAO VALIDA","MENU",2);
				break;
			}
		}while(Op != 4);
		
		

	}

}
