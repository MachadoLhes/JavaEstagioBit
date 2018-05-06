public class ContaPoupanca extends ContaBancaria {
    private double limite;

    @Override
    public void saca(double valor) {
        try {
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor não pode ser negativo");
            } else if (valor > this.saldo+this.limite) {
                throw new SaldoInsuficienteException(valor);
            } else {
                this.saldo -= valor;
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
                this.saldo += valor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void retornaDadosParaImpressao() {
        super.retornaDadosParaImpressao();
        System.out.println("Limite: R$ "+this.limite);
        System.out.println("Rendimento mensal: R$ "+this.calculaRendimento());
        System.out.println();
    }

    public double calculaRendimento() {
        return this.saldo*0.1;
    }

    public ContaPoupanca(String agencia, Data data_abertura, double limite) {
        super(agencia, data_abertura);
        this.limite = limite;
    }
}
