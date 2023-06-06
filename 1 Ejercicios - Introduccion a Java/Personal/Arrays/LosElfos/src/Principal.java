
public class Principal {

	public static final int[] datos= {
			
			9712,
			12437,
			3457,
			11610,
			4598,
			-1,
			1698,
			1551,
			6798,
			7440,
			3574,
			12107,
			3697,
			-1,
			9019,
			12113,
			6266,
			11838,
			7562,
			6444,
			-1,
			10364,
			1437,
			10513,
			2988,
			10836,
			13749,
			-1,
			3011,
			9552,
			11575,
			12646,
			9861,
			6347,
			-1,
			15883,
			15888,
			6725,
			7353,
			4998,
			-1,
			3165,
			7637,
			6348,
			3250,
			13535,
			12802,
			-1,
			6683,
			13364,
			15858,
			5489,
			5315,
			-1,
			12294,
			13732,
			9734,
			6165,
			-1,
			6023,
			2374,
			5773,
			5578,
			6419,
			4301,
			6861,
			4560,
			6021,
			2960,
			1349,
			-1,
			1847,
			2687,
			4164,
			3599,
			4361,
			7463,
			3010,
			4351,
			6738,
			7941,
			3855,
			-1
				
	};
	
	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static int calcula_maximo(int[] misDatos) {
		int result = 0;
		int result_alto =0;
		// TODO programar aqui
		
	for (int i=0; i<datos.length; i++) {
		
		if (datos [i]>0) {
			
			result = datos [i] + result;
			
		} 
		else {
			
			if (result_alto<result) {
				
				result_alto = result;
				
			}

			result=0;
			
			
		}
		
	}
		
		
		return result_alto;
		
		
	}
	
	
	public static void calcula_top (int [] misDatos) {
		
		int suma =0;
		int top1 =0; 
		int top2 =0; 
		int top3 =0; 
		
		for (int i=0; i<datos.length; i++) {
			
			if (datos [i]>0) {
				
				suma = datos [i] + suma;
				
			} 
			
			else {
				
				if (suma>top1) {
					
					top1 = suma;
					
				}
				
				suma =0; 
				
			} 
			
			
		} 
		
		for (int i=0; i<datos.length; i++) {
			
			if (datos [i]>0) {
				
				suma = datos [i] + suma;
				
			} 
			
			else {
				
				if (suma>=top1) {
		

				} 
				else { top2=suma; }
				
				suma =0; 
				
			} 
			
		}
		
		for (int i=0; i<datos.length; i++) {
			
			if (datos [i]>0) {
				
				suma = datos [i] + suma;
				
			} 
			
			else {
				
				if (suma>=top1||suma>=top2) {
	
				}
				
				else { top3=suma; }
				
				suma =0; 
				
			} 
			
			
			
		}
		
		System.out.println ("Top 1: "+top1);
		System.out.println ("Top 2: "+top2);
		System.out.println ("Top 3: "+top3);
	}
	
	
	public static void calcula_top_alternativo (int [] misDatos) {
	
	 int suma =0;
	 int top1Al=0;
	 int top2Al=0;
	 int top3Al=0;
	 
	
	int contador =0;
	for (int i=0; i<datos.length; i++) {
		 
	if (datos [i]>0 || datos [datos.length-1]!=-1 && i==datos.length-1 ) {
		
		if (datos [i]>0) {
		
			suma = suma + datos [i];
			
		} 
		
		else {
			
			suma = suma + datos [datos.length-1];
			
		}
				
	}
	
	else if (datos[i]<0) {
		
		System.out.println(suma);
		
		if (suma>=top1Al) {
			top1Al =suma;
		} 
		else if (suma>=top2Al) {
			top2Al = suma;
		}
		else if (suma>=top3Al) {
			top3Al = suma;
		}
		
		suma =0; 
		
		
	}
	
	
	
	 }
	
	System.out.println (contador);
		System.out.println ("Top 1 ALTERNATIVO: "+top1Al);
		System.out.println ("Top 2 ALTERNATIVO: "+top2Al);
		System.out.println ("Top 3 ALTERNATIVO: "+top3Al);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcula_maximo(datos));
		calcula_top (datos);
		calcula_top_alternativo (datos);
		
	}

}
