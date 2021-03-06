package br.com.adc.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void substraiDoisNumeros(){
        System.out.println(5-2);
    }

    public void multiplicaDoisNumeros(int numb1, int numb2){
        System.out.println(numb1 * numb2);
    }

    public double divideDoisNumeros(double numb1, double numb2){
        if (numb2 != 0) {
            return numb1/numb2;
        } else {
            return 0;
        }
    }

    public void imprimiDoisNumerosDividos(double num1, double num2){
        if(num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não é possível dividir por 0");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do altera dois números");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
