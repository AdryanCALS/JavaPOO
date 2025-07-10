package enxpsulamento;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeestoque;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int adicionarEstoque(int qtd) {
		this.quantidadeestoque +=qtd;
		return this.quantidadeestoque;
	}
	public int removerEstoque(int qtd) {
		if (this.quantidadeestoque<qtd) {
			System.out.printf("Remoção indisponível, não há %s suficientes para essa retirada\n", this.nome);
		}else {
			this.quantidadeestoque -=qtd;
			System.out.printf("Quantidade removida com sucesso, agora há %d %s no estoque\n", this.quantidadeestoque, this.nome);
		}
		return this.quantidadeestoque;
	}
	
}
