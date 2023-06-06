package Ejercicio0ResultadosExcepciones;

public class PrimerEjemplo {

	private static int metodo() {
		int valor = 0;
		try {
			valor = valor + 1;
			valor = valor + Integer.parseInt("W");
			valor = valor + 1;
			System.out.println("Valor al final del try: " + valor);
		} catch (NumberFormatException e) {
			valor = valor + Integer.parseInt("W");
			System.out.println("Valor al final del catch: " + valor);
		} finally {
			valor = valor + 1;
			System.out.println("Valor después del finally: " + valor);
		}
		valor = valor + 1;
		System.out.println("Valor antes del return: " + valor);
		return valor;
	}

	public static void main(String[] args) {
		try {
			System.out.println(metodo());
		} catch (Exception e) {
			System.err.println("Excepción en metodo()");
			e.printStackTrace();
		}
	}
}
