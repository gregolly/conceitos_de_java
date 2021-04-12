package br.com.adc.introducao.fluxos;

public class controleDeFluxo5 {
    public static void main(String[] args) {
        float valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
               break;
            }
            System.out.println("O número da parcela é " + parcela +"O valor de cada parcela é: "+valorParcela);
        }

    }
}
