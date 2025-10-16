package app;

import entities.Biblioteca;
import entities.Livro;
import services.LivroService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        String resposta = "";
        System.out.println("Bem vindo a Biblioteca Bigas!");

        do{
            System.out.print("Deseja ver nossos livros disponiveis? (SIM/NAO) ");
            resposta = sc.next();
            if (resposta.equalsIgnoreCase("SIM")) {
                System.out.println("Segue nossos livros disponiveis: ");
                break;
            }
            if (resposta.equalsIgnoreCase("NAO")) {
                System.out.println("Você decidiu sair do programa, até a proxima! :D");
                System.exit(0);
            }
            else {
                System.out.println("O sistema não conseguiu entender sua resposta, Tente novamente!");
            }
        } while (!resposta.equalsIgnoreCase("SIM"));

        LivroService ls = new LivroService();
        List<Livro> livrosDisponiveis = ls.filtrarDisponiveis(biblioteca.getLivros());
        for (Livro livro : livrosDisponiveis) {
            System.out.println("ID: " + livro.getId() + " Nome: " + livro.getTitulo());
        }

        System.out.println("Escolha o Livro que deseja pegar emprestado: (ESCOLHA PELO ID)");
        int idEscolhido = sc.nextInt();
        List<Integer> idDisponiveisList = ls.idsDisponiveis(livrosDisponiveis);

        if (!verificaId(idEscolhido, idDisponiveisList)) {
            System.out.println("Livro escolhido não foi encontrado ou não está disponivel");
            return;
        }

        Livro livroEscolhido = ls.getLivroPeloId(idEscolhido, livrosDisponiveis);
        System.out.println(livroEscolhido);



    }

    private static boolean verificaId(Integer id, List<Integer> ids) {
        return ids.contains(id);
    }

}
