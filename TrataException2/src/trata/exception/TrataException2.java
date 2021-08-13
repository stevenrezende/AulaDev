package trata.exception;

import javax.swing.JOptionPane;

public class TrataException {

	private static void aumentarLetras() throws NullPointerException //lançando exceção
	{
		String frase = "legal";
		String novaFrase = null;
		novaFrase = frase.toUpperCase();
		JOptionPane.showMessageDialog(null,"Frase Antiga:  " + frase);
		JOptionPane.showMessageDialog(null,"Frase Nova:  " + novaFrase);
		
	 
	}
	
	
	public static void main(String[] args) {

		try
		{
			aumentarLetras();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Ocorreu um NullPointerExecption ao "
					+ "executar o metodo aumentaLetras():  " + e);
		}
		

	}

}
