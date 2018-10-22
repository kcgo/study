package br.com.korsistemas.introducao.associacao.classe;

public class Seminario {
    private String titulo;
    private Aluno [] alunos;
    private Professor professor;
    private Local local;



    public Seminario() {
    }
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("Titulo: "+this.titulo);

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }



    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
