package aulaPoo04;

import javax.swing.JOptionPane;

public class Caneta {
	public String  modelo;
	private float ponta ;
	private boolean tampada;
	private String cor;
	
	
	
	
	
	
	
	public Caneta() { //Metodo Contrutor
		this.destampar();
		this.cor = "Azul";
	}
	
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return this.ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		 this.tampada = false;
		
	}
	
	public void status() {
		
			JOptionPane.showMessageDialog(null,"Sobre a CANETA"  
			+ "\nPonta " + this.ponta
			+ "\nModelo " + this.modelo
			+ "\nCor " + this.cor
			+ "\nTampada " + this.tampada);
			
		
	}
}
