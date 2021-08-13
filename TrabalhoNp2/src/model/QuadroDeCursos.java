
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class QuadroDeCursos {
	
	Map<Curso, RelatorioDeNotas> relatorios;
	
	public QuadroDeCursos() {
		relatorios = new TreeMap<>();
	}
	
	public void addCurso(Curso curso) {
		relatorios.put(curso, new RelatorioDeNotas());
	}
	
	public Set<Curso> getCursos(){
		return relatorios.keySet();
	}
	
	public RelatorioDeNotas getRelatorio(Curso curso) {
		return relatorios.get(curso);
	}
	
	public void addRendimento(Rendimento rendimento) {
		RelatorioDeNotas relatorio = relatorios.get(rendimento.getCurso());
		relatorio.add(rendimento);
	}

	@Override
	public String toString() {
		return "QuadroDeCursos [relatorios=" + relatorios + "]";
	}
	


}
