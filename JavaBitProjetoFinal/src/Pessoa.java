public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;
    private Data data_nascimento;
    private ContaBancaria conta_bancaria;
    private Emprego emprego;

    public Pessoa(String nome, String sobrenome, String cpf, Data data_nascimento) {
        try {
            this.nome = nome;
            this.sobrenome = sobrenome;
            if(!isCpfValid(cpf)) {
                throw new CpfInvalidoException();
            } else {
                this.cpf = cpf;
            }
            this.data_nascimento = data_nascimento;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isCpfValid(String cpf) {
        if(cpf.matches("[a-z]"))
            return false;
        else
            return true;
    }

    public Emprego getEmprego() {
        return emprego;
    }
    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }
    public void setConta_bancaria(ContaBancaria conta_bancaria) {
        this.conta_bancaria = conta_bancaria;
    }
    public ContaBancaria getConta_bancaria() {
        return conta_bancaria;
    }
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public Data getData_nascimento() {
        return data_nascimento;
    }
}
