package autopecas;
import java.util.Scanner;
public class AutoPecas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cod1, qnt1, cod2, qnt2;
		float valor1, valor2, total1,ipi, total2, total_geral, porcento;
		
		Scanner info1 = new Scanner(System.in);
		System.out.printf("Informe o c�digo da pe�a1: ");
		cod1 = info1.nextInt();
		System.out.printf("Informe a quantidade de pe�a1: ");
		qnt1 = info1.nextInt();
		System.out.printf("Informe o valor de pe�a1: ");
		valor1 = info1.nextFloat();
		total1 = valor1*qnt1;

		Scanner info2 = new Scanner(System.in);
		System.out.printf("Informe o c�digo da pe�a2: ");
		cod2 = info2.nextInt();
		System.out.printf("Informe a quantidade de pe�a2: ");
		qnt2 = info2.nextInt();
		System.out.printf("Informe o valor de pe�a2: ");
		valor2 = info2.nextFloat();
		total2 = valor2*qnt2;
		
		Scanner tipi = new Scanner(System.in);
		System.out.printf("Informe o percentual de desconto IPI:");
		ipi = tipi.nextFloat();
		
		System.out.println("IPI em porcentagem: " + ipi);
		
		total_geral = (total1 + total2) + (ipi/100*(total1 + total2) );
		
		System.out.printf("Total da nota:%.2f", total_geral);

	}

}
