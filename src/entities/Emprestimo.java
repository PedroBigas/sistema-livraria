package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Emprestimo {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Integer id;
    private Livro livro;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Integer id, Livro livro, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Emprestimo that = (Emprestimo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return getNomeCliente() + " Você pegou o livro: " + getLivro().getTitulo() +
                " do dia " + FORMATTER.format(getDataEmprestimo()) + " e devolver no dia: " + FORMATTER.format(getDataDevolucao());
    }
}
