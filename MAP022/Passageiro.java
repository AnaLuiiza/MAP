
public class Passageiro {
	
	private Pessoa pessoa;
	private int numeroSimples;
	
	public Passageiro(Pessoa pessoa, int numeroSimples) {
		this.pessoa = pessoa;
		this.numeroSimples = numeroSimples;
	}

	public String getPessoa() {
		return pessoa.nome +" "+ pessoa.endereco;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getNumeroSimples() {
		return numeroSimples;
	}

	public void setNumeroSimples(int numeroSimples) {
		this.numeroSimples = numeroSimples;
	}
	

}
