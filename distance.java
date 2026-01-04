
/*
 * Escreva um programa  que leve dois argumentos de linha de comando inteiros x e y
 *  e prints a distância euclidiana do ponto (x, y) 
 *  ao origem (0, 0).
 * 
 */

public class distance {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;

        double distancia = Math.sqrt(x * x + y * y);
        System.out.println("Distância euclidiana até (0,0): " + distancia);
    }
}
