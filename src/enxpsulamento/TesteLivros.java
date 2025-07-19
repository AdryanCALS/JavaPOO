package enxpsulamento;

public class TesteLivros {

	public static void main(String[] args) {
		Livro l1 = new Livro();
		
		l1.setAutor("H.P Lovecraft");
		l1.setFaixaEtariaMinima(16);
		l1.setNome("Arroz");
		
		System.out.println(l1.getAutor());
		System.out.println(l1.getNome());
		System.out.println(l1.getFaixaEtariaMinima());
		
		if(l1.podeSerLidoPor(16)) {
			System.out.println("Voce pode ler o livro");
		}else {
			System.out.println("Voce nao pode ler o livro");
		}
	}

}
