public class Vendedor extends Emprego {
    private double comissao;

    @Override
    public double calculaSalario() {
        return this.salarioBase+this.comissao;
    }

    public Vendedor(String matricula, double salarioBase, double comissao) {
        super(matricula, salarioBase);
        this.comissao = comissao;
    }

}
