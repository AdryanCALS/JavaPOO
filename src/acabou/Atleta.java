package acabou;

public abstract class Atleta {
	String nome;
	int idade;
	
	void aquecer() {
		System.out.printf("O atleta %s está aquecendo", this.nome);
	}
}

