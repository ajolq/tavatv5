package tdd.tarefa;

public class Reserva {

    private int id;
    private Cliente cliente;
    private Carro carro;
    private String TempoAluguel;
    private String devolucao;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public String getTempoAluguel() {
        return TempoAluguel;
    }
    public void setTempoAluguel(String tempoAluguel) {
        TempoAluguel = tempoAluguel;
    }
    public String getDevolucao() {
        return devolucao;
    }
    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }


    public String CarroReservado(int id, String cliente, String carro, String tempoAluguel, String devolucao) {
		
		return "ID:" + id + "\n" + "Carro:" + carro + "\n" + "Cliente: " + cliente + "Alugou no dia: " + tempoAluguel + "Devolver até: " + devolucao;
	}	
}
