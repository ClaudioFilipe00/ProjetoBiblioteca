package model;

public class Professor extends Usuario{
    String departamento;
    String titulacao;

    public Professor(int idUsuario, String nome, String email, String departamento, String titulacao){
        super(idUsuario, nome, email);
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
