import java.util.Scanner;

public class media {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quais foram as notas do aluno?: ");
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2) / 2;

        if (media >= 7){
            System.out.println("Aluno aprovado. Média: " + media);
    } else if ((media <7) && (media >= 5)) {
            System.out.println("Aluno de recuperação. Média: " + media);
        }else{
            System.out.println("Aluno reprovado. Média: " + media);
        }
        }
    }
