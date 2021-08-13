package aulaPoo51;

public class AulaPoo51 {

	public static void main(String[] args) {
		Conta p1  = new Conta();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
		p1.estadoAtual();
		
		Conta p2  = new Conta();
		p2.setNumConta(1112);
		p2.setDono("Creusa");
		p2.abrirConta("cp");
		p2.estadoAtual();
		
        
	}

}
