
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valorInt = (int)salario;
		System.out.println("Cast double para int " + valorInt);
		
        double valorDouble1 = 0.2;
        double valorDouble2 = 0.1;
        double total = valorDouble1 + valorDouble2;
        System.out.println("Soma double " + total);
		
        float valorfloat = 3.14f; // Especificar com f/F ao final
        System.out.println("Float " + valorfloat);
        
        long valorLong = 32432423523l; // Especificar com l/L ao final
        System.out.println("Long " + valorLong);
        
        short valorShort = 2131;
        System.out.println("Short " + valorShort);
        
        byte valorByte = 127;
        System.out.println("Byte " + valorByte);
	}
}
