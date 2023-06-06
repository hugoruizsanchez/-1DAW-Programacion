import java.util.Scanner;

public class Encriptado {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		String palabra = "asies";
		
		System.out.print ("Inserte una palabra: "); palabra = entrada.next();
		
			palabra = palabra.replace('a', '9');
			palabra = palabra.replace('b', 'n');
			palabra = palabra.replace('c', 'O');
			palabra = palabra.replace('d', 'p');
			palabra = palabra.replace('e', 'Q');
			palabra = palabra.replace('f', '2');
			palabra = palabra.replace('g', '4');
			palabra = palabra.replace('h', '6');
			palabra = palabra.replace('i', 'R');
			palabra = palabra.replace('j', 's');
			palabra = palabra.replace('k', '7');
			palabra = palabra.replace('l', 't');
			palabra = palabra.replace('m', 'U');
			palabra = palabra.replace('n', 'v');
			palabra = palabra.replace('o', '1');
			palabra = palabra.replace('p', '3');
			palabra = palabra.replace('q', '5');
			palabra = palabra.replace('r', 'œ');
			palabra = palabra.replace('s', 'W');
			palabra = palabra.replace('t', 'x');
			palabra = palabra.replace('u', 'Y');
			palabra = palabra.replace('v', 'z');
			palabra = palabra.replace('w', '¿');
			palabra = palabra.replace('x', '?');
			palabra = palabra.replace('y', 'Ž');
			palabra = palabra.replace('z', '8');
			palabra = palabra.replace('1', 'Ğ');
			palabra = palabra.replace('2', 'Ī');
			palabra = palabra.replace('3', '_');
			palabra = palabra.replace('4', '~');
			palabra = palabra.replace('5', '^');
			palabra = palabra.replace('6', 'Æ');
			palabra = palabra.replace('7', '%');
			palabra = palabra.replace('8', '$');
			palabra = palabra.replace('9', '·');
			palabra = palabra.replace('0', '*');
			palabra = palabra.replace('A', 'H');
			palabra = palabra.replace('B', 'g');
			palabra = palabra.replace('C', 'F');
			palabra = palabra.replace('D', 'e');
			palabra = palabra.replace('E', 'D');
			palabra = palabra.replace('F', 'c');
			palabra = palabra.replace('G', 'B');
			palabra = palabra.replace('H', 'a');
			palabra = palabra.replace('I', '+');
			palabra = palabra.replace('J', '@');
			palabra = palabra.replace('K', '&');
			palabra = palabra.replace('L', 'ç');
			palabra = palabra.replace('M', 'i');
			palabra = palabra.replace('N', 'J');
			palabra = palabra.replace('O', 'K');
			palabra = palabra.replace('P', 'l');
			palabra = palabra.replace('Q', 'M');
			palabra = palabra.replace('R', 'Ç');
			palabra = palabra.replace('S', ']');
			palabra = palabra.replace('T', '[');
			palabra = palabra.replace('U', '}');
			palabra = palabra.replace('V', '{');
			palabra = palabra.replace('W', '´');
			palabra = palabra.replace('X', '-');
			palabra = palabra.replace('Y', '#');
			palabra = palabra.replace('Z', 'ª');
			palabra = palabra.replace('ñ', '/');
			palabra = palabra.replace('Ñ', '!');
			palabra = palabra.replace(',', '=');
			palabra = palabra.replace(';', ')');
			palabra = palabra.replace('.', '(');
		
		
		
		System.out.println (palabra);
		

		
		
		
		
	}

}
