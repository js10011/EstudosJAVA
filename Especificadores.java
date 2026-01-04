public class Especificadores {
    public static void main(String[] args) {

        int idade = 20;
        double nota = 8.756;
        String nome = "Lain";
        char letra = 'A';
        boolean ativo = true;
        int numero = 42;

        System.out.printf("=== PRINTF SHOWCASE ===%n%n");

        // Inteiro
        System.out.printf("Inteiro (%%d): %d%n", idade);

        // Decimal
        System.out.printf("Decimal (%%f): %f%n", nota);
        System.out.printf("Decimal com 2 casas (%%.2f): %.2f%n", nota);

        // String
        System.out.printf("String (%%s): %s%n", nome);

        // Char
        System.out.printf("Char (%%c): %c%n", letra);

        // Boolean
        System.out.printf("Boolean (%%b): %b%n", ativo);

        // Objeto (usa toString por baixo dos panos)
        System.out.printf("Objeto (%%s): %s%n", nome);

        // Octal (só pra constar)
        System.out.printf("Octal (%%o): %o%n", numero);

        // Quebra de linha
        System.out.printf("Linha 1%nLinha 2%n");

        System.out.printf("%n=== FORMATAÇÃO AVANÇADA ===%n%n");

        // Largura mínima (alinhamento)
        System.out.printf("Direita (%%10s): '%10s'%n", nome);
        System.out.printf("Esquerda (%%-10s): '%-10s'%n", nome);

        // Zero à esquerda
        System.out.printf("Zero à esquerda (%%05d): %05d%n", numero);

        
        System.out.printf("Resumo -> Nome: %s | Idade: %d | Nota: %.1f | Ativo: %b%n",
                nome, idade, nota, ativo);
    }
}  //print(int i)
