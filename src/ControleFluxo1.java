public class ControleFluxo1 {
    public static void main(String[] args) {
        //regra de negocio:
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 juvenil
        //idade >=18 adulto
        int idade = 13;
        String categoria;

        if (idade < 15) {
            categoria = "infantil";
        } else if(idade >=15 && idade<18){
           categoria = "juvenil";
        }else{
            categoria = "adulto";
        }
        System.out.println(categoria);

    }
}
