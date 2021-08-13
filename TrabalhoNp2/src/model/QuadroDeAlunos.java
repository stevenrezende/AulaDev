
package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class QuadroDeAlunos {
	
	Map<Aluno, RelatorioDeNotas> relatorios;
	
	public QuadroDeAlunos() {
		relatorios = new TreeMap<>();
	}
	
	public void addAluno(Aluno aluno) {
		relatorios.put(aluno, new RelatorioDeNotas());
	}
	
	public Set<Aluno> getAluno(){
		return relatorios.keySet();
	}
	
	public RelatorioDeNotas getRelatorio(Aluno aluno) {
		return relatorios.get(aluno);
	}
	
	public void addRendimento(Rendimento rendimento) {
		RelatorioDeNotas relatorio = relatorios.get(rendimento.getAluno());
		relatorio.add(rendimento);
	}

	@Override
	public String toString() {
		return "QuadrodeAlunos [relatorios=" + relatorios + "]";
        }
}


    

