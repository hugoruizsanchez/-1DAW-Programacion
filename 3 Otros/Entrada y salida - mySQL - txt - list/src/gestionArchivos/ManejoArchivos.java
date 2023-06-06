	package gestionArchivos;

import java.io.*;
import java.util.ArrayList;

import EjemploPropuesto.Coche;

public class ManejoArchivos {
	
	public static void crearArchivo (String nombreArchivo) {
		
		File archivo = new File (nombreArchivo); // Permite vincular un archivo creado on el objeto. Esto no crea el archivo, sino que asocia una localizacion con un nombre

		if (archivo.exists() == false) {
			
			try {
				PrintWriter salida = new PrintWriter (archivo);  // Clase que administra el archivo. Al crearlo, sirve para escribir un archivo o para crearlo si no existe. 
				salida.close(); // Se cierra. 
				System.out.println ("manejoArchivos -> crearArchivo: Se creó el archivo "+nombreArchivo);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			
		}
		else {
			System.out.println ("manejoArchivos -> El archivo ya existe.");
		}
	
	}
	
	/*
	 * LECTURA Y ESCRITURA DE ARCHIVOS DE TEXTO .TXT
	 */
	
	public static void escribirArchivo (String nombreArchivo, String contenido) {
		
		File archivo = new File (nombreArchivo); // Archivo nuevo, llamado segun el parametro ("nombreArchivo.extension")	
		
		try {
			// PrintWriter salida = new PrintWriter (archivo);  // Si el archivo existe, simplemente lo verifica. 
			PrintWriter salida = new PrintWriter (new FileWriter (archivo, true)); // Permite actualizar el archivo sin eliminarlo y crearlo de nuevo
			salida.println(contenido);
			salida.close();
			System.out.println ("-> crearArchivo: Se editó el archivo "+nombreArchivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	
	public static void leerArchivo (String nombreArchivo) {
		
		File archivo = new File (nombreArchivo); // Archivo nuevo, llamado segun el parametro ("nombreArchivo.extension")	
		
		try {
			BufferedReader entrada = new BufferedReader (new FileReader (archivo)); // Para cargar el archivo en el bufer entrada
			
			String lectura = "";
			System.out.println ("-> leerArchivo: Se leerá el arhivo "+nombreArchivo);
			while (lectura != null) { // Esto leerá todas las líneas del archivo. Cada entrada.readLine es una línea. 
				System.out.println (lectura);
				lectura = 	 entrada.readLine();				
			}
			entrada.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}
	
	/*
	 * LECTURA Y ESCRITURA DE ARRAYLIST Y OBJETOS
	 * Nota: si se desea realizar sobre un objeto, su clase correspondiente debe contener "implements serializable" para que no arroje error. 
	 * El formato debe ser .dat o .txt 
	 * 
	 * --> Se están aplicando genéricos, con el <T> estamos haciendo que sea compatible con cualqueir tipo de objeto
	 */
	
	public static <T> void escribirArchivoList (String nombreArchivo, ArrayList <T> contenido) {
		
		File archivo = new File (nombreArchivo);
		try {
			
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo)); // Si lo que se quiere guardar es un objeto, debe usarse el ObjectOutput
		
			salida.writeObject(contenido); // Método writeobject: guarda el array. 
			
			salida.close();
			System.out.println ("-> crearArchivo: Se editó el archivo "+nombreArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static <T> ArrayList<T> leerArchivoList (String nombreArchivo) {
		
		ArrayList<T> contenido = new ArrayList<T>();
		File archivo = new File (nombreArchivo);
		
		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo)); // Se llama a ObjectInput, es decir, funciones relacionadas con la entrada
			contenido = (ArrayList<T>) entrada.readObject(); // Si el método para registrar el array era "writeObject" para output, est es "readObject". Lo igualamos a "contenido" y el static devolverá el archivo cargado
			entrada.close();
			System.out.println ("-> leerArchivo: Se leyó el archivo "+nombreArchivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return contenido;
		
		
		
	}
	
	public static void eliminarArchivo (String nombreArchivo) {
		File archivo = new File (nombreArchivo);
		
		if (archivo.exists()) {
			archivo.delete(); 
			System.out.println ("-> eliminarArchivo: Se eliminó el archivo "+nombreArchivo);
		}
		else System.out.println ("-> eliminarArchivo: El archivo indicado en el parámetro no existe");
		
		
	}
	
		
	
	

}
