
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		boolean acompanhado; // Sem valor default

		if (quantidadePessoas >= 2) {
			acompanhado = true; // Acessível por ser declarada no escopo principal
		} 
		else {
			acompanhado = false; // Acessível por ser declarada no escopo principal
		}		

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("Infelizmente você não pode entrar");				
		}
	}
}
