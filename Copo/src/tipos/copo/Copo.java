package tipos.copo;
class Copo
{
	double altura, diametro ;
	String cor, material;
	public void GuardaVolume()
	{
	  double v = altura*diametro;
	  System.out.println("O volume do copo e ="+v+"  "+"cm cubicos");	
	}
	
}