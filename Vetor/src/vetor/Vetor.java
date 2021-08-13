package vetor;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		int vetor[]  = new int[5];
		int vetorB[]  = new int[5];
		int vetorSoma[]  = new int[5];
		int vetorSub[]  = new int[5];
		Scanner teclado =  new Scanner(System.in);
		
		for(int linha=0;linha<5;linha++) {
			System.out.print("Entre com vetor["+linha+"] : ");
			vetor[linha] = teclado.nextInt();
			System.out.print("Entre com vetorB["+linha+"] : ");
			vetorB[linha] = teclado.nextInt();
		}
		System.out.print("VETOR[");
		for(int linha=0;linha<5;linha++) {
			System.out.print(" "+ vetorB[linha] );
			
		}
		System.out.print("]");

	}

}
