import model.Livro;
import model.Professor;
import model.ControleEmprestimo;
import model.Funcionario;
import model.Aluno;


public class GerenciarBiblioteca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Ana", "ana@email.com", "2023001", "Engenharia");
        Professor professor = new Professor(2, "Carlos", "carlos@email.com", "Matemática", "Mestre");
        Funcionario funcionario = new Funcionario(3, "José", "jose@email.com", "Bibliotecário", "Biblioteca");


        Livro livro1 = new Livro(101, "Programação em Java", "JK Rowling", false);
        Livro livro2 = new Livro(102, "Estruturas de Dados", "Martin", true);
        Livro livro3 = new Livro(103, "Algoritmos", "Tolkien", true);

        ControleEmprestimo controle = new ControleEmprestimo();

        System.out.println(controle.registraEmprestimo(aluno, livro1));
        System.out.println(controle.registraEmprestimo(professor, livro2));
        System.out.println(controle.registraEmprestimo(funcionario, livro3));

        System.out.println(controle.registraDevolucao(aluno, livro1));
        System.out.println(controle.registraDevolucao(professor, livro2));
        System.out.println(controle.registraDevolucao(funcionario, livro3));

    }
}
