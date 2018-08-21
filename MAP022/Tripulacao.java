
public class Tripulacao {
	
	public Pessoa pessoa;
	private int idTripulacao;
	
	
	public Tripulacao(Pessoa pessoa,int idTripulacao) {
		this.pessoa = pessoa;
		this.idTripulacao = idTripulacao;
		
	}

	public int getIdTripulacao() {
		return idTripulacao;
	}

	public void setIdTripulacao(int idTripulacao) {
		this.idTripulacao = idTripulacao;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
