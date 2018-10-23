package br.com.korsistemas.introducao.heranca.test;

import br.com.korsistemas.introducao.heranca.classes.Endereco;
import br.com.korsistemas.introducao.heranca.classes.Funcionario;
import br.com.korsistemas.introducao.heranca.classes.Pessoas;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoas p = new Pessoas();
        Funcionario f = new Funcionario();

        p.setNome("katia");
        p.setCpf("095.475.866-88");
        Endereco end = new Endereco();
        end.setBairro("Bairro 1");
        end.setRua("Rua  25");
        p.setEndereco(end);
        p.print();
        System.out.println("-------------------------------");

        f.setNome("Rafaella ");
        f.setCpf("148.127.566-85");
        f.setSalario(15000);
        f.setEndereco(end);
        f.print();


    }
}
