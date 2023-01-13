package edu.tiago.loops;

import java.util.Scanner;

/*Faça um programa que leia 5 números
 * informe o maior número
 * e a média desses números.
 */
public class maiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maiorNumero = 0;
        int count = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maiorNumero)
                maiorNumero = numero;
            count++;
        } while (count < 5);
        System.out.println("O maior número informado: " + maiorNumero);
        System.out.println("Média dos valores: " + (soma / 5));
    }
}
