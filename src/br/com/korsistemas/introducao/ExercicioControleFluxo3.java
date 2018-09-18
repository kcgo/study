package br.com.korsistemas.introducao;

public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 até 10000
        int valor = 100000;
        for(int i =0;i<=valor;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

