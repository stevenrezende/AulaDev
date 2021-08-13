
package view;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Aluno;
import model.Alunos;
import model.Curso;
import model.Curso.Nivel;
import model.Cursos;
import model.Nota;
import static model.Prova.*;
import model.Notas;
import model.QuadroDeAlunos;
import model.Rendimento;
import model.Faculdade;

public class View {
	
	public void mostrarAlunos(Alunos alunos) {
		System.out.println("\n-----------------");
		System.out.println("Imprimindo alunos: ");
		System.out.println("-----------------");
		
		for(int i=0; i<alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
	}
	
	public void mostrarCursos(Cursos cursos) {
		System.out.println("\n-----------------");
		System.out.println("Imprimindo cursos: ");
		System.out.println("-----------------");
		
		for(int i=0; i<cursos.size(); i++) {
			System.out.println(cursos.get(i));
		}
		
	}
	
	public Curso leCurso() {
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com os dados do curso");
			
			String nome = leNome();
                        Nivel nivel = leNivel();
                        int ano = leAno();
			Curso curso = new Curso(nome, nivel, ano);
			return curso;
			
		}
		return null;
	}
	
	public String leNome() {
		
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com um nome");
			Scanner in = new Scanner(System.in);
			String nome = in.nextLine();
			
//			if(nome.isBlank()) {
//				System.out.println("nome em branco");
//				continue;
//			}
			
			return nome;
		}
		
		return null;

	}
       
	
	public  Nivel leNivel() {
		
		boolean entradaValida = false;
		while(entradaValida==false) {
			try {
                                System.out.println("Qual o nivel do seu curso?");
				System.out.println("1 Graduação \n2 Pós-Graduação ");
				Scanner in = new Scanner(System.in);
				int nivel = in.nextInt();
				entradaValida = true;
                                String textoNivel = null;
                                if (nivel == 1){
                                    textoNivel = "GRADUACAO";
                                }
                                else if (nivel==2){
                                    textoNivel = "POS_GRADUACAO";
                                }
                                return Curso.Nivel.valueOf(textoNivel);
			}catch(InputMismatchException e) {
				System.out.println("Valor inválido, digite novamente");
			}
		}
		
		return null;

	}
        public int leAno() {
		
		boolean entradaValida = false;
		while(entradaValida==false) {
			try {
				System.out.println("Entre com um ano");
				Scanner in = new Scanner(System.in);
				int ano = in.nextInt();
				
				entradaValida = true;
				
				return ano;
			}catch(InputMismatchException e) {
				System.out.println("o numero deve ser um inteiro");
			}
		}
		
		return -1;

	}
        
        public Aluno leAluno() {
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com os dados do aluno");
			String nome = leNome();
                        String id = leId();
			Aluno aluno = new Aluno(id, nome);
			return aluno;
			
		}  
                return null;
        }
         private String leId() {
            boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com um ID");
			Scanner in = new Scanner(System.in);
			String id = in.nextLine();
			
//			if(nome.isBlank()) {
//				System.out.println("nome em branco");
//				continue;
//			}
			
			return id;
		}
		
		return null;

	}
         
       public Rendimento leRendimento(Alunos alunos, Cursos cursos) {
                Aluno alunoEscolhido = null;
                Curso cursoEscolhido = null;
                Rendimento rendimento = null;
		boolean entradaValida = false;
		while(entradaValida==false) {
			System.out.println("Entre com os dados do rendimento");
			System.out.println("Escolha um aluno já inscrito:");
                        mostrarAlunos(alunos);
                        System.out.println("");
                        String id = this.leId();
                        
                        for(Aluno al : alunos) {
                            if(al.getId().equalsIgnoreCase(id)) {
                                alunoEscolhido = al;
                            }
                        }
                        
                        System.out.println("\n\n");
                        System.out.println("Escolha um curso já inscrito:");
                        mostrarCursos(cursos);
                        System.out.println("");
                        Curso curso = this.leCurso();
                        
                        for(Curso c : cursos) {
                            if(curso.equals(c)) {
                                cursoEscolhido = c;
                            
                            }
                            
                        }
                        Notas notas = this.leNota();
                        rendimento = new Rendimento (alunoEscolhido, cursoEscolhido, notas);
                       if ((alunoEscolhido != null)&& (cursoEscolhido != null)){
                           entradaValida= true;
                       }
                       else {
                System.out.println("Dados inconsistentes, tente novamente");
                              }
		}
		return rendimento;
	}
	
			 public Notas leNota() {
                         boolean entradaValida = false;
                         Scanner in  = new Scanner (System.in);
                         Notas notas = new Notas();
		         while(entradaValida==false) {
			System.out.println("Entre com as notas");   
                        System.out.println("Informe o valor da NP1:");
                        double np1 = in.nextDouble();
                        System.out.println("Informe o valor da NP2:");
                        double np2 = in.nextDouble();
                        System.out.println("Informe o valor da SUB:");
                        double sub = in.nextDouble();
                        System.out.println("Informe o valor da EXAME:");
                        double exame = in.nextDouble();
                        notas.setNota(NP1, np1);
                        notas.setNota(NP2, np2);
                        notas.setNota(SUB, sub);
                        notas.setNota(EXAME, exame);
                        
                        entradaValida = true;
                        
                        
                        
                         }
            return notas;
                         }
                        
        public Aluno escolheAluno(Alunos alunos, Cursos cursos, Faculdade faculdade){
                         boolean entradaValida = false;
                         Aluno aluno = null;
                         Scanner in  = new Scanner (System.in);
		         while(entradaValida==false) {
                         System.out.println("Escolha um aluno já inscrito:");
                        mostrarAlunos(alunos);
                        System.out.println("");
                        String id = this.leId();
                        
                        for(Aluno al : alunos) {
                            if(al.getId().equalsIgnoreCase(id)) {
                                entradaValida= true;
                               aluno = al;
                              
                            }
                        } 
                        if (aluno == null){
                            System.out.println("Entrada inválida, tente novamente");
                        }
                        else {
                           faculdade.getRelatorio(aluno);
                        }
                           
                         }
                         
                        
            return null;
        }
	
        
	public int menu() {
		
		boolean entradaValida = false;
		
		while(entradaValida==false) {
                    System.out.println("\n");
                    System.out.println("----------------------------------------------------");
                    System.out.println("\n");
			System.out.println("selecione uma da opções");
			System.out.println("1 - Listar cursos");
			System.out.println("2 - Listar Alunos");
			System.out.println("3 - Listar histório do aluno");
			System.out.println("4 - Listar o relatório de rendimento de cada curso");
                        System.out.println("5 - Incluir um novo aluno");
                        System.out.println("6-  Incluir um novo curso");
			System.out.println("7-  Incluir um novo rendimento");
                        System.out.println("8-  Sair");
			Scanner in = new Scanner(System.in);
			int opcao = in.nextInt();
			return opcao;
		}
		
		return -1;
}

}	

	
   
