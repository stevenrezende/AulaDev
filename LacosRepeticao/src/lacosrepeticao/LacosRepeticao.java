package lacosrepeticao;

public class LacosRepeticao {

	public static void main(String[] args) {
		int x =0 ;
		int m[][] = new int[2][4];

		while (x < 4) {
			System.out.println("Voc� n�o tem permissao para entrar");
			
			m[1][x] = 6;
			x++;
		}
		x = 0;
		while (x < 4) {
			System.out.println("Vetores preenchidos" + m[1][x] + "posicao 1, " + x );		
			x++;
		}

	}

}
