package services;

import entities.Livro;

import java.util.List;

public class LivroService {
    private Livro livroEscolhido;

    public List<Livro> filtrarDisponiveis(List<Livro> livros) {
        return livros.stream()
                .filter(l -> l.getDisponivel() == true).toList();

    }

    public List<Integer> idsDisponiveis(List<Livro> livros) {
        return livros.stream()
                .map(Livro::getId)
                .toList();
    }

    public Livro getLivroPeloId(int id, List<Livro> list) {

        for (Livro livro : list) {
            if (livro.getId() == id) {
               livroEscolhido = livro;
            }
        }

        return livroEscolhido;
    }
}
