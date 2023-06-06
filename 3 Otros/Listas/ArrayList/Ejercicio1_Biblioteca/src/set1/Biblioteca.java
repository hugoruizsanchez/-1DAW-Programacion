package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	

//	ATRIBUTOS
	
	
	 public Libro arrayLibros [] = new Libro [10]; //* Array de libros que guarda cada libro. 
	 public Periodico arrayPeriodicos [] = new Periodico [10]; //* Array de periódicos que guarda cada libro. 
	
	
	 public int acotadorperiodico = 9;
	 public int acotadorlibro = 9;

	
//	MÉTODO CONSTRUCTOR
	 
	 
	 
	 public Biblioteca () {
		 
	 }
	 
// MÉTODOS DE FUNCIÓN ------------------
	 
// INICIALIZAR BIBLIOTECA 
	 
	// INICIALIZAR BIBLIOTECA
     
	/*Los libros son creados desde el principio, todos en existe="false" para que sean reconocidos. 
	 Esta función se usa al principio del programa, y también en el ajuste "Eliminar todos los archivos"
	*/ 
	 

     public void inicializarBiblioteca () {
  	   
  	   for (int i=0; i<arrayLibros.length; i++) {
  		   
 			Libro libro = new Libro (0, 0, "Espacio Vacío", "Espacio Vacío", "Espacio Vacío", "Espacio Vacío");
			
 			arrayLibros [i] = libro;
 			
 			arrayLibros [i].existe = false;
  		   
  	   }
  	   
  	   for (int i=0; i<arrayPeriodicos.length; i++) {
  		   
  		Periodico periodico = new Periodico (0, 0, "Espacio Vacío", "0");
 			
 			arrayPeriodicos [i] = periodico;
 			
 			arrayPeriodicos [i].existe = false; 
  		   
  	   }
  	   
     }

// AGREGAR PERIÓDICO.
     
     /*
	 	 * Modifica las propiedades de los libros no existentes. 
	     */
     
     
	 
		public boolean agregarPeriodico (int i) {
			
			if (i<=acotadorperiodico) {
			
			Scanner entrada = new Scanner (System.in);	
			Scanner entrada2 = new Scanner (System.in);
			
			float precio;
			int numeroDePaginas; 
			String nombre;
			String fecha;
			
			System.out.print ("Número de páginas: "); numeroDePaginas = entrada.nextInt();
			System.out.print ("Precio: "); precio = entrada.nextFloat();
			System.out.print("Nombre: "); nombre = entrada2.nextLine();
			System.out.print ("Fecha: "); fecha = entrada2.nextLine();
			
			
			
			arrayPeriodicos [i].numeroDePaginas = numeroDePaginas; 
			arrayPeriodicos [i].precio = precio;
			arrayPeriodicos [i].setNombre(nombre);
			arrayPeriodicos [i].setFecha(fecha);
			arrayPeriodicos [i].existe = true;
			
			return true;
			}
			else {
				
				System.out.println ("ERROR: Acción no realizada (Periódico ha llegado al límite de capacidad)");
				
				return false;
				
			}
			
		}
		
// MOSTRAR PERIÓDICO. 
		
		 /*
 	     * Muestra un periódico concreto. 
 	     */
		
		public  void mostrarPeriodico () {
			
	    	int i;
	    	   
	    	Scanner entrada = new Scanner (System.in);
	    	   
	        System.out.print ("Posición de periódico: "); i = entrada.nextInt();
	        
	        System.out.println ();
			
			System.out.println("Numero de paginas: " +arrayPeriodicos [i].numeroDePaginas);
			System.out.println("Precio: " +arrayPeriodicos [i].precio);
			System.out.println("Nombre: " +arrayPeriodicos [i].getNombre());
			System.out.println("Fecha: " +arrayPeriodicos [i].getFecha());
		}
		
// AGREGAR LIBRO
		
		public boolean agregarLibro (int i) {
			
		/*
	 	 * Modifica las propiedades de los libros no existentes. 
	     */
			
					if (i<=acotadorlibro) {
						
					Scanner entrada = new Scanner (System.in);
					
					float precio;
					int numeroDePaginas; 
					String tipoPortada; 
					String isbn; 
					String nombreAutor; 
					String editorial;
					
					System.out.print ("Número de páginas: "); numeroDePaginas = entrada.nextInt();
					System.out.print ("Precio: "); precio = entrada.nextFloat();
		
					Scanner entrada2 = new Scanner (System.in);
					
					System.out.print ("Tipo de portada: " ); tipoPortada = entrada2.nextLine();
					System.out.print ("ISBN: "); isbn = entrada2.nextLine();
					System.out.print ("Nombre del autor: "); nombreAutor = entrada2.nextLine();
					System.out.print ("Editorial: "); editorial = entrada2.nextLine();
		
				
					arrayLibros [i].numeroDePaginas = numeroDePaginas;
					arrayLibros [i].precio = precio;
					arrayLibros [i].tipoPortada = tipoPortada;
					arrayLibros [i].isbn = isbn;
					arrayLibros [i].nombreAutor = nombreAutor;
					arrayLibros [i].editorial = editorial; 
					arrayLibros [i].existe = true;
					 
					
					return true;
					}
					else {
						
						System.out.println ("ERROR: Acción no realizada (Libro ha llegado al límite de capacidad)");
						
						return false; 
						
					}
					
		}
		

