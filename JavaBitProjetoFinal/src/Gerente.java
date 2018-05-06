public class Gerente extends Emprego {
    @Override
    public double calculaSalario() {
        return this.salarioBase*2;
    }

    public Gerente(String matricula, double salarioBase) {
        super(matricula, salarioBase);
    }
}
