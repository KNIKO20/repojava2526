package tema3;

/**
 * Clase CuentaBancariaStatic que permite crear cuentas bancarias.
 * Utiliza un atributo estático para contar el número total de cuentas creadas.
 * @author Kevin
 * @since 31-oct-2025
 * 
 */

import java.util.Objects;

public class CuentaBancariaStatic {
    
    // Número de la cuenta bancaria
    private String accountNumber;
    
    // Saldo actual de la cuenta
    private double balance;
    
    // Nombre del titular de la cuenta
    private String titular;
    
    // Atributo estático que cuenta cuántas cuentas se han creado
    private static int totalCuentas = 0;

    /**
     * Constructor que inicializa los datos de la cuenta y aumenta el contador de cuentas.
     * @param accountNumber Número de cuenta
     * @param balance Saldo inicial
     * @param titular Nombre del titular
     */
    public CuentaBancariaStatic(String accountNumber, double balance, String titular) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.titular = titular;
        totalCuentas++; // Incrementa el contador de cuentas creadas
    }

    /**
     * Devuelve el número de cuenta.
     * @return Número de cuenta como String
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo como double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     * @return Titular como String
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Devuelve una representación textual de la cuenta.
     * @return Información de la cuenta como String
     */
    public String toString() {
        return titular + "'s Account" + "\nAccount number: " + accountNumber + "\nYour balance: " + balance + "€";
    }

    /**
     * Permite ingresar dinero a la cuenta si el monto es positivo.
     * @param ingreso Monto a ingresar
     */
    public void ingresar(double ingreso) {
        if (ingreso > 0) {
            this.balance += ingreso;
            System.out.println("Se ha ingresado " + ingreso + "€. Saldo actual: " + balance + "€");
        } else {
            System.out.println("No se puede ingresar números negativos");
        }
    }

    /**
     * Permite retirar dinero de la cuenta si hay suficiente saldo.
     * @param retiro Monto a retirar
     */
    public void retirar(double retiro) {
        if (retiro < balance) {
            this.balance -= retiro;
            System.out.println("Se ha retirado " + retiro + "€. Saldo actual: " + balance + "€");
        } else {
            System.out.println("No se puede retirar más del saldo disponible");
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     * @return Mensaje con el saldo
     */
    public String consultarSaldo() {
        return "El saldo actual de " + titular + " es: " + balance + "€";
    }

    /**
     * Devuelve el número total de cuentas creadas.
     * @return Total de cuentas como int
     */
    public int getNumCuentas() {
        return totalCuentas;
    }

    /**
     * Genera un código hash para la cuenta bancaria.
     * @return Código hash como int
     */
    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, titular);
    }

    /**
     * Compara si dos cuentas bancarias son iguales.
     * @param obj Objeto a comparar
     * @return true si son iguales, false si no
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CuentaBancariaStatic other = (CuentaBancariaStatic) obj;
        return Objects.equals(accountNumber, other.accountNumber)
                && Double.doubleToLongBits(balance) == Double.doubleToLongBits(other.balance)
                && Objects.equals(titular, other.titular);
    }
}

