package pacote;
import javax.swing.JOptionPane;

public class SwitchCase2 {

	public static void main(String[] args) {
		int x = 0;  
		switch (x) {
		case 1: 
			x++;
			JOptionPane.showMessageDialog(null, "Valor igual a " + x);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Valor igual a 2");
		case 3: 
			x = 7;  
			JOptionPane.showMessageDialog(null, "Valor igual a " + x);
			break;
		default: 
			x = -5;
			JOptionPane.showMessageDialog(null, "Valor igual a " + x);
			break;
		case 4: 
			x += 3;  
			JOptionPane.showMessageDialog(null, "Valor igual a " + x);
			break;
		case 10: 
			x = 5;
			JOptionPane.showMessageDialog(null, "Valor igual a " + x);
		}


	}

}
