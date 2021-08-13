package contaBancoPOO;
import javax.swing.JOptionPane;
public class Conta {
	private int numero;
	private int agencia;
	private String nome;
	private String tipo;
	private float saldo;
	private boolean status;
	
	
	
	public Conta() {
		
		this.setAgencia(5600);
		this.setStatus(true);
	}
	//ctrl +3 digitando a siga ggas para gerar Getters and Setter automaticamente
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	
	public void status() {
		JOptionPane.showMessageDialog(null,"Dados da Conta\n" +
	                                 "Dono Da conta:" + this.getNome() +
	                                 "\n Agencia:" + this.getAgencia() +
			                         "\n Conta: " + this.getNumero() +
			                         "\n Tipo da Conta:" + this.getTipo() +
			                         "\n Saldo da Conta: " + this.getSaldo() + 
			                         "\n Status da Conta: " + this.isStatus());
		
		
	}
	
	  //Passar parametro tipo de conta "t"
	   //status da conta fica aberta(true)
	   public void abrirConta(String t) {
	
		   
	   }
	   // para fechar conta saldo tem que ser 0
	   public void fecharConta() {
		   // se tiver dinheiro na conta ele não permite fechar
	
	      // se saldo for negativo também não pode fechar
		
	   }
		   
	   
	   public void depositar(float v) {
	
	   }
	   // só pode sacar se conta estiver aberta e saldo for maior do que o valor requerido "v"
	   // o valor é passado como parametro
	   public void sacar(float v) {
	
		   
	   }
	   
	  // pagar mensalidade manutenção de conta
	   public void pagarMensal(){
	
	   }
	

}
