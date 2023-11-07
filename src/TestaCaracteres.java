
public class TestaCaracteres {
	public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);

        char valor = 65; //Referência para a tabela ASCII
        System.out.println("Char 65 " + valor);

        valor = (char) (valor + 1);
        System.out.println("Char 66 " + valor);
        
        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);
        
        palavra = palavra + 2020;
        System.out.println(palavra);
	}
}
