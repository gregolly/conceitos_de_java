package br.com.adc.javacore.introducaometodos.classes;

public class AlunoExercicio {
    public String nome;
    public int idade;
    public double[] notas;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (notas != null) {
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
        }
    }

    public void tirarMedia() {
        if (notas == null) {
            System.out.println("Esse aluno não possui notas!");
            return;
        }
        double media = 0;
        for (double nota : notas) {
            media += nota;
        }
        media = media / notas.length;

        if (media > 6) {
            System.out.println("\nA média é: " + media + " situação: aprovado!");
        } else {
            System.out.println("A média é: " + media + " situação: reprovado!");
        }
    }
}
