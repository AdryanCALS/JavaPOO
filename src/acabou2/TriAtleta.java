package acabou2;

public class TriAtleta implements Corredor,Nadador,Ciclista {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void aquecer() {
		System.out.printf("%s foi aquecer\n", nome);
	}

	@Override
	public void pedalar() {
		System.out.printf("%s foi pedalar\n", nome);
	}

	@Override
	public void pararPedalar() {
		System.out.printf("%s parou de pedalar\n", nome);
	}

	@Override
	public void nadar() {
		System.out.printf("%s foi nadar\n",nome);
	}

	@Override
	public void paraNadar() {
		System.out.printf("%s parou de nadar\n",nome);
	}

	@Override
	public void correr() {
		System.out.printf("%s foi correr\n",nome);
	}

	@Override
	public void pararCorrer() {
		System.out.printf("%s parou de correr\n",nome);
	}
}
