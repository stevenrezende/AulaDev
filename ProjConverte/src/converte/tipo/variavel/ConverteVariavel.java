package converte.tipo.variavel;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConverteVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor=Double.parseDouble(JOptionPane.showInputDialog("Entre com um numero"));
        
		DecimalFormat decimal = new DecimalFormat("0.00");
		JOptionPane.showMessageDialog(null,"IMC" + decimal.format(valor));
	//	String numero = decimal.format(valor); 
		//JOptionPane.showMessageDialog(null,"IMC" + numero );
	}

}
