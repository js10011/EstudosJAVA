import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe os 11 dígitos do seu CPF : ");
        String titular = scanner.nextLine();

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        ContaBancaria conta = new ContaBancaria(titular, numeroConta);

        int opcao;
        do {
            System.out.println("\n--- Menu Bancário ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o banco!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
