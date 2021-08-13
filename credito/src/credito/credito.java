package credito;
import java.util.*;
public class credito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner entrada = new Scanner(System.in);
				float saldo, saldo_medio, credito;
				System.out.println("Digite o valor de seu saldo");
				saldo = entrada.nextFloat();
				
				saldo_medio = saldo;
				
				if((saldo >= 0) && (saldo <= 500)) {
					System.out.println("Saldo médio: " + saldo_medio + " ;seu crédio especial é de: NENHUM CRÉDITO.");
				}
				if((saldo >= 501) && (saldo <= 1000)) {
					credito = saldo_medio *((0.3f));
					System.out.println("Saldo médio: " + saldo_medio + " ;seu crédio especial é de: " + credito);
				}
				if((saldo >= 1001) && (saldo <= 3000)) {
					credito = saldo_medio*(40f/100f);
					System.out.println("Saldo médio: " + saldo_medio + " ;seu crédio especial é de: " + credito);
				}
				if(saldo > 3001) {
					credito = saldo_medio*(50f/100f);
					System.out.println("Saldo médio: " + saldo_medio + " ;seu crédio especial é de: NENHUM CRÉDITO.");
				}

	}

}
