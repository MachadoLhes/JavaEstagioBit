public class Data {
    private int dia, mes, ano;

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    public Data(int dia, int mes, int ano) {
        try {
            if(mes==2 && dia>29) {
                throw new DiaImpossivelException();
            }
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String formata() {
        return (this.getDia()+"/"+this.getMes()+"/"+this.getAno());
    }
}
