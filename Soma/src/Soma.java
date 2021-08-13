import java.util.Scanner;

public class Soma {

	private static Scanner scan;

	public static void main(String[] args) {
		int valor1 =0;
		int valor2 =0;
		int valor5 =13;
		int valor6 =2;
		scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor");
		valor1=scan.nextInt();
		
		System.out.println("Insita o segundo Varor");
		valor2 = scan.nextInt();
		
		
		valor5= scan.nextInt();
		System.out.println("Total " + (valor1+ valor2));
		System.out.println("Total " + (valor5+ valor6));
		
		
	}

}
