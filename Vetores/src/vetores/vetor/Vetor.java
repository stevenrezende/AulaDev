package vetores.vetor;
import java.util.*;
public class Vetor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[] =  new int[10];
		int b[] = {1,2,3,4,5};
		
		Arrays.parallelSort(a);   //ordena vetor
		Scanner teclado =  new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			a[i] = teclado.nextInt();
			
		}
		
		Arrays.sort(a); //também ordena vetor 
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Vetor a posicao"+i +" = " + a[i]);
		}
		
		for(int j=0;j<b.length;j++) {
			System.out.println("Vetor b posicao"+j +" = " + b[j]);
		}
		int h = Arrays.binarySearch(a, 4);
		for (int valor:a) {
			System.out.print(valor + " ");
			
		}
		System.out.println("" );
		System.out.println("Encontrado na posição:" +h );
		
		

	}

}
