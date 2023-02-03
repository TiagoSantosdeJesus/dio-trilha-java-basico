package edu.tiago.exceptions;

import javax.swing.JOptionPane;

public class UncheckedExceptions {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseUnsignedInt(b));

                if (Integer.parseInt(a) % Integer.parseUnsignedInt(b) != 0) {
                    System.out.println("Resultado: " + resultado + " Resto da divisão: "
                            + Integer.parseInt(a) % Integer.parseUnsignedInt(b));
                } else
                    System.out.println("Resultado: " + resultado);
                continueLooping = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                JOptionPane.showInputDialog(null, "Entrada inválida, informe um número inteiro: ");
            } catch (ArithmeticException e) {
                JOptionPane.showConfirmDialog(null, "Não é possível realizar divisão por 0.");
            } finally {
                System.out.println("Fim");
            }

        } while (continueLooping);
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
