package trata.exeception.teste;

import javax.swing.JOptionPane;

public class TrataException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog("Entre com a Frase");
		frase = null;
        String novaFrase = null;
        try
        {
            novaFrase = frase.toUpperCase();
        }
        catch(Exception  exc) //CAPTURA DA POSS�VEL exce��o.
        {
           // TRATAMENTO DA exce��o
        	JOptionPane.showMessageDialog(null,"A frase inicial est� nula, para solucionar tal o problema, foi lhe atribuito um valor default.   " + exc );
             frase = "Frase vazia";
             novaFrase = frase.toUpperCase();
         }
      JOptionPane.showMessageDialog(null,"Frase antiga: "+frase);
      JOptionPane.showMessageDialog(null,"Frase nova: "+novaFrase );

	}

}
