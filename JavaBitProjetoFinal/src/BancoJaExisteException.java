public class BancoJaExisteException extends Exception {
    public BancoJaExisteException() {
        super("Já existe um banco");
    }
}
