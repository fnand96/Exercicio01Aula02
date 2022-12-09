package org.example;

public class Carro {

    String placa;
    String cor;
    String marca;

    Pessoa motorista;

    String apresentar(){
        return String.format("Carro de placa %s é dirigido por %s %n Especificação do motorista %s",
                placa, motorista.nome, motorista.saudacao());
    }

}
