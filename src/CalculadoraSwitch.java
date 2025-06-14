import java.util.Scanner;


public class CalculadoraSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opção = 0;

        while (opção != 5) {
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");

        System.out.print("Escolha uma Opção: ");
        opção = scanner.nextInt();


        if (opção >= 1 && opção <=4){

            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();



            switch (opção){
                case 1:
                    System.out.println("Resultado: " +(num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero não é permitida");
                    }
                    break;
            }
        } else if (opção == 5){
            System.out.println("Encerrando a calculadora");
        } else {
            System.out.println("Opção inválida! Tente novamente");
        }
        System.out.println();
        }
        scanner.close();

    }
}