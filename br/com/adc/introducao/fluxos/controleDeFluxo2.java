package br.com.adc.introducao.fluxos;

public class controleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 27;
        String status;

        status = idade < 18 ? "Não adulto" : "adulto";
        System.out.println(status);
    }
}
