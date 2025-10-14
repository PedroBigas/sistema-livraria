package app;

import entities.Biblioteca;
import entities.Livro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro);
        }
    }
}
