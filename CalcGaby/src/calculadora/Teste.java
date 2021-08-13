package calculadora;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operation ="10+2-3/10/5";
		String teste[] = new String[10];
		//teste = operation.split("0|1|2|3|4|5|6|7|8|9");
		teste = operation.split("[0-9]");
		Arrays.parallelSort(teste);
		for(int i=teste.length-1;i > 0;i--) {
			if (teste[i] != " ") {
				System.out.println(teste[i]);	
			}
			
		}
		
		System.out.println("sinal" + teste[teste.length-1]);
		
	}

}
