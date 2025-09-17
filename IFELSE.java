package com.mycompany.ifelse;

import javax.swing.JOptionPane;

public class IFELSE {

    public static void main(String[] args) {
        
        // Declarando as variáveis
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        // Usando if-else para comparar qual número é maior
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior");
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "O segundo número é maior");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        }

        // Usando if-else para verificar se os números são iguais ou diferentes
        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
        }

        // Usando if-else para comparar se um número é menor ou igual ao outro
        if (numero1 <= numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro número é menor ou igual ao segundo");
        } else {
            JOptionPane.showMessageDialog(null, "O primeiro número é maior ou igual ao segundo");
        }
    }
}

