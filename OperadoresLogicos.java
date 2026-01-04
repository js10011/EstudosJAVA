public class OperadoresLogicos {

    public static void main(String[] args) {

        int idade = 17;
        boolean estudante = true;

        if (idade >= 18 || estudante) {
            System.out.println("Meia entrada liberada");
        }

        boolean chuva = false;

        if (!chuva) {
            System.out.println("Pode sair sem guarda-chuva");
        }

        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);
        System.out.println(!a);
    }
}
