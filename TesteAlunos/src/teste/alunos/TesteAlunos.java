package teste.alunos;
import javax.swing.JOptionPane;
public class TesteAlunos {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual � o seu nome? \n"
				+ "Op��o 1 \n"
				+ "Op��o 2 \n",1);
				
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual � sua idade?"));
		
		JOptionPane.showMessageDialog(null,"Mensagem do Professor Legal " + nome + ", sua idade � " + idade);
		Double abacaxi = Double.valueOf(JOptionPane.showInputDialog("Entre com valor de z"));
		JOptionPane.showMessageDialog(null, "Valor de z �: "+ (abacaxi));

	}

}
