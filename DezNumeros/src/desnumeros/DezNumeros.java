package desnumeros;
import javax.swing.JOptionPane;
public class DezNumeros {
	public static void main(String[] args) {
		
		int abobrinha[][] =  new int[10];
	
	for (int i=0; i<10 ; i++) {
	    abobrinha[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite os valores"));
	}
	
	for(int i=0; i<10 ;i++ ) {
		JOptionPane.showMessageDialog(null, "Valor "+ i + ": " + abobrinha[i]);
		
	}
	
	}
}
