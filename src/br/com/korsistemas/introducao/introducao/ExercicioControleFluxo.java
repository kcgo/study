package br.com.korsistemas.introducao.introducao;

public class ExercicioControleFluxo {

    public static void main(String[] args) {
        /*
        crie uma variavel slario e imprima seu imposto
        imposto:
        salario < 1000 5%
        salario >=1000 && salario < 2000 10%
        salario >= 2000 && salario <4000 15%
        salario > 5000 20%

         */
        double salario =  5000;
        double totalImposto = 0;
        if (salario <1000){
            totalImposto = salario * 0.05;
        }else if(salario >= 1000 && salario < 2000){
            totalImposto=  salario * 0.1d;
        }else if(salario >= 2000 && salario <4000){
            totalImposto =  salario * 0.15;
        }else {
            totalImposto= salario * 0.2 ;

        }
        System.out.print( "O valor do imposto é : \n" + totalImposto );
    }

}
