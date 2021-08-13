/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Franc
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RelatorioDeNotas {
	
	Collection<Rendimento> relatorio;
	
	public RelatorioDeNotas() {
		relatorio = new ArrayList<>();
	}
	
	public void add(Rendimento rendimento) {
		relatorio.add(rendimento);
	}

	@Override
	public String toString() {
		String res = "";
		for(Rendimento r : relatorio) {
			res += r + "\n";
		}
		return "RelatorioDeNotas: " + res;
	}

  
	


}
