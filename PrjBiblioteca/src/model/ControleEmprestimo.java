package model;

import java.time.LocalDate;

public class ControleEmprestimo {

    public String registraEmprestimo(Usuario usuario, Livro livro) {
        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo;

        return "Emprestimo registrado: " + usuario.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data do Emprestimo: " + dataEmprestimo + "\n";

    }

    public String registraDevolucao(Usuario usuario, Livro livro) {
        LocalDate dataDevolucao = LocalDate.now(); // Data atual para a devolução


        return "Devolução registrada: " + usuario.getNome() + "\n" +
                "Livro: " + livro.getTitulo() + "\n" +
                "Data de Devolução: " + dataDevolucao + "\n";
    }
}
