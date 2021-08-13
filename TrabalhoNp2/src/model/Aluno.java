
package model;

/**
 *
 * @author Franc
 */
public class Aluno implements Comparable <Aluno>{
    private String id;
    private String nome;

    public Aluno(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    @Override
    public int compareTo(Aluno t) {
        return 0;
    }
    
    @Override
    //Aqui está vendo se o objeto está apontando para o mesmo endereço, assim vendo se são iguais
    public boolean equals(Object otherObject){
        if (this==otherObject)
            return true;
    //Se o objeto é nulo ou não é do tipo aluno ele retorna falso    
        if (otherObject==null|| ! (otherObject instanceof Aluno))
            return false;
        //Armazenando o objeto que a gente recebe em uma variável do tipo curso
        Aluno outroAluno = (Aluno) otherObject;
        return
                //Compara se o ID deles são iguais
                this.getId().equals(outroAluno.getId());
    }
          @Override
          public String toString(){
              return "Aluno ["+ "id="+ id + " nome=" + nome + "]";
                      
          }
}
