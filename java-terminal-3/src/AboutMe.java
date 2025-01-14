import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        // Configura o scanner para o Locale brasileiro
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Qual é o seu nome: ");
        String nome = scanner.nextLine();  // Usa nextLine() para capturar o nome completo

        System.out.println("Qual é o seu sobrenome: ");
        String sobrenome = scanner.nextLine();  // Usa nextLine() para capturar o sobrenome completo

        System.out.println("Qual é a sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente após nextInt()

        System.out.println("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha pendente após nextDouble()

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " m.");

        scanner.close();  // Fecha o scanner ao final
    }
}

// arquivo original do Gleyson Sampaio, ex-DIO, e corrigido pelo CHATGPT
