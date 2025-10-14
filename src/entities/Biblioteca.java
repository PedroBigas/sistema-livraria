package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca() {
        // ===== AUTORES =====
        Autor autor1 = new Autor(1, "George Orwell", LocalDate.of(1903, 6, 25));
        Autor autor2 = new Autor(2, "J.K. Rowling", LocalDate.of(1965, 7, 31));
        Autor autor3 = new Autor(3, "J.R.R. Tolkien", LocalDate.of(1892, 1, 3));
        Autor autor4 = new Autor(4, "Machado de Assis", LocalDate.of(1839, 6, 21));
        Autor autor5 = new Autor(5, "Stephen King", LocalDate.of(1947, 9, 21));
        Autor autor6 = new Autor(6, "Clarice Lispector", LocalDate.of(1920, 12, 10));

        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);
        autores.add(autor5);
        autores.add(autor6);

        // ===== LIVROS =====
        livros.add(new Livro(1, "1984", autor1, LocalDate.of(2025, 10, 12)));
        livros.add(new Livro(2, "A Revolução dos Bichos", autor1, LocalDate.of(2025, 10, 11)));

        livros.add(new Livro(3, "Harry Potter e a Pedra Filosofal", autor2, LocalDate.of(2025, 10, 10)));
        livros.add(new Livro(4, "Harry Potter e o Prisioneiro de Azkaban", autor2, LocalDate.of(2025, 10, 9)));

        livros.add(new Livro(5, "O Senhor dos Anéis: A Sociedade do Anel", autor3, LocalDate.of(2025, 10, 8)));
        livros.add(new Livro(6, "O Hobbit", autor3, LocalDate.of(2025, 10, 7)));

        livros.add(new Livro(7, "Dom Casmurro", autor4, LocalDate.of(2025, 10, 6)));
        livros.add(new Livro(8, "Memórias Póstumas de Brás Cubas", autor4, LocalDate.of(2025, 10, 5)));

        livros.add(new Livro(9, "O Iluminado", autor5, LocalDate.of(2025, 10, 4)));
        livros.add(new Livro(10, "It: A Coisa", autor5, LocalDate.of(2025, 10, 3)));

        livros.add(new Livro(11, "A Hora da Estrela", autor6, LocalDate.of(2025, 10, 2)));
        livros.add(new Livro(12, "Perto do Coração Selvagem", autor6, LocalDate.of(2025, 10, 1)));
    }


    private LocalDate dataAleatoria() {
        long diasAtras = ThreadLocalRandom.current().nextLong(1, 11);
        return LocalDate.now().minusDays(diasAtras);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void addLivros(Livro livro) {
        livros.add(livro);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutores(Autor autor) {
        autores.add(autor);
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void addEmpresimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

}
