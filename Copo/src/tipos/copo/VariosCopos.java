package tipos.copo;
class VariosCopos
{
    
	public static void main(String arg[])
	{
	    Copo A, B, C;  // estamos identificando a variáveis A B e C do tipo Copo
	    
        A = new Copo(); // o operador " new " reserva memória para a classe Copo
        B = new Copo(); // o operador " new " reserva memória para a classe Copo
        C = new Copo(); // o operador " new " reserva memória para a classe Copo
        
        // abaixo atribuimos valores locais para os atributos de CopoUisque
	    A.altura = 8.5;
	    A.diametro = 7.5;
	    A.cor = "transparente ";
	    A.material = "cristal";
	    
		System.out.println("Um copo de Uisque tem"+"  "+A.altura+ "  "+"cm de altura");
		System.out.println("e tem"+"  "+A.diametro+ "  "+"cm de diametro");
		System.out.println("sua cor e"+"  "+A.cor);
		System.out.println("e feito de"+"  "+A.material);
		
		A.GuardaVolume(); // fazemos a chamada do metodo da classe Copo
		
		System.out.println("   ");
		
		 // abaixo atribuimos valores locais para os atributos de CopoLeite
	    B.altura = 9;
	    B.diametro = 6.5;
	    B.cor = "transparente ";
	    B.material = "vidro comum";
	    
		System.out.println("Um copo de Leite tem"+"  "+B.altura+ "  "+"cm de altura");
		System.out.println("e tem"+"  "+B.diametro+ "  "+"cm de diametro");
		System.out.println("sua cor e"+"  "+B.cor);
		System.out.println("e feito de"+"  "+B.material);
		
		B.GuardaVolume(); // fazemos a chamada do metodo da classe Copo
		
		System.out.println("   ");
		
		 // abaixo atribuimos valores locais para os atributos de CopoChopp
	    C.altura = 12.5;
	    C.diametro = 6.25;
	    C.cor = "metalica ";
	    C.material = "Aluminio";
	    
		System.out.println("Um copo de Chopp tem"+"  "+C.altura+ "  "+"cm de altura");
		System.out.println("e tem"+"  "+C.diametro+ "  "+"cm de diametro");
		System.out.println("sua cor e"+"  "+C.cor);
		System.out.println("e feito de"+"  "+C.material);
		
		C.GuardaVolume(); // fazemos a chamada do metodo da classe Copo
		
		System.out.println("   ");
	}
}