
public class Agente{
	
	public Pessoa pessoa;
	private int idAgente;
	private String nome;
	
	public Agente(Pessoa pessoa, int idAgente, String nome) {
		this.pessoa = pessoa;
		this.idAgente = idAgente;
		this.nome = nome;
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return getEndereco();
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
}
