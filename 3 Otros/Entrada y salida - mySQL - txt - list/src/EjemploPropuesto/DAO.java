package EjemploPropuesto;
import java.util.ArrayList;

	// INTERFAZ GENERAL. 

public interface DAO {

    public void addCoche(Coche c);		// Añadidmos un coche nuevo
    public void updateCoche(Coche _old, Coche _new); // actualizamos los datos de un coche con los de otro
    public boolean deleteCoche(Coche c); // Elimino un coche
    public Coche findCoche(String clave); // Recupero un coche a partir de su matrícula
    public ArrayList<Coche> getCoches(); // Recupero todos los coches almacenados
    
}
