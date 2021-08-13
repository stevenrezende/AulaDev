package aulaPoo;

public class AulaPoo {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.modelo = "BIC";
		c1.ponta =  0.5f;
		c1.carga = 90;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.cor = "Preta";
		c2.modelo = "Monblan";
		c2.ponta =  0.7f;
		c2.carga = 50;
		c2.tampar();
		c2.status();
		c2.rabiscar();


	}

}
