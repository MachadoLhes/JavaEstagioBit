public abstract class ContaBancaria implements Imprimivel {
    private static int numero = 0;
    private String agencia;
    protected double saldo;
    private Data data_abertura;

    public ContaBancaria(String agencia, Data data_abertura) {
        this.numero = numero+1;
        this.agencia = agencia;
        this.data_abertura = data_abertura;
    }

    public void saca(double valor) {
        if(valor<=0) {
            //erro
        } else if(valor>this.saldo) {
            //erro
        } else {
            this.saldo -= valor;
        }
    }

    public void deposita(double valor) {
        if(valor<=0) {
            //erro
        } else {
            this.saldo += valor;
        }
    }

    public void transfere(ContaBancaria outra_conta, double valor) {
        saca(valor);
        outra_conta.deposita(valor);
        System.out.println("Transferência no valor de R$ "+valor+"\n");
    }

    @Override
    public void retornaDadosParaImpressao() {
        System.out.println("Número de conta: "+this.numero);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Saldo: R$ "+this.saldo);
        System.out.println("Data de aberutura: "+this.data_abertura.formata());
    }

}
