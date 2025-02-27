package genc182702.model;

import genc182702.interfaces.CuentaBancaria;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;
    private double sobreGiroLimite;

    public CuentaCorriente(double saldo, double sobreGiroLimite) {
        this.saldo = saldo;
        this.sobreGiroLimite = sobreGiroLimite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getGiroLimite() {
        return sobreGiroLimite;
    }

    public void setGiroLimite(double sobreGiroLimite) {
        this.sobreGiroLimite = sobreGiroLimite;
    }


    @Override
    public void depositar(double monto) {
        if(monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito realizado a cuenta corriente");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto no valido!");
        }
    }

    @Override
    public void retirar(double monto) {
        if((monto > 0) && (saldo - monto >= sobreGiroLimite)){
            saldo = saldo - monto;
            System.out.println("Retiro realizado de cuenta corriente");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Se sobregiro o el monto no es valido");
        }
    }

    @Override
    public double consultaSaldo() {
        return saldo;
    }
}
