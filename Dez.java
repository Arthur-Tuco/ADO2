import java.util.Scanner;

public class Dez {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        float num = scanner.nextFloat();

        if (num > 10){
            System.out.println(num + " É MAIOR QUE 10");
        }
        else{
            System.out.println(num + " NÃO É MAIOR QUE 10");
        }
    }
}
