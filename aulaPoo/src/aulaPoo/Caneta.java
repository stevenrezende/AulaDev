package aulaPoo;
import javax.swing.JOptionPane;
public class Caneta {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		JOptionPane.showMessageDialog(null,"Uma Caneta " + this.cor 
		+ "\nEstá tampada? " + this.tampada
		+ "\nPonta " + this.ponta
		+ "\nModelo " + this.modelo
		+"\nCarga " + this.carga) ;
	}
	void rabiscar() {
		if(this.tampada ==true) {
			JOptionPane.showMessageDialog(null,"ERRO! Não posso rabiscar","ERRO",0);
		} else {
			JOptionPane.showMessageDialog(null,"Estou Rabiscando","Sucesso",1);
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() { 
		this.tampada =  false;
		
	}
}
