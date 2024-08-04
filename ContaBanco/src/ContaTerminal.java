import java.util.Scanner;

/**
 * Classe principal para interação com o usuário via terminal.
 * <p>
 * Responsabilidade: Solicitar dados ao usuário e exibir informações sobre a conta criada.
 * </p>
 * 
 * @autor Estudante Clesio Maxuel
 */
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaService contaService = new ContaService();

        int numeroConta = solicitarNumeroConta(scanner);
        String agencia = solicitarAgencia(scanner);
        String nomeCliente = solicitarNomeCliente(scanner);
        double saldo = solicitarSaldoInicial(scanner);

        Conta conta = contaService.criarConta(numeroConta, agencia, nomeCliente, saldo);

        System.out.println(conta);
        scanner.close();
    }

    /**
     * Solicita o número da conta ao usuário.
     * 
     * @param scanner Scanner para leitura dos dados do usuário.
     * @return O número da conta.
     */
    private static int solicitarNumeroConta(Scanner scanner) {
        System.out.println("Por favor, digite o número da Conta:");
        return scanner.nextInt();
    }

    /**
     * Solicita o número da agência ao usuário.
     * 
     * @param scanner Scanner para leitura dos dados do usuário.
     * @return O número da agência.
     */
    private static String solicitarAgencia(Scanner scanner) {
        scanner.nextLine(); // Consumir nova linha
        System.out.println("Por favor, digite o número da Agência:");
        return scanner.nextLine();
    }

    /**
     * Solicita o nome do cliente ao usuário.
     * 
     * @param scanner Scanner para leitura dos dados do usuário.
     * @return O nome do cliente.
     */
    private static String solicitarNomeCliente(Scanner scanner) {
        System.out.println("Por favor, digite o nome do Cliente:");
        return scanner.nextLine();
    }

    /**
     * Solicita o saldo inicial ao usuário.
     * 
     * @param scanner Scanner para leitura dos dados do usuário.
     * @return O saldo inicial.
     */
    private static double solicitarSaldoInicial(Scanner scanner) {
        System.out.println("Por favor, digite o saldo inicial:");
        return scanner.nextDouble();
    }
}
