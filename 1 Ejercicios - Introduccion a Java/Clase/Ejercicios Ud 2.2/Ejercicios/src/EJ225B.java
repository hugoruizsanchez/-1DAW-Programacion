import java.util.Scanner;

public class EJ225B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] caracter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'E', 'D', 'X', 'D', 'N' , 'J', 'Z', 'S' , 'U', 'V', 'H', 'L', 'C', 'K', 'E'};
		String DNI; 
		int resto;
		Scanner entrada = new Scanner (System.in);
		
		DNI = entrada.next();
		
		if (DNI.length()!=8) {
			
			System.out.println ("\nEl número introducido no corresponde al formato de un DNI. ");
		}else {
			
			Integer.parseInt(DNI);
			
			
		}
		
	}

}
