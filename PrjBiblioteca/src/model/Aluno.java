package model;

public class Aluno extends Usuario{
    String matricula;
    String curso;
    public Aluno(int idUsuario, String nome, String email, String matricula, String curso) {
        super(idUsuario, nome, email);
        this.matricula = matricula;
        this.curso = curso;

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
