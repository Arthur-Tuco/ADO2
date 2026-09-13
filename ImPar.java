import java.util.Scanner;

public class ImPar {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O número " + num + " é par!");
        }
        else {
            System.out.println("O número " + num + " é ímpar");
        }
    }

}
