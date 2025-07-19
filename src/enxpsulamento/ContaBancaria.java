package enxpsulamento;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double depositar(double valor) {
		if(valor<=0) {
			System.out.println("Valor inválido para depósito!");
		}else {
			System.out.printf("Deposito de %.2f feito com sucesso!\n", valor);
			this.saldo +=valor;
		}
		return this.saldo;
	}
	
	public void sacar(double valor) {
		if(valor>this.saldo) {
			System.out.println("Saque indisponível!");
		}else {
			this.saldo -=valor;
			System.out.printf("Saque de %.2f feito com sucesso, saldo atual: %.2f\n", valor, this.saldo);
		}
	}
	
	
	
	
}
