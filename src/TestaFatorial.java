
public class TestaFatorial {
	public static void main(String[] args) {
		/* 
		 * O fatorial de 0 é 1.
		 * O fatorial de 1 é (0!) * 1 = 1.
		 * O fatorial de 2 é (1!) * 2 = 2
		 * O fatorial de 3 é (2!) * 3 = 6
		 * O fatorial de 4 é (3!) * 4 = 24
		 * O fatorial de um número n é n * n-1 * n-2 ... até n = 1.
		 * 
		 * Ou seja:
		 * 
		 * O fatorial de 4! = 1 x 2 x 3 x 4 = 24
		 * O fatorial de 6! = 1 x 2 x 3 x 4 x 5 x 6 = 720		  
		 */

		int fatorial = 1;

		System.out.println("O fatorial de 0 é 1");

		for (int numero = 1; numero <= 10; numero++) {
			fatorial *= numero;

			System.out.println("O fatorial de " + numero + " é (" + (numero - 1) + "!) * " + numero + " = " + fatorial);
		}
	}
}
