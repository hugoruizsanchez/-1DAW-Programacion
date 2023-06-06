package gestionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Es necesario importar con BUILD PATH la librería de mysql-connector. 
 */

public class ConexionMySQL {
	
	// ATRIBUTOS: CONFIGURACIÓN DE LA CONEXIÓN. 
	
	// Deprecado ->  public String driver = "com.mysql.jdbc.Driver"; // Referencia a la librería mysql 
	public String database = "bd_movies"; // Nombre de la base de datos 
	public String hostname = "127.0.0.1"; // Localización de la base de datos (host)
	public String port = "3306"; // Puerto, asociado normalmente con el 3306
	public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false"; 
    public String username = "Tarde2"; // Nombre de usuario
    public String password = "12345678";  // Contraseña
    
    // CONSTRUCTOR
    
    public ConexionMySQL ()  {
	
    }
    
    // MÉTODOS
    
    // Vincula los datos de los atributos con una conexión SQL a partir de la clase Conection. 
    
    public Connection conectarMySQL () { // A partir de este método Connection podremos realizar todas las gestiones de la base de datos. 
    	
    	Connection conn = null;
    	
    	try {
			// Deprecado -> Class.forName(driver); //  La clase se asocia al driver. Carga en memoria mientras el programa se está ejecutando
			conn = DriverManager.getConnection(url, username, password); // Se asigna la URL, el USUARIO y la CONTRASEÑA a la conexión. 
		} 
    	catch (SQLException e) {
			e.printStackTrace();
		}
    	return conn;
    }
    
    
}
