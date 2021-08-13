
package model;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cursos implements Iterable<Curso> {
	
	ArrayList<Curso> cursos = new ArrayList<Curso>();
//    Collection<Curso> cursos;
	
	public void add(Curso curso) {
		cursos.add(curso);
	}
	
	public Curso get(int i) {
		return cursos.get(i);
	}
	
	public int size() {
		return cursos.size();
	}
	
        public ArrayList getCursos() {
            return this.cursos;
        }

    @Override
    public Iterator<Curso> iterator() {
        return cursos.iterator();
    }

    @Override
    public void forEach(Consumer<? super Curso> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator<Curso> spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }

}
    

