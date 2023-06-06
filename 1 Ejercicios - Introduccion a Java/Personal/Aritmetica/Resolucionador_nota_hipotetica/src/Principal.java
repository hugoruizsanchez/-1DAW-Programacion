import java.util.Scanner; 
public class Principal {

	public static void main(String[] args) {

		float participacion, examen1, examen2, examenF,nota; 
		int aproximada;
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Nota de participación:");
		
		participacion = entrada.nextFloat();
		
		System.out.println ("Nota del primer parcial: ");
		
		examen1 = entrada.nextFloat();
		
		System.out.println ("Nota del segundo parcial: ");
		
		examen2 = entrada.nextFloat();
		
		System.out.println ("Nota del examen final: ");
		
		examenF = entrada.nextFloat();
		
		nota = (float) (participacion*0.1+examen1*0.25+examen2*0.25+examenF*0.40); 
		 	
		aproximada = Math.round(nota);
		
		System.out.println ("Nota final: "+nota +" Nota aproximada: "+aproximada +".");
		
	}

}
