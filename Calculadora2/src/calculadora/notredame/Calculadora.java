package calculadora.notredame;

import java.awt.TextField;

public class Calculadora {
/*    

	public String getSinal() {
		return sinal;
	}


	public void setSinal(String sinal) {
		this.sinal = sinal;
	}


	
    public String sinal;
  */     
       public double operacao(double n1, double n2, String sinal) {
    	   double resultado=0;
    	   
			if (sinal == "soma") {
				resultado = n1+n2;
			}
			if (sinal =="sub") {
				resultado = n1-n2;
			}
			if (sinal =="div") {
				resultado = n1/n2;
			}
			if (sinal =="mult") {
				resultado = n1*n2;
			}
			return resultado ;
       }
    	   
      
        
	    	   
	 	   
	   
   
}
