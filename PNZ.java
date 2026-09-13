import java.util.Scanner;

public class PNZ {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        float num = scanner.nextFloat();

        if (num > 0) {
            System.out.println("O número " + num + " é positivo");

        } else if (num < 0) {
            System.out.println("O número " + num + " é negativo");
        } else {
            System.out.println("O número " + num + " é zero");
        }
    }
}