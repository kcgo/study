package br.com.korsistemas.introducao.associacao.test;

import br.com.korsistemas.introducao.associacao.classe.Aluno;
import br.com.korsistemas.introducao.associacao.classe.Local;
import br.com.korsistemas.introducao.associacao.classe.Professor;
import br.com.korsistemas.introducao.associacao.classe.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("katia", 27);
        Aluno aluno2 = new Aluno("Rafaella", 20);

        Seminario seminario = new Seminario("Como ser um progrmamdor");
        Professor professor = new Professor("Yoda", "Usar a força~para programar");
        Local local = new Local("Ruas das araras","2");

        seminario.setProfessor(professor);
        seminario.setLocal(local);

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        seminario.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semiArray = new Seminario[1];
        semiArray[0] = seminario;
        professor.setSeminario(semiArray);


        aluno.print();

    }
}
