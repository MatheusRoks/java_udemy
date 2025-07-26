package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3;
		final double PI = 3.14159;
		double area = raio * raio *PI;
		
		/*
		 * em Java há a diferenciação entre uma constante e uma variável.
		 * Ao definir uma variável o primeiro dado é: tipo -> nome -> atribuição;
		 * já ao definir uma constante, muda levemente: final tipo -> nome -> atribuição;
		 * o final garante que minha constante não seja modificada durante o decorrer do código.
		 * ademais, por convenção em java, constantes são escritas totalmente em maiusculo;
		 * alguns tipos já sabidos:
		 * int: valores inteiros;
		 * double: os float;
		 */
		
		System.out.println(area);
		raio = 10;
		System.out.println("Caso alteremos o valor do raio para 10 teremos");
		area = raio * raio *PI;
		System.out.println("Área= " + area);
	}
}
