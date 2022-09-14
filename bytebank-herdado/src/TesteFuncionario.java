
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario italo = new Gerente();
		italo.setNome("Italo");
		italo.setCpf("00000000000");
		italo.setSalario(10000);
		
		System.out.println(italo.getNome());
		System.out.println(italo.getBonificacao());
		
	}

}
