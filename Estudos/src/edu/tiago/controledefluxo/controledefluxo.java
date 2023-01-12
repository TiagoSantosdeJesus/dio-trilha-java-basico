package edu.tiago.controledefluxo;

// exemplo de uso da estrutura de if e switch

public class controledefluxo {

    public static void main(String[] args) {
        int mesAno = 12;

        if (mesAno == 1) {
            System.out.println("Mês de Janeiro");
        } else if (mesAno == 2) {
            System.out.println("Mês de Fevereiro");
        } else if (mesAno == 3) {
            System.out.println("Mês de Março");
        } else if (mesAno == 4) {
            System.out.println("Mês de Abril");
        } else if (mesAno == 5) {
            System.out.println("Mês de Maio");
        } else if (mesAno == 6) {
            System.out.println("Mês de Junho");
        } else if (mesAno == 7) {
            System.out.println("Mês de Julho");
        } else if (mesAno == 8) {
            System.out.println("Mês de Agosto");
        } else if (mesAno == 9) {
            System.out.println("Mês de Setembro");
        } else if (mesAno == 10) {
            System.out.println("Mês de Outubro");
        } else if (mesAno == 11) {
            System.out.println("Mês de Novembro");
        } else if (mesAno == 12) {
            System.out.println("Mês de Dezembro");
        } else {
            System.out.println("Mês inválido");
        }
        switch (mesAno) {
            case 1:
            case 7:
            case 12:
                System.out.println("Férias");
                break;
            default:
                break;
        }
    }
}
