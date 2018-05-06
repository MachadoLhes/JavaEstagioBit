public class ContaCorrente extends ContaBancaria {
    private double taxa_operacao;

    @Override
    public void saca(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor não pode ser negativo");
            } else if (valor > this.saldo) {
                throw new SaldoInsuficienteException(valor);
            } else {
                this.saldo -= valor + taxa_operacao;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposita(double valor) {
        try {
            if(valor<0) {
                throw new IllegalArgumentException("O valor não pode ser negativo");
            } else {
                this.saldo += valor-this.taxa_operacao;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void retornaDadosParaImpressao() {
        super.retornaDadosParaImpressao();
        System.out.println("Taxa de operação: R$ "+this.taxa_operacao);
        System.out.println();
    }

    public ContaCorrente(String agencia, Data data_abertura, double taxa_operacao) {
        super(agencia, data_abertura);
        this.taxa_operacao = taxa_operacao;
    }
}
