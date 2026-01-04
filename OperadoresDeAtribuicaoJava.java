
public class OperadoresDeAtribuicaoJava {

    public static void main(String[] args) {

        System.out.println("=== 1. ATRIBUICAO SIMPLES ===");
        int x = 10;
        System.out.println("x = " + x);

        System.out.println("\n=== 2. += COM CAST IMPLICITO ===");
        x += 2.9; // perde o .9 sem avisar
        System.out.println("x += 2.9 -> " + x);

        System.out.println("\n=== 3. PRECEDENCIA COM *= ===");
        int y = 5;
        y *= 2 + 3; // primeiro soma, depois multiplica
        System.out.println("y *= 2 + 3 -> " + y);

        System.out.println("\n=== 4. MODULO COM NEGATIVO ===");
        int z = -10;
        z %= 4;
        System.out.println("z %= 4 -> " + z);

        System.out.println("\n=== 5. ATRIBUICAO ENCADEADA ===");
        int a, b, c;
        a = b = c = 10;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        System.out.println("\n=== 6. SHIFT LEFT E RIGHT ===");
        int s = 8;
        s >>= 1; // divide por 2
        System.out.println("s >>= 1 -> " + s);
        s <<= 2; // multiplica por 4
        System.out.println("s <<= 2 -> " + s);

        System.out.println("\n=== 7. BITWISE COM ATRIBUICAO ===");
        int bits = 6; // 110 em binario

        bits &= 3; // 110 & 011 = 010
        System.out.println("bits &= 3 -> " + bits);

        bits |= 8; // 010 | 1000 = 1010
        System.out.println("bits |= 8 -> " + bits);

        bits ^= 2; // 1010 ^ 0010 = 1000
        System.out.println("bits ^= 2 -> " + bits);

        System.out.println("\n=== 8. ACUMULADOR EM LOOP ===");
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            soma += i;
        }
        System.out.println("Soma de 1 a 5 = " + soma);

        System.out.println("\n=== 9. COMPARACAO VS ATRIBUICAO ===");
        int n = 5;
        if (n == 5) {
            System.out.println("n eh 5 (comparacao correta)");
        }

        // if (n = 5) { } // NAO COMPILA. Java te protege.

        System.out.println("\n=== FIM DO PROGRAMA ===");
    }
}
