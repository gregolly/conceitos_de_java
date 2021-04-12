package br.com.adc.javacore.introducaoclasses.teste;

import br.com.adc.javacore.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.placa = "AJZ839";
        carro.velocidadeMaxima = 200;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
