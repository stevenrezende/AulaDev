package aulaPoo5;

import javax.swing.JOptionPane;

public class Caneta {
	private String  modelo;
	private float ponta ;
	private boolean tampada;
	private String cor;
	
	public Caneta(String modelo, float ponta, boolean tampada, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = tampada;
		this.cor = cor;
	}
	
	
	
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void status() {
		
		JOptionPane.showMessageDialog(null,"Sobre a CANETA"  
		+ "\nPonta " + this.ponta
		+ "\nModelo " + this.modelo
		+ "\nCor " + this.getCor()
		+ "\nTampada " + this.tampada);
		
	
}
	
	
}
