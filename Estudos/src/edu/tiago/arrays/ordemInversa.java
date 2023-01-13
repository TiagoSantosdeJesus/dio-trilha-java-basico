package edu.tiago.arrays;

// Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.

public class ordemInversa {
    public static void main(String[] args) {
        int[] vetor = { 10, 55, 3, 14, 50, 9 };

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
