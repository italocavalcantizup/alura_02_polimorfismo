public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		System.out.println("Informação do Funcionário");
		System.out.printf("%s - CPF: %s - Salário: R$ %.2f", this.nome, this.cpf, this.salario);
		System.out.println();
		System.out.println("----------------");
		return super.toString();
	}
	
	
	
}
