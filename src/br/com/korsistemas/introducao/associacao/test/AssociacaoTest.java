package br.com.korsistemas.introducao.associacao.test;

import br.com.korsistemas.introducao.associacao.classe.Aluno;
import br.com.korsistemas.introducao.associacao.classe.Local;
import br.com.korsistemas.introducao.associacao.classe.Professor;
import br.com.korsistemas.introducao.associacao.classe.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("katia", 27);
        Aluno aluno2 = new Aluno("\nRafaella", 20);

        Seminario sem = new Seminario("Como ser um programamdor");
        Professor prof = new Professor("Yoda", "Usar a força " +
                "para programar");
        Local local = new Local("Ruas das araras", " 2");

        sem.setProfessor(prof);
        sem.setLocal(local);

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        sem.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario[] semiArray = new Seminario[1];
        semiArray[0] = sem;
        prof.setSeminario(semiArray);

        prof.print();
//        aluno.print();
        sem.print();

    }
}
