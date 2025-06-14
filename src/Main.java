import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Olá mundo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Muito prazer, "+ nome + "! :)");

        scanner.close();
    }
}