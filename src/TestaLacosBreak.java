
public class TestaLacosBreak {
	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) // Esse if pode ser substituído validando coluna <= linha no 2º for
					break;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
