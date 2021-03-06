/**
 * 
 */
package trabalhoavaliativo;
import javax.swing.*;

//Classe Desenvolvida
public class TrabalhoAvaliativo {
     // Metodo que Realiza cadastro
	public static void CadastrarMatriz(String Cad[][], int total, int count) {
           		
		// looping para preencher cadastro de usários na quantidade especificada anteriormente 
		
		for (int i=total; i< total + count;i++) {
	        
			JOptionPane.showMessageDialog(null,"Iniciando " + i + "º realizado com sucesso\n ");
			Cad[i][0] = JOptionPane.showInputDialog("NOME:");
			Cad[i][1] = JOptionPane.showInputDialog("Endereço:");
			Cad[i][2] = JOptionPane.showInputDialog("Telefone:");
			Cad[i][3] = JOptionPane.showInputDialog("Profissão:");
			Cad[i][4] = JOptionPane.showInputDialog("Idade:");
			JOptionPane.showMessageDialog(null,"Cadastro " + i + " realizado com sucesso\n ");
		
			
		
		}
		}
	
	
	public static void MostraValor(String Cad[][], int count) {
		
		for (int i=0; i< count;i++) {
	
		 JOptionPane.showMessageDialog(null,"Nome " + Cad[i][0]
				 						+"\nEndereço " + Cad[i][1] 
				 						+ "\nTelefone " + Cad[i][2]
				 						+"\nProfissao " + Cad[i][3]
				 						+"\nIdade " + Cad[i][4]);
		}
	
	}
		
	public static void ExcluiValor(String Cad[][], int total ) {

		for (int i=0; i<total;i++) {
	
			Cad[i][0] = null;
			Cad[i][1] = null;
			Cad[i][2] = null;
			Cad[i][3] = null;
			Cad[i][4] = null;
			}
		JOptionPane.showMessageDialog(null,"Dados Excluidos\n ");
	}
	
	
	public static void main(String[] args) {
		//Variavel opt captura opção passada por usuario
		int  opt = 0;
		//acumula o total de cadastros já realizado
		int total = 0;
		
		//Vetor com 20 registros r 5
		String Cad[][] = new String[20][5];
		 while (opt !=4) {
		
		String texto = (""
			+ "\n 1 Cadastrar "
			+ "\n 2 Mostrar Dados "	
			+ "\n 3 Exclui Dados "					
			+ "\n 4 Sair "
									);
	
	 opt = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu" + texto));
	 
		
		//Switch que verifica os Menus
		
	 switch (opt) {

	 	case 1: JOptionPane.showMessageDialog(null,"Cadastrar","Cadastro",1);
	 		int count = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastros deseja executar"));
			CadastrarMatriz(Cad,total, count);
			total = total + count; 
	 		break;
	 	case 2: JOptionPane.showMessageDialog(null,"Mostrar Dados","Motrar dados",1);
			count = Integer.parseInt(JOptionPane.showInputDialog("Quantos cadastros deseja mostrar"));
			MostraValor(Cad,total);
			break;
	 	case 3: JOptionPane.showMessageDialog(null,"Excluir Dados","Excluir Dados",2);   
			ExcluiValor(Cad,total);
			break;
	 	case 4: JOptionPane.showMessageDialog(null,"Sair","Mensagem",1);
			break;
	 	default : JOptionPane.showMessageDialog(null,"Opcao Invalida","Dados incorretos", 2);
			break;

	 		}

	
		 }


	}

}
