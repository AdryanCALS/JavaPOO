package enxpsulamento;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setNome("Arroz");
		p1.setPreco(10.5);
		p1.adicionarEstoque(20);
		p1.removerEstoque(15);
		p1.removerEstoque(5);
	}

}
