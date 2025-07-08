package enxpsulamento;

public class TestePets {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		
		p1.ajustarIdade(19);
		p1.ajustarNome("Samuel");
		p1.ajustarRaca("Pinscher");
		p1.ajustarTipo("Cachorro");
		
		System.out.println(p1.mostrarIdade());
		System.out.println(p1.mostrarNome());
		System.out.println(p1.mostrarRaca());
		System.out.println(p1.mostrarTipo());
	}

}
