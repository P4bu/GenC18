package genc182702.model;

import genc182702.interfaces.CuentaBancaria;

public class Cliente {

    private int id;
    private String nombre;
    private String rut;

    private CuentaBancaria cuenta;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String rut, CuentaBancaria cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
}
