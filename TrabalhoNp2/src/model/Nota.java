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
public class Nota {
    private double valor;
	
	public Nota(double aValor) {
		this.valor = aValor;
		this.valor = Math.min(valor, 10.0);
		this.valor = Math.max(valor, 0.0);
	}

	@Override
	public String toString() {
		return "Nota [valor=" + valor + "]";
	}
}
