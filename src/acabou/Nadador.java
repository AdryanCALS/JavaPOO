package acabou;

public class Nadador extends Atleta{
	public void nadar() {
		System.out.printf("%s está nadando\n", this.nome);
	}
	public void pararNadar() {
		System.out.printf("%s parou de nadar\n", this.nome);
	}
}