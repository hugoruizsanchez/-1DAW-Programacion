
public class EJ2020 {

	public static void main(String[] args) {
	
		int [] valor = {2,7,9,12,3,6};
		
		System.out.println (valorMayorArray (valor));
		System.out.println (valorMenorArray (valor));

	}
	
	
	
	public static int valorMayorArray (int [] valor) {
		
		int valor_mayor, valor_superior=-2147483648;
		
		for (int i=0;i<valor.length; i++) {
			for (int j =1; j<valor.length; j++) {
				
				if (valor [i]>valor[j]) {
					valor_mayor = valor [i];
					
					if (valor_superior<valor_mayor) {
	
						valor_superior=valor_mayor;
					}
					
				}
				
				else if (valor[i]<valor[j]) {
					valor_mayor = valor [j];
					if (valor_superior<valor_mayor) {
						valor_superior=valor_mayor;
						
					}
				}
				
			}
			
		}
		return valor_superior;
		
			
	}
	

	public static int valorMenorArray (int [] valor) {
		
		int valor_menor, valor_inferior = 2147483647; 
		
		for (int i=0; i<valor.length; i++) {
			for (int j =1; j<valor.length; j++) {
				
			if (valor[i]<valor[j]) {
				
			valor_menor = valor[i];
			
			if (valor_menor<valor_inferior) {
				
				valor_inferior = valor_menor;
				
			}
			
			else if (valor[j]<valor[i]) {
				valor_menor = valor [j];
				if (valor_menor<valor_inferior) {
					valor_inferior= valor_menor;
				}
			}
				
			}
				
			}
		}
	
		return valor_inferior;
		
	}
	
}


