package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome");
        pessoa.nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        pessoa.sobreNome = scanner.next();

        System.out.println("Digite a data do seu Nascimento no padrão dd/MM/yyyy");
        pessoa.dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.printf( pessoa.saudacao());

    }
}
