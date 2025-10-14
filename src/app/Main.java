package app;

import entities.Biblioteca;
import entities.Livro;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);


        String resposta = "";

        while (!resposta.equalsIgnoreCase("SIM")) {
            System.out.print("Bem vindo a Biblioteca Bigas! Deseja ver os Livros Disponiveis? (SIM/NAO) ");
            resposta = sc.next();
        }

        List<Livro> livros = biblioteca.getLivros();


    }
}
