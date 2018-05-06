import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> contas = new ArrayList<>();
    private static boolean jaExiste = false;
    private Relatorio relatorio = new Relatorio();

    public void addConta(ContaBancaria contaBancaria) {
        this.contas.add(contaBancaria);
    }
    public void removeConta(ContaBancaria contaBancaria) {
        this.contas.remove(contaBancaria);
    }

    public Banco() {
        try {
            if(jaExiste) {
                throw new BancoJaExisteException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        jaExiste=true;
    }

    public void imprimeContas() {
        for(ContaBancaria conta : contas) {
            relatorio.geraRelatorio(conta);
        }
    }
}
