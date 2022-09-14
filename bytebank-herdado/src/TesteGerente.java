
public class TesteGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Natalia");
		g1.setCpf("22222222222");
		g1.setSalario(7000);
		
		System.out.println(g1.getBonificacao());
		
	}

}
