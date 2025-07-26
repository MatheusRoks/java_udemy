package fundamentos;

public class ConversaoDeTemeperatura {
	public static void main(String[] args) {
		double temperatura_f = 252;
		final double ELEMENTO = 5/9.0;
		final int FORMULA = 32;
		double resultado = (temperatura_f - FORMULA )* ELEMENTO;
		System.out.println("O resultado da conversão de " + temperatura_f + "°f em celcius é:" + resultado + 
		"°c");
	}
}
