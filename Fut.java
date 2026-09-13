import java.util.Scanner;

public class Fut {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quais são os times da partida? ");
        String time1 = scanner.nextLine();
        String time2 = scanner.nextLine();

        System.out.println("Quanto o " + time1 + " pontuou? ");
        int gol1 = scanner.nextInt();
        System.out.println("Quanto o " + time2 + " pontuou? ");
        int gol2 = scanner.nextInt();

        if (gol1 > gol2){
            System.out.println("O time vencedor foi: " + time1);
        } else if (gol2 > gol1) {
            System.out.println("O time vencedor foi: " + time2);
        }
        else System.out.printf("A partida acabou empatada.");
    }
}
