package aumenta.frase;

public class AumentaFrase {

	public static void main(String[] args) {
		String frase = null;
        String novaFrase = null;
        try
        {
        	novaFrase = frase.toUpperCase();
        }
        catch(NullPointerException e) //CAPTURA DA POSS�VEL exce��o.
        {
            //TRATAMENTO DA exce��o
            System.out.println("A frase inicial est� nula, para solucionar tal  problema, foi lhe atribuito um valor default.");
            frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: "+frase);
        System.out.println("Frase nova: "+novaFrase);

	}

}
