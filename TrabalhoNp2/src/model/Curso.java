
package model;


    public class Curso implements Comparable<Curso>{
	
	private String nome;

	public enum Nivel{GRADUACAO, POS_GRADUACAO}
	Nivel nivel;
        private int ano;
	
	public Curso(String aNome, Nivel aNivel, int aAno) {
		this.nome = aNome;
		this.nivel = aNivel;
                this.ano = aAno;
	}
	
	public String getNome() {
		return this.nome;
	}
        
        public Nivel getNivel() {
		return this.nivel;
	}
        
        public int getAno() {
		return this.ano;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		
		if(this==otherObject)
			return true;
		
		if(otherObject==null || ! (otherObject instanceof Curso) )
			return false;
		
		Curso outroCurso = (Curso) otherObject;
		
		return 
				   this.getNome().equals(outroCurso.getNome())
				&& this.nivel == outroCurso.nivel;
	}
	
	@Override 
	public int compareTo(Curso outroCurso) {
		if(!this.getNome().equals(outroCurso.getNome())){
			return this.getNome().compareTo(outroCurso.getNome());
		}
		return this.nivel.compareTo(outroCurso.nivel);
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", nivel=" + nivel + ", ano=" + ano + "]";
	}
	
	
	
	
	
}
