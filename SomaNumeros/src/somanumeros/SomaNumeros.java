package somanumeros;
import javax.swing.JOptionPane;
public class SomaNumeros {

	public static void main(String[] args) {
		//Atribuir valores para vari�veis num�ricas
        int numero1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o primeiro numero:"));
        int numero2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com o segundo numero:"));
        int soma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "A soma dos numeros �:" + soma,"SOMA",0);
        JOptionPane.showMessageDialog(null, "A soma do numero "+ numero1 + " numero"+ numero2+ ","
        		                                 + " � igual a " + soma,"SOMA",3);
        
        
        

	}

}
