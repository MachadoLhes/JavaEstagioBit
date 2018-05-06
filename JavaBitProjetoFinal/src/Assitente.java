public class Assitente extends Emprego {
    @Override
    public double calculaSalario() {
        return this.salarioBase;
    }

    public Assitente(String matricula, double salarioBase) {
        super(matricula, salarioBase);
    }
}
