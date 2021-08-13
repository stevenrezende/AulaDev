package option;
import javax.swing.JOptionPane;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? \n"
				+ "Opção 1 \n"
				+ "Opção 2 \n",1);
		
		int opcao = Integer.valueOf(JOptionPane.showInputDialog("Entre com uma das Opções abaixo \n"
				+ "1 - "
				+ "2-  "
				+ "3-  ",1));
				
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual é sua idade?"));
		
		JOptionPane.showMessageDialog(null,"Mensagem do Professor Legal " + nome + ", sua idade é " + idade);
		Double abacaxi = Double.valueOf(JOptionPane.showInputDialog("Entre com valor de z"));
		JOptionPane.showMessageDialog(null, "Valor de z é: "+ (abacaxi));

	
		
	}

}
