package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite a data do seu Nascimento no padrão dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(scanner.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.printf("Olá meu nome %s %s tenho %d anos %n " , nome, sobrenome, LocalDate.now().until(dataNascimento, ChronoUnit.YEARS) );

    }
}
