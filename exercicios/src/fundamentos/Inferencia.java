package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		/*
		 * Sobre variáveis
		 * é ppssivel apenas determinar a variável sem determinar seu tipo, o interpretador do java se 
		 * encarrega de entender e atribuir o tipo a essa variável, porém uma vez que o tipo foi atrelado 
		 * a essa variável, ela apenas poderá receber valores do mesmo tipo posteriormente
		 */
		var nome_usuario = "Matheus";
		var idade = 23;
		var altura = 1.86;
		System.out.println(nome_usuario + " possui " + idade + " anos de idade e " + 
		altura + "m. de altura");
	}
}
