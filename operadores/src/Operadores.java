public class Operadores {
    public static void main(String[] args) throws Exception {
        //aritmeticos
        // int soma = (10 * 7) + (20/4);

        // System.out.println(soma);

        // String nomeCompleto = "LINGUAGEM " + "JAVA";

        // System.out.println(nomeCompleto);

        // String concatenacao ="?"; 

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);
        
        // System.out.println(concatenacao);

        // int numero = 5;

        // System.out.println(numero);

        // numero = - numero;

        // System.out.println(numero);

        // numero = numero * -1;
        // //numero = - numero;

        // System.out.println(numero);


        //unarios
        // int numero = 5;

        // //x repeticao

        // numero = numero +1;

        // //System.out.println( numero++ ); //realizou a operação somente depois de imprimir
        // System.out.println( ++numero ); //ja imprime atualizado

        // System.out.println(numero);



        //
        // boolean variavel = true;

        // System.out.println(!variavel); //imprime ao contrario, mas na memoria continua true

        // System.out.println(variavel);

        // variavel = !variavel;

        // System.out.println(variavel);


        //ternario
        // classe Operadores.java
        // int a, b;

        // a = 5;
        // b = 6;

        // /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // if(a==b)
        // resultado = "verdadeiro";
        // else
        // resultado = "falso";
        // */

        // //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        // String resultado = (a==b) ? "verdadeiro" : "falso";

        // System.out.println(resultado);


        //relacionais
        // String nome1 = "GLEYSON";
        // String nome2 = "GLEYSON";
        // //String nome2 = new String("GLEYSON");

        // System.out.println(nome1 == nome2);
        // //System.out.println(nome1.equals(nome2));


        // int numero1 = 1;
        // int numero2 = 2;

        // boolean simNao = numero1 == numero2;

        // if(numero1 < numero2) {
        //     System.out.println("A nossa condição é verdadeira");
        // }

        // System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // simNao = numero1 != numero2;

        // System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        // simNao = numero1 > numero2;

        // System.out.println("numeroUm é maior que numeroDois? " + simNao);


        //lógicos
        boolean condicao1 = true;

        boolean condicao2 = false;

        //if(condicao1 && condicao2) {
        if(condicao1 && ( 7 > 4 )) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }

        System.out.println("fim");
    }
}
