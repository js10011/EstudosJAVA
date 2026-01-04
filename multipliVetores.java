public class multipliVetores {

    public static void main(String[] args) {
        // Matriz A (2x3)
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Matriz B (3x2)
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Resultado (2x2)
        int[][] resultado = new int[2][2];

        // Multiplicação de A x B
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Imprimir resultado
        System.out.println("Resultado da multiplicação de matrizes A x B:");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
