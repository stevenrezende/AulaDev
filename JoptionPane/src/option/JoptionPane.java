package option;
import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Qual � o seu nome? \n"
				+ "Op��o 1 \n"
				+ "Op��o 2 \n",1);
		
		int opcao = Integer.valueOf(JOptionPane.showInputDialog("Entre com uma das Op��es abaixo \n"
				+ "1 - "
				+ "2-  "
				+ "3-  ",1));
				
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual � sua idade?"));
		
		JOptionPane.showMessageDialog(null,"Mensagem do Professor Legal " + nome + ", sua idade � " + idade);
		Double abacaxi = Double.valueOf(JOptionPane.showInputDialog("Entre com valor de z"));
		JOptionPane.showMessageDialog(null, "Valor de z �: "+ (abacaxi));

	
		
	}

}
