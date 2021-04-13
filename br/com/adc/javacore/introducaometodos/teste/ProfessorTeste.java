package br.com.adc.javacore.introducaometodos.teste;

import br.com.adc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "1221232131231";
        professor.matricula = "12321321";
        professor.nome = "Joao da silva";
        professor.rg = "313213213";

        Professor professor2 = new Professor();
        professor2.cpf = "11111111";
        professor2.matricula = "222222222222";
        professor2.nome = "Joao da higor";
        professor2.rg = "33333333";

        professor.print();
        professor2.print();
    }
}
