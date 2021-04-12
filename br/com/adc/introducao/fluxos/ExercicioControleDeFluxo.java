package br.com.adc.introducao.fluxos;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        double salario = 3000;
        double totalImposto = 0;

        if (salario < 1000) {
            totalImposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            totalImposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            totalImposto = salario * 0.15;
        } else {
            totalImposto = salario * 0.2;
        }
        System.out.println(totalImposto);
    }
}
