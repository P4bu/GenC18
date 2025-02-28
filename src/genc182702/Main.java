package genc182702;

import genc182702.interfaces.CuentaBancaria;
import genc182702.model.Cliente;
import genc182702.model.CuentaAhorro;
import genc182702.model.CuentaCorriente;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        Cliente cliente = null;
        CuentaBancaria cuenta = null;

        while (true) {
            System.out.println("\n=== Menú del Banco ===");
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if(cuenta == null) {
                        System.out.print("Ingrese el nombre del cliente: ");
                        sc.nextLine();
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el RUT del cliente (sin puntos ni guion): ");
                        String rut = sc.nextLine();
                        //System.out.print("Ingrese el ID del cliente: ");
                        int id = random.nextInt(900) + 100;

                        System.out.print("Seleccione un tipo de cuenta (1: Ahorros, 2: Corriente): ");
                        int tipoCuenta = sc.nextInt();

                        if (tipoCuenta == 1) {
                            System.out.print("Ingrese saldo inicial para Cuenta Ahorros: ");
                            double saldoAhorro = sc.nextDouble();

                            cuenta = new CuentaAhorro(saldoAhorro);
                            cliente = new Cliente(id ,nombre, rut, cuenta);
                            System.out.println("Cuenta de ahorros creada.");
                        } else if (tipoCuenta == 2) {
                            System.out.print("Ingrese saldo inicial para Cuenta Corriente: ");
                            double saldoCorriente = sc.nextDouble();
                            System.out.print("Ingrese límite de sobregiro: ");
                            double sobreGiroLimite = sc.nextDouble();

                            cuenta = new CuentaCorriente(saldoCorriente, sobreGiroLimite);
                            cliente = new Cliente(id ,nombre, rut, cuenta);
                            System.out.println("Cuenta corriente creada.");
                        } else {
                            System.out.println("Opción inválida.");
                        }
                        break;
                    } else {
                        System.out.println("Ya tienes una cuenta en el banco");
                    }
                case 2:
                    if (cliente != null) {
                        System.out.println("Cliente: " + cliente.getNombre());
                        System.out.println("RUT: " + cliente.getRut());
                        System.out.println("ID: " + cliente.getId());
                        System.out.println("Saldo actual: " + cuenta.consultaSaldo());
                    } else {
                        System.out.println("No se ha creado una cuenta aún");
                    }
                    break;

                case 3:
                    if (cliente != null) {
                        System.out.print("Ingrese monto a depositar: ");
                        double montoDeposito = sc.nextDouble();
                        cuenta.depositar(montoDeposito);
                    } else {
                        System.out.println("No se ha creado una cuenta aún.");
                    }
                    break;

                case 4:
                    if (cliente != null) {
                        System.out.print("Ingrese monto a retirar: ");
                        double montoRetiro = sc.nextDouble();
                        cuenta.retirar(montoRetiro);
                    } else {
                        System.out.println("No se ha creado una cuenta aún.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del banco \uD83D\uDE80");
                    sc.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

    }
}
