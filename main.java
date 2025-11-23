import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " est pair.");
        } else {
            System.out.println(n + " est impair.");
        }

        scanner.close();
    }
}
