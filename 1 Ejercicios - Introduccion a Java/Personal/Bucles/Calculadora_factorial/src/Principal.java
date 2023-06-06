import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
int numero;
long factorial=1;

Scanner entrada = new Scanner (System.in);
numero = entrada.nextInt();
for (int repetidor =1; repetidor<=numero; repetidor++) { // Va sumando al repetidor y multiplicándolo hasta que llega al número deseado
	/*
	 * Si el número es 8
	 * repetidor (1) +1 = 2 ----> factorial = factorial (1) *2 = 2
	 * repetidor (2) +1 = 3 ----> factorial = factorial (2) * 3 = 6
	 * repetidor (3) +1 = 4 ----> factorial = factorial (6)*4 = 24
	 * ... seguirá haciendo este cálculo hasta que el repetidor sea mayor o igual que número ( o mientras sea menor o igual). 
	 */
	factorial = factorial*repetidor;
	
}

System.out.println (factorial);


}}