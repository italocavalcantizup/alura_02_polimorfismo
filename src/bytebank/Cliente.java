package bytebank;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	public Cliente(String nome, String cpf, String profissao) {
		this.nome = nome;
		this.cpf = cpf;
		this.profissao = profissao;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}
