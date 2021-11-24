package tdd.tarefa;

public class Carro {

    private int id;
    private String marca;
    private String nome;
    private String cor;
    private String tipo;
    int CapacidadeAssento;
    String modelo;
    String condicao;
    String reg;
    private int AlugarDiaria;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public int getCapacidadeAssento() {
        return CapacidadeAssento;
    }


    public void setCapacidadeAssento(int capacidadeAssento) {
        CapacidadeAssento = capacidadeAssento;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCondicao() {
        return condicao;
    }


    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }


    public String getReg() {
        return reg;
    }


    public void setReg(String reg) {
        this.reg = reg;
    }


    public int getAlugarDiaria() {
        return AlugarDiaria;
    }


    public void setAlugarDiaria(int alugarDiaria) {
        AlugarDiaria = alugarDiaria;
    }


    public String VerificarCarro (int id, String marca, String nome, String cor, String tipo, int capacidadeAssento, String modelo,
    String condicao, String reg, int alugarDiaria) {

        return "ID:" + id + "\n" + "Carro:" + nome + "\n" + "Marca: " + marca + "Cor: " + cor + "Tipo:  " + tipo + "Modelo: " + modelo + "Capacidade de Assentos: " + capacidadeAssento 
        + "Condição: " + condicao + "Registro: " + reg + "Valor diaria: " + alugarDiaria;


    }

}