public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(double valor) {
        super("Não há saldo o suficiente para esta operação. Você tentou sacar R$ "+valor+".");
    }
}