//		VER LAS PROPIEDADES DE UN LIBRO
		
		 /*
 	     * Muestra un libro concreto. 
 	     */
		
		
       public void mostrarLibro () {
    	 
    	   int i;
    	   
    	   Scanner entrada = new Scanner (System.in);
    	   
    	   System.out.print ("Posición de libro: "); i = entrada.nextInt();
    	   
    	   System.out.println ();
	
    	   System.out.println ("Número de páginas: "+arrayLibros [i].numeroDePaginas);
    	   System.out.println ("Precio: "+arrayLibros [i].precio);
		   System.out.println ("Tipo de portada: "+arrayLibros [i].tipoPortada);
		   System.out.println ("ISBN: "+arrayLibros [i].isbn);
		   System.out.println ("Nombre del autor: "+ arrayLibros [i].nombreAutor);		
		   System.out.println ("Editorial: "+arrayLibros [i].editorial);
		   System.out.println ("Existe: "+arrayLibros [i].existe);
	
	
         }
		
	
//    LISTAR LIBROS
       
       /*
 	   En base a si el libro.existe es true, solo muestra los libros no eliminados. 
       */
       
       public void listarLibros (int k) {
    	   
    	   for (int i=0; i<k; i++) {
    		     		   
    		   if (arrayLibros [i].existe == true) {
    		   
    		   System.out.println ("ISBN / Título: "+arrayLibros [i].isbn);
    		   System.out.println ("Posición del estante: "+i+".");
    		   
    		   }
    		  
   
    	   }
       }
	 
//	   LISTAR PERIÓDICOS. 
       
       /*
 	   En base a si el periódico.existe es true, solo muestra los periodicos no eliminados. 
       */
       
       public void listarPeriodicos (int k) {
    	   
    	   
    	   for (int i=0; i<(k); i++) {
    		   
    		   if (arrayPeriodicos [i].existe == true) {
    		   
    		   System.out.println ("Nombre: "+arrayPeriodicos [i].getNombre());	   
    		   System.out.println ("Posición del estante: "+i+".");
    		   
    		   }
    		   
   
    	   }
       }
	 
// ELIMINAR LIBRO
       
       /*
 	   A elección del usuario, se elimina el libro  deseado. Su propiedad "existe" pasa a false. 
 	   El espacio no se elimina, sino que queda libre para ser modificado gracias a libroLibre
       */
       
       public void eliminarLibro () {
    	   
    	Scanner entrada = new Scanner (System.in);
    	
    	System.out.print("Introduzca posición del estante que desea liberar: "); int i = entrada.nextInt();
    	
    	arrayLibros [i].existe = false; 
    	
    	   
       }
       
// ELIMINAR PERIÓDICO
       
       /*
 	   A elección del usuario, se elimina el periódico deseado. Su propiedad "existe" pasa a false. 
 	   El espacio no se elimina, sino que queda libre para ser modificado gracias a periodicoLibre
       */
       
       public void eliminarPeriodico () {
    	
       	Scanner entrada = new Scanner (System.in);
       	
       	System.out.println ("Introduzca posición del estante que desea liberar: "); int i = entrada.nextInt();
       	
       	arrayPeriodicos [i].existe = false; 
       	
    	   
       }
	
	
//	COMPROBADOR DE LIBRO LIBERADO. 
       
       /*
       Bucle que busca el archivo más cercano al principio del array que se encuentra en la posición "false",  
       y devuelve el la posición. Este return se utiliza  en el  constructor de agregarLibro
       para posicionar su lugar. 
       */
            
       public int libroLibre () {
    	   
    	   int libre =30;
    	   boolean terminado = false; 
    	   int j =0;
    	   
    	   while (terminado == false ) {
    		   
    		   if (j>= acotadorlibro) {
    			   terminado = true;
    		   }
    		   
    		   if (arrayLibros [j].existe == false ) {
    			   
    			   
    			   // System.out.println ("Espacio libre encontrado en: "+j);
    			   
    			   libre = j;
    			   terminado = true;
    			   
    		   }
    		   
    		   		// System.out.println ("Omision en: "+j);
    		   
    		   		j++;
    		   
    	      }
    	   
    	   return libre; 
    	 
             }
       
       
//  COMPROBADOR DE PERIÓDICO LIBERADO
       
 /*
  Bucle que busca el archivo más cercano al principio del array que se encuentra en la posición "false",  
  y devuelve el la posición. Este return se utiliza  en el  constructor de agregarPeriodico
  para posicionar su lugar. 
  */
       
       public int periodicoLibre () {
    	   
    	   int libre =30;
    	   boolean terminado = false; 
    	   int j =0;
    	   
    	   while (terminado == false ) {
    		   
    		   if (j>= acotadorperiodico) {
    			   terminado = true;
    		   }
    		   
    		   if (arrayPeriodicos [j].existe == false ) {
    			   
    			   
    			   // System.out.println ("Espacio libre encontrado en: "+j);
    			   
    			   libre = j;
    			   terminado = true;
    			   
    		   }
    		   
    		   		// System.out.println ("Omision en: "+j);
    		   
    		   		j++;
    		   
    	      }
    	   
    	   return libre; 
    	   
       }
       
       
       

      
       
	

}