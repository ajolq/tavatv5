package tdd.tarefa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarroTeste {
    
    @Test
    void VerificarReserva() {
        //Arrange
        Reserva Reserva = new Reserva();
        
        int id = 3;
        String cliente = "Mario";
        String carro = "Volkswagen Saveiro";
        String tempoAluguel  = "21/11/2021";
        String devolucao =   "27/11/2021";
        
        String esperado = "ID:" + id + "\n" + "Carro:" + carro + "\n" + "Cliente: " + cliente + "Alugou no dia: " + tempoAluguel + "Devolver até: " + devolucao;
                                
        //Act
        String resultado = Reserva.CarroReservado(id, cliente, carro, tempoAluguel, devolucao);
        
        //Assert
        assertEquals(esperado,resultado);
    }

    @Test
    void AlugarCarro() {

        //Arrange
        Carro Carro  = new Carro();

        int id = 5;
        String marca = "Toyota";
        String nome = "Rogerio";
        String cor = "Cinza";
        String tipo = "Crossover";
        int capacidadeAssento = 5;
        String modelo = "Corolla Cross";
        String condicao = "Alugado";
        String reg = "568754456-745";
        int alugarDiaria = 3500;


        String esperado =  "ID:" + id + "\n" + "Carro:" + nome + "\n" + "Marca: " + marca + "Cor: " + cor + "Tipo:  " + tipo + "Modelo: " + modelo + "Capacidade de Assentos: " + capacidadeAssento 
        + "Condição: " + condicao + "Registro: " + reg + "Valor diaria: " + alugarDiaria;

        //Act

        String resultado = Carro.VerificarCarro(id, marca, nome, cor, tipo, capacidadeAssento, modelo,
        condicao, reg, alugarDiaria);
        
        //Assert
        assertEquals(esperado,resultado);
    }

}
