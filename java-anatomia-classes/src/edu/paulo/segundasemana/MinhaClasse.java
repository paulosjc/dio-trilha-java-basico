package edu.paulo.segundasemana;

public class MinhaClasse {
    public static void main(String[] args){
        // System.out.println("Olá turma! Sejam bem-vindos...");
        // final String br = "Brasil";
        // System.out.println(br);

        // nome de variáveis só podem conter _, $, letras e os números de 0 a 9.
        // não podem conter espaços e nem palavras reservadas.
        // não podem começar com números.
        // podem começar com _, $ e, preferenciamente, com uma letra minúscula.
        // o padrão recomendado é o camelCase: myClass, firstFile, meuCodigo, minhaCalculadora etc.

        // declaracao de variáveis
        // estrutura:
        // Tipo NomeDefinido = Atribuição (Opcional)
        /*String meuNome = "Paulo Renato";
        int idade = 45;
        double altura = 1.77;
        String corPele;
        boolean casado = false;
        int anoNascimento = 1979;*/

        //construção de métodos
        //estrutura:
        //Tipo de retorno NomeNoInfinitivo com parâmetro(s) ou sem parâmetro(s)
         
        /*int somar (int num1, int num2);
        String formatarCEP (long CEP);*/

        String primeiroNome = "Paulo Renato";
        String sobrenome = "Rodrigues";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String sobrenome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(sobrenome);
    }
}
