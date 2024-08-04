/**
 * Serviço para operações relacionadas a contas bancárias.
 * <p>
 * Responsabilidade: Gerenciar a lógica de negócios para criação de contas.
 * </p>
 * 
 * @autor Estudante Clesio Maxuel
 */
public class ContaService {

    /**
     * Cria uma nova conta com os dados fornecidos.
     * 
     * @param numeroConta O número da conta.
     * @param agencia A agência da conta.
     * @param nomeCliente O nome do cliente.
     * @param saldo O saldo inicial da conta.
     * @return A conta criada.
     */
    public Conta criarConta(int numeroConta, String agencia, String nomeCliente, double saldo) {
        return new Conta(numeroConta, agencia, nomeCliente, saldo);
    }
}
