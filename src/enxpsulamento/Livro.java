package enxpsulamento;

public class Livro {
	private String nome;
	private String autor;
	private int faixaEtariaMinima;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getFaixaEtariaMinima() {
		return faixaEtariaMinima;
	}
	public void setFaixaEtariaMinima(int faixaEtariaMinima) {
		this.faixaEtariaMinima = faixaEtariaMinima;
	}
	
	public boolean podeSerLidoPor(int idade) {
		if (idade>=this.faixaEtariaMinima) {
			return true;
		}else {
			return false;
		}
	}
}
