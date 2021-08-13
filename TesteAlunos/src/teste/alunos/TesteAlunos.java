package teste.alunos;
import javax.swing.JOptionPane;
public class TesteAlunos {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual é o seu nome? \n"
				+ "Opção 1 \n"
				+ "Opção 2 \n",1);
				
		int idade = Integer.valueOf(JOptionPane.showInputDialog("Qual é sua idade?"));
		
		JOptionPane.showMessageDialog(null,"Mensagem do Professor Legal " + nome + ", sua idade é " + idade);
		Double abacaxi = Double.valueOf(JOptionPane.showInputDialog("Entre com valor de z"));
		JOptionPane.showMessageDialog(null, "Valor de z é: "+ (abacaxi));

	}

}
