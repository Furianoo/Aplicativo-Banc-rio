import java.util.Scanner;

public class Banco {
    static double saldo = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Bem-vindo ao Banco Java");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void consultarSaldo() {
        System.out.println("Seu saldo atual é $" + saldo);
    }

    public static void depositar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a depositar: $");
        double valor = scanner.nextDouble();
        saldo += valor;
        System.out.println("$" + valor + " foi depositado em sua conta.");
        consultarSaldo();
    }

    public static void sacar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a sacar: $");
        double valor = scanner.nextDouble();
        if (valor > saldo) {
            System.out.println("Fundos insuficientes.");
        } else {
            saldo -= valor;
            System.out.println("$" + valor + " foi sacado de sua conta.");
        }
        consultarSaldo();
    }

    public static void sair() {
        System.out.println("Obrigado por utilizar nossos serviços bancários. Tenha um ótimo dia!");
    }
}
