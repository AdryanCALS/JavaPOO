package acabou;

public class Competicao {

	public static void main(String[] args) {
		Ciclista c1 = new Ciclista();
		Nadador n1 = new Nadador();
		Corredor cr1 = new Corredor();
		
		c1.pedalar();
		c1.pararPedalar();
		
		n1.nadar();
		n1.pararNadar();
		
		cr1.correr();
		cr1.paraCorrer();
	}

}
