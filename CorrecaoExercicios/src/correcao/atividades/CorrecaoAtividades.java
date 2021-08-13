package correcao.atividades;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CorrecaoAtividades {

	public static void main(String[] args) {
		
			int opcao = Integer.valueOf(JOptionPane.showInputDialog("Entre com uma das Opções abaixo \n"
	                + "1 - \n" 
	                + "2-  \n"
	                + "3-  \n",1));
			
		     switch (opcao) {
		            case 1:
		                JOptionPane.showMessageDialog(null,"Mensagem1");
		                break;    
		            case 2:
		                JOptionPane.showMessageDialog(null,"Mensagem2");
		                break;
		            case 3:
		                JOptionPane.showMessageDialog(null,"Mensagem3");
		                break;
		            default:
		                JOptionPane.showMessageDialog(null,"Mensagem4");
		                break;
		                }
		
	    
	}
	}


