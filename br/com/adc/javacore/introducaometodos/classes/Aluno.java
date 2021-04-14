package br.com.adc.javacore.introducaometodos.classes;

public class Aluno {
    public String nome;
    public int idade;

    public long notas(long nota1, long nota2, long nota3, long nota4) {
        if (nota1 >= 0) {
            return (nota1+nota2+nota3+nota4) / 4;
        } else {
            return 0;
        }
        // System.out.println((nota1 + nota2 + nota3 + nota4) / 4);
    }
}
