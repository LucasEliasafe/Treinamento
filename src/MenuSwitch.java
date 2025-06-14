import java.util.Scanner;

public class MenuSwitch {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao  = 0;

    while (opcao !=3) {
        System.out.println("==Menu==");
        System.out.println("1 - Dizer olá");
        System.out.println("2 - Mostrar a data de hoje");
        System.out.println("3 - Sair");

        System.out.print(" Escolha uma opção (1,2 ou 3): ");
        opcao =scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Seja bem-vindo");
                break;

            case 2:
                System.out.println("Hoje é um ótimo dia para estudar java!");
                break;

            case 3:
                System.out.println("Saindo do programa... até logo!");
                break;
            default:
                System.out.println("Opção inválida. Tente 1, 2 ou 3.");
                break;

        }
        System.out.println();
        }

        scanner.close();


    }

}
