/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Franc
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Alunos implements Iterable<Aluno>{
	
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void add(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public Aluno get(int i) {
		return alunos.get(i);
	}
	
	public int size() {
		return alunos.size();
	}

    @Override
    public Iterator<Aluno> iterator() {
        return alunos.iterator();
    }
	

}
