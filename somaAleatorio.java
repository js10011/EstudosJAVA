
/*
 * Escreva um  de programa que imprima a
 *  soma de dois inteiros aleatórios entre 1 e 6
 *  (como você pode obter ao rolar dados).
 */

public class somaAleatorio{
	public static void main(String[] args) {
		int num = 7;
		int indice =(int)(Math.random() *num);
		
		int num2 = 7;
		int indice2 =(int)(Math.random() *num2);
		System.out.println("Nome sorteado :" + indice2 );
		System.out.println("Nome sorteado :" + indice );
		System.out.println(indice + indice2);
	}
}