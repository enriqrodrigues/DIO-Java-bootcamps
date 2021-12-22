package br.com.dio.exceptions;

import javax.swing.*;

public class UncheckedException {
    //Divisão de 2 números inteiros
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!" + e.getMessage());
            //e.printStackTrace();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!" + e.getMessage());
        }finally {
            System.out.println("Chegou no final!");
        }
        System.out.println("O código continua...");
    }

    private static int dividir(int a, int b){
        return a / b;
    }
}
