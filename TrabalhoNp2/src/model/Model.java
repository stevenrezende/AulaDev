
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import model.Curso.Nivel;


public class Model {
    Faculdade faculdade = new Faculdade();
    String caminho = System.getProperty("user.dir")+"/src/dao";            
    String caminhoAluno = caminho + File.separator + "alunos.csv";
    String caminhoCurso = caminho + File.separator + "cursos.csv";
    Alunos alunos = new Alunos();
    Cursos cursos = new Cursos();
    
    
    
	public void carrega() throws IOException {
            this.carregaAlunos();
            this.carregaCursos();
            this.carregaRendimentos();
        }
        
        
        
        public void inserirAluno(){
    try {
    PrintWriter out = new PrintWriter(caminhoAluno, "UTF-8");
   
    for(Aluno aluno: alunos) {
     out.println(aluno.getId() + ";" + aluno.getNome());    
    }
    out.close();
    
}catch (IOException e) {
    e.printStackTrace();
}
}
  public void inserirCurso() {
            try {
                PrintWriter out = new PrintWriter(caminhoCurso, "UTF-8");
                
                for(Curso curso: cursos)  {
                    String str = curso.getNome() + ";" + curso.getNivel() + ";" + curso.getAno(); 
                     out.println(str);   
                    }
   
                    
                    out.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
	public Aluno getAluno() {
		return faculdade.getAlunos();
	}

	public Cursos getCursos() {
		return cursos;
	}
	
	public void addCurso(Curso curso) {
                cursos.add(curso);
		faculdade.addCurso(curso);
                this.inserirCurso();
	}
        
        public void addAluno(Aluno aluno) {
                alunos.add(aluno);
		faculdade.addAluno(aluno);
                this.inserirAluno();
	}
	
	public void save() {
		System.out.println("salvando arquivos");
	}

    private void carregaAlunos() {
        try {
            FileInputStream fis = new FileInputStream(caminhoAluno);
            Scanner in = new Scanner (fis, "UTF-8");
            while (in.hasNextLine()){
                String linha = in.nextLine();
                String[] palavra = linha.split("\\;");

                String novoId= palavra [0];
                String novoNome = palavra [1];

                Aluno novoAluno = new Aluno(novoId, novoNome);

                alunos.add(novoAluno);
            }
            fis.close();
                   
        } catch (FileNotFoundException e){
                e.printStackTrace();

        } catch (IllegalArgumentException e){
                e.printStackTrace();

        } catch (IOException e){
                e.printStackTrace();
        }
}

    private void carregaCursos() {
        try {
            FileInputStream fis = new FileInputStream(caminhoCurso);
            Scanner in = new Scanner (fis, "UTF-8");
            while (in.hasNextLine()){
                String linha = in.nextLine();
                String[] palavra = linha.split("\\;");


                String novoNome = palavra [0];
                Curso.Nivel novoNivel = Enum.valueOf(Curso.Nivel.class, palavra[1]);
                int novoAno= Integer.parseInt(palavra [2]);

                Curso novoCurso = new Curso (novoNome, novoNivel, novoAno);

                cursos.add(novoCurso);
            }
            fis.close();
                   
        } catch (FileNotFoundException e){
                e.printStackTrace();

        } catch (IllegalArgumentException e){
                e.printStackTrace();

        } catch (IOException e){
                e.printStackTrace();
        }
    }

    public Alunos getAlunos() {
        return alunos;
    }

    public boolean compararAluno(Aluno aluno) {
        boolean igual = true;
        for (Aluno al: alunos) {
            igual = al.getId().equals(aluno.getId());
        }
        return igual;
    }

    public void addConstroiRendimento(Rendimento rendimento) {
        faculdade.addCurso(rendimento.curso);
        faculdade.addAluno(rendimento.aluno);
        faculdade.addRendimento(rendimento);
        
        
//        quadroDeAlunos.addAluno(rendimento.aluno);
//        quadroDeAlunos.addRendimento(rendimento);
//        quadroDeCursos.addCurso (rendimento.curso);
//        quadroDeCursos.addRendimento (rendimento);
        
        
    }

    public Faculdade getFaculdade() {
        return this.faculdade;
    }

    private void carregaRendimentos() throws IOException {
      try {
          for (Curso curso: cursos) {
              String cursoInfo = ""+ curso.getNome() + "_" + curso.getNivel() + "_"+ curso.getAno();
              String caminhoDoArquivo = caminho + cursoInfo.toUpperCase() + ".csv";
              FileInputStream fis = new FileInputStream(caminhoDoArquivo);
              Scanner in = new Scanner (fis, "UTF-8");
            while (in.hasNextLine()){
                String linha = in.nextLine();
                String[] palavra = linha.split("\\;");

                String id = palavra [0];
                double np1 = Double.parseDouble(palavra[1]);
                double np2 = Double.parseDouble(palavra[2]);
                double sub = Double.parseDouble(palavra[3]);
                double exame = Double.parseDouble(palavra[4]);
                
                
            }
            fis.close();
          }        
        } catch (FileNotFoundException e){
                e.printStackTrace();

        }  
    }

}
