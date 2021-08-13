
package controller;

import java.io.IOException;
import model.Aluno;
import model.Alunos;
import model.Curso;
import model.Cursos;
import model.Faculdade;
import model.Model;
import model.Rendimento;
import view.View;

public class Controller {
	
	Model model = new Model();
	View view = new View();
	
	public void inicia() throws IOException {
		model.carrega();
		
		boolean terminar = false;
		while(terminar==false) {
			
			int opcao = view.menu();
			
			switch(opcao) {
                            
			case 1: //Listar curso
                                Cursos cursos = model.getCursos();
				view.mostrarCursos(cursos);
				break;

				
			case 2: //Listar aluno
				Alunos alunos = model.getAlunos();
				view.mostrarAlunos(alunos);
				break;
			case 3: //Listar histórico
                            Alunos alunosHistorico = model.getAlunos();
                            Cursos cursosHistorico = model.getCursos();
                            Faculdade faculdade = model.getFaculdade();
                            Aluno alunoHistorico = view.escolheAluno(alunosHistorico, cursosHistorico, faculdade);
                            
                            break;
				
                       // case 4: Relatorio de rendimento de cada curso
                        case 5://Incluir aluno
//                            boolean respostaValida = false;
//                            
//                            while(respostaValida = false) {
                                Aluno aluno = view.leAluno();
//                                boolean alunoExiste = model.compararAluno(aluno);
//                                if(alunoExiste) {
                                 model.addAluno(aluno);  
//                                 respostaValida = true;
//                                } else {
//                                    System.out.println("\nId já existente, favor tentar novamente.\n");
//                                    respostaValida = false;
//                                }
//                            }
				break;
                        case 6://Incluir Curso
                               Curso curso = view.leCurso();
				model.addCurso(curso);
				break;
                                
                        case 7: //Incluir rendimento
                            Alunos alunoRendimento = model.getAlunos();
                            Cursos cursosRendimento = model.getCursos();
                            Rendimento rendimento = view.leRendimento(alunoRendimento, cursosRendimento);
                            model.addConstroiRendimento (rendimento);
                            
                                break;
			case 8:// Sair
				model.save();
				System.exit(0);
			default:
				System.out.println("entrada invalida");
			}
		}
	}
	
	

}
