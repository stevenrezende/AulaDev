package exercicio_8;

 

import java.util.Scanner;

 

public class exercicio_8 {

 

    public static void menu () {
        // TODO Auto-generated method stub
        System.out.println(" ...............cadastro de Cliesntes..........\n") ;
        System.out.println("                 cadastro                        ") ;
        System.out.println("              consultar Dados                    ") ;
        System.out.println("                 delatar                        ") ;
        System.out.println("                  sair                           ") ;
    }
        public static void cadastro() {
        System.out.println("opcao de cadastrar");    
        
    }
        public static void consultar() {
        System.out.println("opcaoo de monstrar dados");
        
    }
        
        public static void deletar() {
        System.out.println("opcao de deletar dados") ;
        
    }
        
        public static void sair() {
        System.out.println("opcao de sair") ;
        
    }
        
       public static void main(String[] args) {
        
        
        int opcao = 0 ;
        
        menu();
        System.out.println("Entre com uma Opção do Menu:");
        Scanner ler = new Scanner(System.in);
                
            opcao = ler.nextInt();
               
        
        switch (opcao){
        case 1:
             cadastro();
        break;
        case 2:
             consultar();
        break;
        case 3:
             deletar();
        break;
        case 4:
              sair();
        break;
		default:
			 System.out.println("opcao invalid");
                   
        }
    }
}