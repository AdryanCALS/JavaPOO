package enxpsulamento;

public class Aluno {
	@SuppressWarnings("unused")
	private String nome;
	private double nota1;
	private double nota2;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		double media = (this.nota1+this.nota2)/2;
		return media;
	}
	
	public boolean isAprovado() {
		double media = (this.nota1+this.nota2)/2;
		if(media>=6) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
