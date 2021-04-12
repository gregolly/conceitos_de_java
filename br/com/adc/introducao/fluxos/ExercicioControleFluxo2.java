package br.com.adc.introducao.fluxos;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }
        do{
            System.out.println("Dentro do while");
        } while (count < 10);

        for(int i=0; i <= 10; i++){
            System.out.println("O valor de i é: "+i);
            if (i==5) {
                break;
            }
        }
    }
}
