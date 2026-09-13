//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    if (idade >= 18){
        System.out.println("Você é maior!");
    }
    else {
        System.out.println("Você é menor!");
    }
    }

