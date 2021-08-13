
package model;

import java.util.Map;
import java.util.TreeMap;

public class Notas {

	Map<Prova, Double> notas;
	
	public Notas() {
		notas = new TreeMap<>();
		
		for(Prova prova : Prova.values())
			notas.put(prova, 0.0);
		
	}
	
	public double getNota(Prova prova) {
		return notas.get(prova);
	}

       public void setNota(Prova prova, double nota) { 
       notas.put(prova, nota);
    }
	@Override
	public String toString() {
		String res = "\n";
		for(Prova prova : notas.keySet())
			res += prova + ": " + notas.get(prova) + "\n";
		
		return "Notas:" + res;
	}

  
        

}
