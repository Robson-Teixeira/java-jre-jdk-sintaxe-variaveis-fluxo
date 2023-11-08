
public class TestaMultiplo3 {
	public static void main(String[] args) {
		for (int numero = 3; numero < 100; numero++) {
			if (numero % 3 == 0) // Esse if pode ser substituído incrementando numero += 3
				System.out.println(numero);
		}
	}
}
