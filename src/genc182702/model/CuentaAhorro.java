package genc182702.model;

import genc182702.interfaces.CuentaBancaria;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;

    public CuentaAhorro(double saldoInicial) {
        if(saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double monto) {
        if(monto > 0) {
            saldo = saldo + monto;
            System.out.println("Deposito realizado");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Deposito no realizado, verificar monto");
        }
    }

    @Override
    public void retirar(double monto) {
        if((saldo > 0) && (monto <= saldo )) {
            saldo = saldo - monto;
            System.out.println("Tu retiro fue realizado con exito ");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente o monto invalido");
        }
    }

    @Override
    public double consultaSaldo() {
        return saldo;
    }
}
