package ejercicios_unidad_1;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int num_1 = 0;
		int num_2 = 1;
		int temp;
		
		Scanner entrada;
		entrada = new Scanner(System.in);

		System.out.println("\n-- Serie de Fibonacci --\n");
		System.out.println("Ingresa el limite: ");
		int limite = entrada.nextInt();
		
		
		System.out.println();
		System.out.print(num_1);
		System.out.print(", " + num_2);
		
		while ((num_1 + num_2) <= limite) {
			temp = num_1;
			num_1 = num_2;
			num_2 = num_1 + temp;
			System.out.print(", " + num_2);
		}
		
		System.out.print(".");

		entrada.close();
	}

}
