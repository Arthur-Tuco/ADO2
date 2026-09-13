import java.util.Scanner;

public class Imposto {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o produto comprado?: ");
        String produto = scanner.nextLine();

        System.out.println("Qual o preço do produto?: ");
        float preco = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("O produto " + produto + " é nacional? (Sim/Não): ");
        String origem = scanner.nextLine();
        float precofinal = preco;

        if (origem.equalsIgnoreCase("Sim")) {
            precofinal = preco * 1.10f;
            System.out.println("Produto nacional. Taxa de 10% aplicada!");
        } else if (origem.equalsIgnoreCase("Não") || origem.equalsIgnoreCase("Nao")) {
            precofinal = (preco * 1.25f) + 50.0f;
            System.out.println("Produto importado. Taxa de 25% + R$ 50 aplicada!");
        } else {
            System.out.println("Resposta inválida. Preço mantido sem taxas.");
        }

        System.out.printf("O preço final de %s é: R$ %.2f%n", produto, precofinal);
    }
}
