public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
       
        if(nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
            System.out.println("Encaminhado para Recuperação");
 
        else
            System.out.println("Reprovado");

        
        /* Refatorando em Condição Ternária (método if-else)

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
        
         */ 



        /* Refatorando em Condição Ternária (método if-elseif-else)

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

		System.out.println(resultado);

         */
    }
}
