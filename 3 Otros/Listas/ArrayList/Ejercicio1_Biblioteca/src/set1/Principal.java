package set1;

import set1_2.Menu;

/*
 * PROYECTO: REALIZAR UNA BIBLIOTECA VIRTUAL QUE CONSTE DE:
 
 PUBLICACIÓN (SUPERCLASE)
 
 	> PERIÓDICOS.
 	> LIBRO. 

 */

public class Principal {
	
	public static void main(String[] args) {
		 
// 		MENÚ - CONFIGURACIONES. 
		
		 String [] seleccion = {
				 "Añadir libro", 
				 "Añadir periódico",
				 "Listar libros en biblioteca",
				 "Listar periódicos en biblioteca",
				 "Ver datos libro",
				 "Ver datos periódico",
				 "Eliminar libro",
				 "Eliminar periódico",
				 "Eliminar todos los archivos"
				 }; 
		 
		 Menu menu = new Menu (seleccion, "Biblioteca virtual");
		 menu.mostrarMenu();
		

// CREACION DE OBJETO BIBLIOTECA 
		 
		 Biblioteca b1 = new Biblioteca ();
		 int totalArchivos = 0;
		 b1.inicializarBiblioteca();
		 
//	SELECTOR DE OPCIONES: 
		 
		 int eleccion = 1;
		 
		 while (eleccion !=0) {
			 
			 eleccion = menu.eligeOpcion();
			 
			 switch (eleccion) {
			 
			 case 1: System.out.println ("Elección -> "+seleccion [0]);
			 	 
			 if (b1.agregarLibro(b1.libroLibre()) == true) {
				 totalArchivos++;
			 }
			 
			 break;
			 
			 case 2: System.out.println ("Elección -> "+seleccion [1]);
			 
			 if (b1.agregarPeriodico(b1.periodicoLibre()) == true) {
				 totalArchivos++;
			 }
			 
			 break;
			 
			 case 3: System.out.println ("Elección -> "+seleccion [2]);
			 
			 b1.listarLibros(totalArchivos);
			 
			 break;
			 
			 case 4: System.out.println ("Elección -> "+seleccion [3]);
			 
			 b1.listarPeriodicos(totalArchivos);
			 
			 break;
			 
			 case 5: System.out.println ("Elección -> "+seleccion [4]);
			 
			 b1.mostrarLibro();
			 
			 break; 
			 
			 case 6: System.out.println ("Elección -> "+seleccion [5]);
			 
			 b1.mostrarPeriodico();
			 
			 break; 
			 
			 case 7: System.out.println ("Elección -> "+seleccion [6]);
			
			 b1.eliminarLibro();
			 
			 break; 
			 
			 case 8: System.out.println ("Elección -> "+seleccion [7]);
			 
			 b1.eliminarPeriodico();
			 
			 break; 
			 
			 case 9: System.out.println ("Elección -> "+seleccion [8]);
			 
			 b1.inicializarBiblioteca();
			 
			 }
			 
		 }
		 
	}
	


}
