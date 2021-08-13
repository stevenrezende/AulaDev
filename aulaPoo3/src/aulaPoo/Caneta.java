package aulaPoo;
import javax.swing.JOptionPane;
public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	public void status() {
		JOptionPane.showMessageDialog(null,"Uma Caneta " + this.cor 
		+ "\nEstá tampada? " + this.tampada
		+ "\nPonta " + this.ponta
		+ "\nModelo " + this.modelo
		+"\nCarga " + this.carga) ;
	}
	public void rabiscar() {
		if(this.tampada ==true) {
			JOptionPane.showMessageDialog(null,"ERRO! Não posso rabiscar","ERRO",0);
		} else {
			JOptionPane.showMessageDialog(null,"Estou Rabiscando","Sucesso",1);
		}
	}
	protected void tampar() {
		this.tampada = true;
	}
	protected void destampar() { 
		this.tampada =  false;
		
	}
}
