
package model;

import model.Curso.Nivel;
import java.util.Comparator;
import java.lang.String;
//import javafx.scene.media.Media;
public class Rendimento {
        Curso curso;
	Notas notas;
        Nota media;
        Nivel nivel;
        Aluno aluno;

	public Rendimento(Aluno aluno, Curso curso, Notas notas) {
		this.curso = curso;
                this.aluno = aluno;
		this.notas = new Notas();
	}
        

	public Curso getCurso() {
		return curso;
	}

	public Notas getNotas() {
		return notas;
	}

	public void setNota(Prova prova, double nota) {
		this.notas.setNota(prova, nota);
	}
        
       public boolean situacaoAluno(){
           double mediaInicial = 0.0;
           double mediaComExame = 0.0;
           double NP1 = notas.getNota(Prova.NP1);
           double NP2 = notas.getNota(Prova.NP2);
           double SUB = notas.getNota(Prova.SUB);           
           double EXAME = notas.getNota(Prova.EXAME);
           
           if ((NP1<NP2)&&(NP1<SUB)){
           mediaInicial = (NP2+SUB)/2;
           }
           else if ((NP1>NP2)&&(NP2<SUB)){
           mediaInicial = (NP1+SUB)/2;
       }
           String nomeNivel = String.valueOf(curso.nivel);
           if (nomeNivel.equals("GRADUACAO")) {
               if(mediaInicial >= 7.0) {
                   media = new Nota(mediaInicial);
                   return true;
               } else {
                   mediaComExame = (mediaInicial + EXAME) / 2;
                   if(mediaComExame >= 5) {
                       media = new Nota(mediaComExame);
                       return true;
                   }
                   else {
                       media = new Nota(mediaInicial);
                       return false;
                   }
               }
           }
           if (nomeNivel.equals("POS_GRADUACAO")) {
               if(mediaInicial >= 5.0) {
                   media = new Nota(mediaInicial);
                   return true;
               } else {
                   mediaComExame = (mediaInicial + EXAME) / 2;
                   if(mediaComExame >= 5) {
                       media = new Nota(mediaComExame);
                       return true;
                   } else {
                       media = new Nota(mediaInicial);
                       return false;
                   }
               }
           }
            return false;
       }
        
        
        @Override
	public String toString() {
		return "Rendimento [curso=" + curso + ", notas=" + notas + "]";
	}

    Object getAluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
	


}
