import java.util.Scanner;

public class Salario {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário do funcionário: ");
        float salario = scanner.nextFloat();

        float salariofinal;

        if (salario <= 1500.00){
            System.out.println("Salários de até R$1500,00 recebem um aumento de 20%!");
            salariofinal = salario * 1.20f;
            System.out.println("O salário do funcionário ficou: " + salariofinal);
        } else if ((salario >= 1500.01) && (salario <=3000.00)) {
            System.out.println("Salários maiores que R$1500 e menores que R$3000.01 recebem um aumento de 15%!");
            salariofinal = salario * 1.15f;
            System.out.println("O salário do funcionário ficou: " + salariofinal);
        }else {
            System.out.println("Salários acima de R%3000.00 recebem um aumento de 10%!");
            salariofinal = salario * 1.10f;
            System.out.println("O salário do funcionário ficou: " + salariofinal);
        }
    }
}
