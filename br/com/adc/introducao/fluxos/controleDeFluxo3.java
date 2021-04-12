package br.com.adc.introducao.fluxos;

public class controleDeFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                if(true){
                    System.out.println("True");
                }
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        String sexo = "FF";
        switch (sexo){
            case "F" :
                System.out.println("Feminino");
                break;
            case "M" :
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção invalid");
        }
    }
}
