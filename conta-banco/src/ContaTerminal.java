import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TO-DO: conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //TO-DO: Exibir as mensagens para o nosso usuário
        //TO-DO: Obter via Scanner os valores digitados no terminal
        System.out.println("Qual é o seu primeiro nome? ");
        String nome = sc.nextLine();  // Usa nextLine() para capturar o primeiro nome

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();  // Usa nextLine() para capturar o sobrenome

        System.out.println("Quanto você deseja de limite inicial?");
        double limite = sc.nextDouble();

        //TO-DO: Exibir a mensagem conta criada com sucesso
        String agencia = "067-8";
        int numeroConta = 1021;
        String saldo = String.format("%.2f", limite);
        System.out.println("Olá " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco! A sua agência é " + agencia + ", sua conta é " + numeroConta + " e o seu limite inicial é de R$ " + saldo + ". Seja bem-vindo!");

        sc.close();
    }
}
