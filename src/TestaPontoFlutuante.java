
public class TestaPontoFlutuante {
	public static void main(String[] args) {		
		double idade = 37;	
		System.out.println("A idade é " + idade);
		
		int divisaoInteiro = 5 / 2;
		System.out.println("Divisão inteiro com inteiro para inteiro " + divisaoInteiro);
		
		double divisaoDoubleInteiro = 5.0 / 2; 
		System.out.println("Divisão double com inteiro para double " + divisaoDoubleInteiro);
		// Pelo menos um dos valores precisa ser double para obtenção do resultado correto 
		// No exemplo, caso os valores fossem 5 e 2, o resultado seria 2.0

		double salario = 1250.70;	
		System.out.println("Meu salário é " + salario);
		
		salario = 1230.35 + 20.35;
		System.out.println("Soma - Meu salário é " + String.format("%.2f", salario));
		
		salario = 1350.80 - 100.10;
		System.out.println("Subtração - Meu salário é " + salario);
		
		salario = 625.35 * 2;
		System.out.println("Multiplicação - Meu salário é " + salario);
		
		salario = 2501.4 / 2;
		System.out.println("Divisão - Meu salário é " + salario);
	}
}
