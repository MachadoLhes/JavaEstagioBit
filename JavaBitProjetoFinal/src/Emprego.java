public abstract class Emprego {
    protected String matricula;
    protected double salarioBase;

    public Emprego(String matricula, double salarioBase) {
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public abstract double calculaSalario();
}
