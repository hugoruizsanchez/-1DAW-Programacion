package ud2;

import java.util.Random;

public class ej226 {

	public static void main(String[] args) {
	
		
		 
		
		for(int i=1; i<=15;++i) {
			System.out.println("["+ resultado() + "]");
		}
	
	}
	
	

	public static char resultado (){
		
		double numero;
		numero=Math.random();
		if(numero>=0 && numero<0.5) {
			 return '1';
			}
		
		
		 if(numero>=0.51 && numero<0.7){
			 return 'x'; 
		 }
		
		 if(numero>=0.71){
			 return '2'; 
		}
		 return 'f';
	}
}
