package br.com.adc.introducao.arrays;

public class arrays2 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        // char "" sera vazio
        // boolen == false
        // reference == null
        String[] nomes = new String[5];
        nomes[0] = "Gregolly França";
        nomes[1] = "João da Silva";
        nomes[2] = "Joaquim Barbosa";
        nomes[3] = "Luffy";
        nomes[4] = "Ace";
        for(int i=0; i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
