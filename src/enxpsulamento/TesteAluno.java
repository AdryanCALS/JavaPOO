package enxpsulamento;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Joao");
		a1.setNota1(10);
		a1.setNota2(5);
		
		System.out.println(a1.getNome());
		System.out.println(a1.getMedia());
		if(a1.isAprovado()) {
			System.out.println("Aprovado");
		}else {
		 System.out.println("Reprovado");
		}
		
		a2.setNome("Maria");
		a2.setNota1(7);
		a2.setNota2(5);
		
		System.out.println(a2.getNome());
		System.out.println(a2.getMedia());
		if(a2.isAprovado()) {
			System.out.println("Aprovado");
		}else {
		 System.out.println("Reprovado");
		}
		
		
	}

}
