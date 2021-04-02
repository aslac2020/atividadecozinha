import java.time.LocalDate;

class Vencimento {

    public Vencimento(String nome, LocalDate dataVencimento) {

        this.nome = nome;
        this.dataVencimento = dataVencimento;
    }

    protected String nome;
    protected LocalDate dataVencimento;
}
