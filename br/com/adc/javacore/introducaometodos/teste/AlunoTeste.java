package br.com.adc.javacore.introducaometodos.teste;

import br.com.adc.javacore.introducaometodos.classes.Aluno;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno media = new Aluno();
        media.nome = "Joao vitor";
        media.idade = 27;
        System.out.println("Nome do aluno: "+media.nome);
        System.out.println("Idade do aluno: "+media.idade);
        long mediaFinal = media.notas(5, 7, 8, 10);

        if (mediaFinal > 6){
            System.out.println("O aluno "+media.nome+" está aprovado!");
        } else {
            System.out.println("O aluno "+media.nome+" está reprovado!");
        }
    }
}
