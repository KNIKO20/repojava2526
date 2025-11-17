package tema3;


public class CuentaBancariaClase {
	private String accountNumber;
	private double balance;
	private String titular;
	public CuentaBancariaClase(String accountNumber, double balance, String titular) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.titular=titular;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public String getTitular() {
		return titular;
	}
	public String toString() {
		return titular+"'s Account"+"\nAccount number: "+accountNumber+"\nYour balance: "+balance+"€";
		
	}
	public void ingresar(double ingreso) {
		if(ingreso > 0) {
			this.balance += ingreso;
		} else {
			System.out.println("No se puede ingresar número negativos");
		}
		
	}
	public void retirar(double retiro) {
		
		if(retiro > balance) {
			this.balance -= retiro;
		} else {
			System.out.println("No se puede retirar más del saldo");
		}
	}
	public String consultarSaldo() {
		return "El saldo actual de "+titular+" es: "+balance+"€";
	}

}
