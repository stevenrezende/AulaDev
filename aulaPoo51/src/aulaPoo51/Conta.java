package aulaPoo51;
import  javax.swing.JOptionPane;
public class Conta {
   public int numConta;
   protected String  tipo;
   private String dono;
   private float saldo;
   private boolean status;
   
public int getNumConta() {
	return numConta;
}
public Conta() {
	super();
	this.saldo = 0;
	this.status = false;
}
public void setNumConta(int numConta) {
	this.numConta = numConta;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getDono() {
	return dono;
}
public void setDono(String dono) {
	this.dono = dono;
}
public float getSaldo() {
	return saldo;
}
public void setSaldo(float saldo) {
	this.saldo = saldo;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
   
   //Passar parametro tipo de conta "t"
   //status da conta fica aberta(true)
   public void abrirConta(String t) {
	   setTipo(t);
	   setStatus(true);
	   //se conta for corrente coloque 50,00
	   if (t == "cc") {
		   setSaldo(50);
	   }else {
		   // se conta for poupanca coloque 150
		   if (t =="cp") {
			   setSaldo(150);
		   }
	   }
	   
   }
   // para fechar conta saldo tem que ser 0
   public void fecharConta() {
	   // se tiver dinheiro na conta ele não permite fechar
	   if (this.saldo > 0) {
		   JOptionPane.showMessageDialog(null, "Conta com Dinheiro","Dinheiro em conta",0);
	   }else {
		   // se saldo for negativo também não pode fechar
		   if(this.saldo <0 ){
				   JOptionPane.showMessageDialog(null,"Conta em Débito","Débito pendente",0);
			   }else {
				   setStatus(false);
			   }
		   }
   }
	   
   
   public void depositar(float v) {
	   //verificar se status da conta é aberta
	   // só pode depositar se estiver aberta
	     if (isStatus()){
	    	 setSaldo(getSaldo()+v);
	     }else {
	    	 JOptionPane.showMessageDialog(null,"Impossível Depositar","FALHA",0);
	     }
   }
   // só pode sacar se conta estiver aberta e saldo for maior do que o valor requerido "v"
   // o valor é passado como parametro
   public void sacar(float v) {
	   if(isStatus()) {
		   if(getSaldo() > v) {
			   setSaldo(getSaldo()-v);
		   }else {
			   JOptionPane.showMessageDialog(null,"Saldo Insuficiente","Sem dinheiro!",0);
		   }
	   }else {
		   JOptionPane.showMessageDialog(null,"IMpossível Sacar","Inconsistencia",0);
	   }
	   
   }
   //Mostrar estado Atual da conta
   
   public void estadoAtual() {
	   JOptionPane.showMessageDialog(null,"Conta: "+this.getNumConta() 
	   + "\nTipo:" + getTipo() 
	   + "\nDono: " + getDono()
	   + "\nSaldo "+ getSaldo()
	   + "\nStatuss" +  isStatus());
	   
   }
   // pagar mensalidade manutenção de conta
   public void pagarMensal(){
	   int v=0;
	   if (this.tipo == "cc") {
		   v =12;
		   
	   }else {
		   if (this.tipo == "cp") {
			  v = 20; 
		   }
	   }
	   if (isStatus()) {
		   if (this.saldo > v) {
			   this.saldo = getSaldo() -v ;
		   }else {
			   JOptionPane.showMessageDialog(null,"Saldo insuficiente");
		   }
	   }else {
		   JOptionPane.showMessageDialog(null,"Impossivel pagar");
	   }
   }
}
