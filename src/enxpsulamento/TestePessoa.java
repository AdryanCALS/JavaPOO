package enxpsulamento;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setIdade(19);
		p1.setNome("Carlos");
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());

	}

}
