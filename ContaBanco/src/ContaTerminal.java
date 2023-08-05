/**
* <h1>ContaTerminal</h1>
* Um programa para criar uma conta bancária.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  João Vitor Mine Nascimento
* @version 1.0
* @since   04/08/2023
*/

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    /**
   * Método utilizado para o usuário criar sua conta bancária.
   * O usuário deverá seguir o passo-a-passo conforme as instruções.
   * @param args parâmetros que deverão ser informados pelo usuário.
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroLeitura = scanner.nextLine();
        int numero = Integer.parseInt(numeroLeitura);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo!");
        String saldoLeitura = scanner.nextLine();
        double saldo = Double.parseDouble(saldoLeitura);

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta número " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
