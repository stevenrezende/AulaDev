package matriz;
import java.util.Locale;
import javax.swing.*;
import java.util.Scanner;

public class matriz {
	public void tabuada(int n, String op){
	    if(op.equals('+')){
	        for(int cont=1; cont<=9 ; cont++){
	            System.out.println("Tabuada\n" + (n+cont));
	        }
	    }
	    else
	        if(op.equals('-')){
	        for(int cont=1; cont<=9 ; cont++){
	            System.out.println("Tabuada\n" + (n - cont));
	        }
	    }
	    else
	        if(op.equals('/')){
	        for(int cont=1; cont<=9 ; cont++){
	            System.out.println("Tabuada\n" + (n/cont));
	        }
	    }
	    else
	        if(op.equals('*')){
	        for(int cont=1; cont<=9 ; cont++){
	            System.out.println("Tabuada\n" + (n*cont));
	        }
	    }
	        else{
	            System.out.println("operador errado");
	        }

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Introduza um Numero >0\n");
        int n = s.nextInt();
        System.out.print("Introduza um operador\n");
        String op = s.next();
        matriz tab= new matriz();
        tab.tabuada(n,op);
	}

}
