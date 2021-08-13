package trataexception;

public class TrataException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int [] numero = new int[5];
			for(int i = 0; i<=10;i++) {
				numero[i] = i;
				System.out.println("Numero" + i);
			}
			
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Indice fora do range: "+ erro );
			
		}
		

	}

}
