package com.walescko.address;

public class Address {
    protected String street;
    protected int number;
    protected String complement;
    protected int CEP;
    protected String district;
    protected String city;
    protected String state;

    public Address(String street, int number, String complement, int CEP, String district, String city, String state) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.CEP = CEP;
        this.district = district;
        this.city = city;
        this.state = state;
    }
}
