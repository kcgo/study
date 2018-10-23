package br.com.korsistemas.introducao.heranca.classes;

public class Funcionario extends Pessoas {
    private double salario;

    public void print(){
        super.print();
        System.out.println("Salario: "+ this.salario);
        printReciboPagamento();
    }
    public void printReciboPagamento(){
        System.out.println("Eu " +super.nome+ "recebi o pagamento de "+this.salario);


    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
