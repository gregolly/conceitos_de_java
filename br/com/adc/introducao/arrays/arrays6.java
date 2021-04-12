package br.com.adc.introducao.arrays;

public class arrays6 {
    public static void main(String[] args) {
        //Formas de inicializar arrays
        int[] arrInt = {1,2,3};
        int[] arraInt2 = new int[3];
        int[] arrInt3 = new int[]{1,2,3};


        // int[][] dias = new int[3][];
        // dias[0] = new int[2];
        // dias[1] = new int[]{1,2,3};
        // dias[2] =   new int[4];

        int[][]  dias = {{1,2},{3,4,5},{6,7,8,9}};
        for (int[] arr : dias){
            for(int num : arr){
                System.out.println(num);
            }
        }
    }
}
