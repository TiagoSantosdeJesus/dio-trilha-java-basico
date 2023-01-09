package edu.tiago.anatomiadasclasses;

public class App {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Tiago";
        String ultimoNome = "Santos";
        String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String ultimoNome) {
        return primeiroNome.concat(" ").concat(ultimoNome);
    }
}
