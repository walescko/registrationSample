package com.walescko.address;

public class ComercialAddress extends Address {

    protected Boolean comercialAddress = false;

    public ComercialAddress(boolean comercialAddress) {
        super();
        this.comercialAddress = comercialAddress;
    }


    public Boolean getComercialAddress() {
        return comercialAddress;
    }

    public void setComercialAddress(Boolean comercialAddress) {
        this.comercialAddress = comercialAddress;
    }
}
