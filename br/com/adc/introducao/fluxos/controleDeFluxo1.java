package br.com.adc.introducao.fluxos;

public class controleDeFluxo1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 juvenil
        // idade >= 18 adulto
        int idade = 20;
        float salario = 2000f;
        String categoria;

        if(idade < 15){
           categoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
