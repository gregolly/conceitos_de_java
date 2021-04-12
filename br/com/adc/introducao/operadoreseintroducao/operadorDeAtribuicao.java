package br.com.adc.introducao.operadoreseintroducao;

public class operadorDeAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        double salario = 1000;
        //salario += 1000;
        salario = salario + (salario * 0.1);

        System.out.println(salario);
    }
}
