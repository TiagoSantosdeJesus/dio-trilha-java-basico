package edu.tiago.padroesdeprojetos.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Jaboatão";
    }

    public String recuperarEstado(String cep) {
        return "PE";
    }
}
