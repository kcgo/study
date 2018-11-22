package br.com.korsistemas.introducao.sobrecargametodos.test;

import br.com.korsistemas.introducao.sobrecargametodos.classe.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Katia Goncalves", "095.475.866-88", 4500, "10.231.611");
        Funcionario funcionario1 = new Funcionario();
        funcionario.imprime();
        funcionario1.imprime();


    }
}

