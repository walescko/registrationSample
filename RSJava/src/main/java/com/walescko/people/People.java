package com.walescko.people;

import com.sun.javafx.beans.IDProperty;

import java.util.Date;

public class People {

    protected int id;
    protected String name;
    protected String surname;
    protected String cpf;
    protected char genere;
    protected Date birthday;

    public People(int id, String name, String surname, String cpf, char genere, Date birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.genere = genere;
        this.birthday = birthday;

        
    }
}
