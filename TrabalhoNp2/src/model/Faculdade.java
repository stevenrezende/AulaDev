/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Franc
 */
public class Faculdade {
    public QuadroDeCursos quadro;
    public QuadroDeAlunos alunos;
    Map<Curso, QuadroDeAlunos> relatorio;
    Map<Aluno, QuadroDeCursos> historico;
	
	public Faculdade() {
		quadro = new QuadroDeCursos();
                alunos = new QuadroDeAlunos();
	}
	
	public void addCurso(Curso curso) {
		quadro.addCurso(curso);
	}
	
	public void addRendimento(Rendimento rendimento) {
		quadro.addRendimento(rendimento);
	}

	@Override
	public String toString() {
		return "Faculdade [grade=" + quadro + "]";
	}
        
    void addAluno(Aluno aluno) {
        alunos.addAluno(aluno);
    }

    Set<Curso> getCursos() {
        return  quadro.getCursos();
    }

    Aluno getAluno() {
        return (Aluno) alunos.getAluno();
    }
    Aluno getAlunos() {
        return (Aluno) alunos.getAluno();
    }
    
    public RelatorioDeNotas getRelatorio(Aluno aluno) {
	return null;	
	}


}
