package enxpsulamento;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.depositar(100.50);
		c1.sacar(50);
		c1.sacar(50);
	}

}
