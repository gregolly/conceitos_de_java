package br.com.adc.javacore.introducaometodos.teste;

import br.com.adc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.substraiDoisNumeros();
        calc.multiplicaDoisNumeros(10, 20);
        calc.imprimiDoisNumerosDividos(20,5);
        double result = calc.divideDoisNumeros(5.5, 10);
        System.out.println(result);
        // System.out.println(calc.divideDoisNumeros(5.5, 10));

        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5,6);
    }
}
