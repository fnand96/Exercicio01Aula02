package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    String nome;
    String sobreNome;
    LocalDate dataNascimento;

    String saudacao(){
        return String.format("Olá meu nome %s %s tenho %d anos %n " , nome, sobreNome, LocalDate.now().until(dataNascimento, ChronoUnit.YEARS));
    }

}
