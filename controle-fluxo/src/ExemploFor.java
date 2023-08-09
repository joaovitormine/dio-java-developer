public class ExemploFor {
    public static void main(String[] args) {
        /* Contando Carneirinhos
        for (int carneirinhos = 0; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }
    
        System.out.println("Joãozinho dormiu! zZzZzZz...");
         */


        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        /* For 'padrão'
	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
	    }
         */

        // for / each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}