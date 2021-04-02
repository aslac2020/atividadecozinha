import java.time.LocalDate;

class Vencimento {

    public Vencimento(String nome, LocalDate dataVencimento) {

        this.nome = nome;
        this.dataVencimento = dataVencimento;
    }

    // public String toString() {
    //     int diaMes = dataVencimento.getDayOfMonth();
    //     int mes = dataVencimento.getMonthValue();
    //     int ano = dataVencimento.getYear();
    //     return "Ingrediente: " + nome + " válido até " + diaMes + "/" + mes + "/" + ano;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public LocalDate getDataVencimento() {
    //     return dataVencimento;
    // }

    // public void setDataValidade(LocalDate dataVencimento) {
    //     this.dataVencimento = dataVencimento;
    // }


    protected String nome;
    protected LocalDate dataVencimento;
}
