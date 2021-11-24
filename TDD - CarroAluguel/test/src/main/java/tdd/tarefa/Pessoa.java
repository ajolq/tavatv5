package tdd.tarefa;

public class Pessoa {


    protected int id;
    protected String CPF;
    protected String nome;
    protected String telefone;


    public Pessoa(int id, String cPF, String nome, String telefone) {
        this.id = id;
        CPF = cPF;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
