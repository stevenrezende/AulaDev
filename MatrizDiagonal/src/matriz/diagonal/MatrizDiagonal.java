package matriz.diagonal;

public class MatrizDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[10][10];
		
		for (int coluna = 0;coluna < 10; coluna++)
		{
			for (int linha = 0;linha < 10; linha++) {
				if (linha == coluna) {
					matriz[linha][coluna] = 5;
				}else {
					matriz[linha][coluna] = 0;
				}
				
			}
			
			
		}
		int linhaR = 9;
		for (int coluna = 0;coluna < 10; coluna++)
		{
			
			matriz[coluna][linhaR--] = 3;
		}
		
		for (int coluna = 0;coluna < 10; coluna++)
		{
			System.out.print("\n");
			for (int linha = 0;linha < 10; linha++) {
				System.out.print(" " + matriz[linha][coluna]);
				
			}
			
			}
		
	}

}
