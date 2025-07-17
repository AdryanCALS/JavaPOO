package acabou;

public class Ciclista extends Atleta{
	public void pedalar() {
		System.out.printf("%s está pedalando\n", this.nome);
	}
	public void pararPedalar() {
		System.out.printf("%s parou de pedalar\n", this.nome);
	}
}