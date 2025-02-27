package genc182702.interfaces;

public interface CuentaBancaria {
    void depositar(double monto);
    void retirar(double monto);
    double consultaSaldo();
}
