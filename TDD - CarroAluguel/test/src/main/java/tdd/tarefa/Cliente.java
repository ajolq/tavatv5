package tdd.tarefa;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{

    private int fatura;

    public Cliente(int fatura, int id, String cPF, String nome, String telefone) {
        super(id, cPF, nome, telefone);
        this.fatura = fatura;
        //TODO Auto-generated constructor stub
    }

    public int getFatura() {
        return fatura;
    }

    public void setFatura(int fatura) {
        this.fatura = fatura;
    }
    
}
