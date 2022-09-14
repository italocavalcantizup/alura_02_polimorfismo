
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario f) {
		double bonus = f.getBonificacao();
		this.soma += bonus;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
