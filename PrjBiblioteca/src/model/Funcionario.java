package model;

public class Funcionario extends Usuario{
    String cargo;
    String setor;

    public Funcionario(int idUsuario, String nome, String email, String cargo, String setor){
        super(idUsuario, nome, email);
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
