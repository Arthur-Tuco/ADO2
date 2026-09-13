import java.util.Scanner;

public class Calc {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float num1 = scanner.nextFloat();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        float num2 = scanner.nextFloat();

        float resultado;

        if (operacao == '+'){
            resultado = num1 + num2;
            System.out.println("Resultado de " + num1 + " + " + num2 + " é: " + resultado);
        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado de " + num1 + " - " + num2 + " é: " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado de " + num1 + " * " + num2 + " é: " + resultado);
        } else if (operacao == '/') {
            if (num2 == 0){
                System.out.println("Não se pode fazer divisão por 0");
            }
            else {
                resultado = num1 / num2;
                System.out.println("Resultado de " + num1 + " / " + num2 + " é: " + resultado);
            }
        }
        else{
            System.out.println("Operação inválida.");
        }
    }
}
