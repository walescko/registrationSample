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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getGenere() {
        return genere;
    }

    public void setGenere(char genere) {
        this.genere = genere;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
