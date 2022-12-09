package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CNH");
        System.out.println("Digite seu nome");
        System.out.println("Digite seu Sobrenome");

        Pessoa pessoa = new Pessoa(scanner.next(), scanner.next(), scanner.next());
        Carro fusca = new Carro();
        fusca.cor = "branca";
        fusca.marca = "VW";
        fusca.placa = "MMM7888";
        fusca.motorista = pessoa;


        System.out.println("Digite a data do seu Nascimento no padrão dd/MM/yyyy");
        pessoa.dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.printf(fusca.apresentar());

    }
}
