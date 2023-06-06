package gestionBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* CONTENIDO DE LA TABLA ACTORES: 

--
-- Carga datos tabla `actor`
--

INSERT INTO actor VALUES
    (101,'James','Stewart','M'),
    (102,'Deborah','Kerr','F'),
    (103,'Peter','OToole','M'),
    (104,'Robert','De Niro','M'),
    (105,'F. Murray','Abraham','M'),
    (106,'Harrison','Ford','M'),
    (107,'Nicole','Kidman','F'),
    (108,'Stephen','Baldwin','M'),
    (109,'Jack','Nicholson','M'),
    (110,'Mark','Wahlberg','M'),
    (111,'Woody','Allen','M'),
    (112,'Claire','Danes','F'),
    (113,'Tim','Robbins','M'),
    (114,'Kevin','Spacey','M'),
    (115,'Kate','Winslet','F'),
    (116,'Robin','Williams','M'),
    (117,'Jon','Voight','M'),
    (118,'Ewan','McGregor','M'),
    (119,'Christian','Bale','M'),
    (120,'Maggie','Gyllenhaal','F'),
    (121,'Dev','Patel','M'),
    (122,'Sigourney','Weaver','F'),
    (123,'David','Aston','M'),
    (124,'Ali','Astin','F');
    */

public class Principal {

	public static void main(String[] args) throws SQLException {
	
		ConexionMySQL conexion = new ConexionMySQL (); // Creamos un objeto de la clase ConexionMySQL, que tiene incorporados todos los datos. 
		
		Statement stmt = conexion.conectarMySQL().createStatement(); // Partimos de la función  "conectarMySQL" que devolverá un objeto Connection, que nos permitirá manipular la base de datos desde un objeto Statement (donde introduciremos los comandos) . 
			
		// EN BASE AL RESULTSET CARGADO DE LA SENTENCIA, PODEMOS PROYECTAR LOS DATOS.
		// El RESULTSET es necesario para la SELECT, porque guardará los datos de la sentencia y podremos acudir a ellos con rs
		ResultSet rs;
		
		rs = stmt.executeQuery("SELECT * FROM actor LIMIT 3"); 
		
		System.out.println ("* * * * TABLA DE ACTORES * * * * ");
	
		
		while (rs.next() == true) {	// Mientras exista un registro siguiente.... 
			
			System.out.println ("ID: "+rs.getString("act_id"));
			System.out.println ("Nombre: "+rs.getString("act_fname"));
			System.out.println ("Apellido: "+rs.getString("act_lname"));
			System.out.println ("- - - - - - - - - -");
		}
		
		System.out.println ();
			
		/* Al realizar un RESULTSET, inmediatamente se ejecuta el cambio y se guarda en forma de variable. 
    	executeQuery(ssql) : Devuelve un objeto ResultSet. (Sentencias SELECT)
    	executeUpdate(ssql): Devuele un int = número de filas afectadas ( adecuado para sentencias que no develven datos (DDL) o sentencias INSERT, DELETE y UPDATE).
    	Execute(ssql):Devuelve un boolean, se puede utilizar para cualquier tiempo de sentencia SQL * false : Si no devuelven resultados o sólo número de filas afectadas (int totreg = sent.getUpdateCount();) * true : Sentencias SELECT
		*/
		
		int actualizacion = stmt.executeUpdate("UPDATE actor SET act_fname ='Sanch' WHERE act_fname='James'" );
		
		System.out.println ("Registros afectados por el UPDATE: "+actualizacion);
		
		System.out.println ();
		System.out.println ();

		rs = stmt.executeQuery("SELECT * FROM actor LIMIT 3"); 
		System.out.println ("* * TABLA DE ACTORES * * ");
		
		while (rs.next() == true) {	// Mientras exista un registro siguiente.... 
			
			System.out.println ("ID: "+rs.getString("act_id"));
			System.out.println ("Nombre: "+rs.getString("act_fname"));
			System.out.println ("Apellido: "+rs.getString("act_lname"));
			System.out.println ("- - - - - - - - - -");
		}
		
		// LIBERAR LOS RECURSOS 
		
		rs.close();
		stmt.close();
		conexion.conectarMySQL().close();
	}

}
