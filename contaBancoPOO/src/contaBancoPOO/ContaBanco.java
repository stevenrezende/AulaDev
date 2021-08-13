package contaBancoPOO;
import  javax.swing.*;
public class ContaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Conta c1 =  new  Conta();
		c1.setNumero(7756);
		c1.setNome("Juverson da Silva");
		c1.setSaldo(100f);
		c1.setTipo("cc");
		c1.status();
		
		
	/*	Conta c2 = new Conta();
		c2.setAgencia(5601);
		c2.setNumero(7757);
		c2.setNome("Maria José Soares");
		c2.setSaldo(1005.85f);
		c2.setTipo("cc");
		c2.status();
		*/
		
		

	}

}
