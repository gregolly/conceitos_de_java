package br.com.adc.javacore.introducaoclasses.teste;

import br.com.adc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Joana da silva";
        professor.matricula = "208";
        professor.rg = "94321332131";
        professor.cpf = "342134321321";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);


        Professor professor1 = new Professor();
        professor1.nome = "Joaquim souza";
        professor1.matricula = "1111";
        professor1.rg = "2123131321";
        professor1.cpf = "4908384929";


        System.out.println(professor1.nome);
        System.out.println(professor1.matricula);
        System.out.println(professor1.rg);
        System.out.println(professor1.cpf);
    }
}
