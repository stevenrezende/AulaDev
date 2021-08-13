package somadoisnumeros;
import javax.swing.JOptionPane;

public class SomaDoisNumeros {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	//	String nome = JOptionPane.showInputDialog("Entre Com seu nome");
//		int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Numero1"));
	//	int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Numero2"));
	//	int resultado = numero1 +numero2;
	//	JOptionPane.showMessageDialog(null,  nome + "o resultado é" + resultado);
		
		double ano = Double.valueOf(JOptionPane.showInputDialog("Entre com sua idade em anos"));
		double meses = Double.valueOf(JOptionPane.showInputDialog("Entre com sua idade em meses"));
		double dias = Double.valueOf(JOptionPane.showInputDialog("Entre com sua idade em dias"));
		double total = 365/dias;
		JOptionPane.showMessageDialog(null, "Você já viveu" +total + " dias");

	}

}
