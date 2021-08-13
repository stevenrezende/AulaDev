package restaurante.calorias;
import javax.swing.JOptionPane;
public class restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calorias=0;
		String opt = JOptionPane.showInputDialog( "Entre com seu prato preferido \n"
				+ "1 - Vegetariano (180 cal) \n"
				+ "2 - Peixe (230 cal) \n"
				+ "3 - Frango 250 cal\n"
				+ "4 break- Carne (350 cal)");
           switch (opt) {
           case "1":
        	   calorias=calorias+180;
        	   JOptionPane.showMessageDialog(null, "Vegetariano "+ calorias +"calorias");
        	   break;
           case "2":
        	   calorias=calorias+230;
        	   JOptionPane.showMessageDialog(null, "Peixe " + calorias +"calorias");
        	   break;
           case "3":
        	   calorias=calorias+250;
        	   JOptionPane.showMessageDialog(null, "frango " + calorias + "calorias");
        	   break;
           case "4":
        	   calorias=calorias+350;
        	   JOptionPane.showMessageDialog(null, "Carne " + calorias + " calorias");
        	   break;
        	 default:JOptionPane.showMessageDialog(null, "Inválido");
        		 
           }
           String optSobremesa = JOptionPane.showInputDialog( "Entre com seu prato preferido \n"
   				+ "1 - Abacaxi (75) \n"
   				+ "2 - o Diet (110 cal) \n"
   				+ "3 - Mouse Diet (170 cal)\n"
   				+ "4 -Mouse chocolate (200 cal)");
              switch (optSobremesa) {
              case "1":
           	   calorias=calorias+75;
           	   JOptionPane.showMessageDialog(null, "Abacaxi "+ calorias +"calorias");
           	   break;
              case "2":
           	   calorias=calorias+110;
           	   JOptionPane.showMessageDialog(null, "Sorvete Diet " + calorias +"calorias");
           	   break;
              case "3":
           	   calorias=calorias+170;
           	   JOptionPane.showMessageDialog(null, "Mousse Diet " + calorias + "calorias");
           	   break;
              case "4":
           	   calorias=calorias+200;
           	   JOptionPane.showMessageDialog(null, "Mousse chocolate " + calorias + " calorias");
           	   break;
           	 default:JOptionPane.showMessageDialog(null, "Inválido");
           		 
              }  
           
           
	}

}
