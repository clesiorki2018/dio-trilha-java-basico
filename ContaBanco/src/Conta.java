/**
 * Representa uma conta bancária com número, agência, nome do cliente e saldo.
 * <p>
 * Responsabilidade: Armazenar as informações da conta.
 * </p>
 * 
 * @autor Estudante Clesio Maxuel
 */
public class Conta {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    /**
     * Construtor para criar uma nova conta.
     * 
     * @param numeroConta O número da conta.
     * @param agencia A agência da conta.
     * @param nomeCliente O nome do cliente.
     * @param saldo O saldo inicial da conta.
     */
    public Conta(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta criada com sucesso!" +
               "\nNúmero da Conta: " + numeroConta +
               "\nAgência: " + agencia +
               "\nNome do Cliente: " + nomeCliente +
               "\nSaldo: R$ " + saldo;
    }
}
