import java.util.Scanner;

public class CalculadoraSwitch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear una calculadora que pueda sumar, restar, multiplicar 
		 * y divididr dos numeros.
		 * La calculadora debe pedir los dos n�meros y posteriormente,
		 * preguntar qu� operaci�n se quiere realizar, el men� es el siguiente:
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicaci�n
		 * 4. Divisi�n
		 * 
		 * Al final debe mostrar la operaci�n
		 * Nota: Se debe usar el switch
		 */
		Scanner oper = new Scanner (System.in);
		System.out.println("Introduce el primer valor");
		int numUno = oper.nextInt();
		System.out.println("Introduce el segundo valor");
		int numDos = oper.nextInt();
		System.out.println("Operaci�n a realizar");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicaci�n");
		System.out.println("4. Divisi�n");
		int operacion = oper.nextInt();
		
		switch (operacion) {
		case 1:
			System.out.println("Resultado de la suma: " + (numUno + numDos));
			break;
		case 2:
			System.out.println("Resultado de la resta: " + (numUno - numDos));
			break;
		case 3:
			System.out.println("Resultado de la multiplicaci�n: " + (numUno * numDos));
			break;
		case 4:
			System.out.println("Resultado de la divisi�n: " + (numUno / numDos));
			break;
		default:
			System.out.println("Operaci�n inv�lida");
			break;
			}

	}

}
