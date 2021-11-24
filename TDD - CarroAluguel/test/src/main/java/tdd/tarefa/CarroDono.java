package tdd.tarefa;

import java.io.Serializable;

public class CarroDono extends Pessoa implements Serializable{

    private int saldo;

    public CarroDono(int saldo, int id, String cPF, String nome, String telefone) {
        super(id, cPF, nome, telefone);
        this.setSaldo(saldo);
        //TODO Auto-generated constructor stub
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
