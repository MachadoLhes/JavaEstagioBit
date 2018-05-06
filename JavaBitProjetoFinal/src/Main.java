public class Main {
    public static void main(String[] args) {
        /*TESTES
        Pessoa quebrado = new Pessoa("Sou um", "Erro","teste", new Data(31,2,1999));    //Testa exception em caso de CPF com letras (não funciona)
                                                                                          e data impossível (exception lançada com sucesso)
        Banco b = new Banco();                                                          //Força a quebra do padrão Singleton
        */

        Banco bitbank = new Banco();
        Pessoa rodrigo = new Pessoa("Rodrigo", "Machado", "17927286706",new Data(21,8,1997));
        Pessoa greg = new Pessoa("Gregory","Porter", "13526384643",new Data(4,11,1971));

        rodrigo.setConta_bancaria(new ContaCorrente("0001",new Data(12,12,2009),15));
        greg.setConta_bancaria(new ContaPoupanca("0001",new Data(13,12,2009),5000));

        rodrigo.setEmprego(new Gerente("2016780450",18000));
        greg.setEmprego(new Assitente("120310230",3000));

        //Deposita os salários de Rodrigo e Greg
        rodrigo.getConta_bancaria().deposita(rodrigo.getEmprego().calculaSalario());
        greg.getConta_bancaria().deposita(greg.getEmprego().calculaSalario());

        bitbank.addConta(rodrigo.getConta_bancaria());
        bitbank.addConta(greg.getConta_bancaria());

        bitbank.imprimeContas();

        greg.getConta_bancaria().transfere(rodrigo.getConta_bancaria(),40);

        bitbank.imprimeContas();


        /*DIFICULDADES
            Não consegui fazer número da conta aumentar toda vez que o construtor é chamado
        */
    }
}
