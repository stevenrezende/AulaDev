package tipos.copo;
class CopoUisque
{
    
	public static void main(String arg[])
	{
	    Copo A;  // estamos identificando a variável A do tipo Copo
	    
        A = new Copo(); // o operador " new " reserva memória para a classe Copo
        
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
		
		System.out.println("menos o volume das pedras de gelo ( eheheh )");
	}
}