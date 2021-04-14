package br.com.adc.javacore.introducaometodos.teste;

import br.com.adc.javacore.introducaometodos.classes.AlunoExercicio;

public class AlunoExercicioTeste {
    public static void main(String[] args) {
        AlunoExercicio aluno = new AlunoExercicio();
        aluno.nome = "William souza";
        aluno.idade = 27;
        aluno.notas = new double[]{8,9,5};
        aluno.print();
        aluno.tirarMedia();
    }
}
