package acabou;

public class Corredor extends Atleta{
	
	public void correr() {
		System.out.printf("%s está correndo\n", this.nome);
	}
	public void paraCorrer() {
		System.out.printf("%s parou de correr\n", this.nome);
	}
}
