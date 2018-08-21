
public class Test {
	
	public static void main(String[] args) {
		
	
	Pessoa pessoa = new Pessoa("Alberto","Rua: Silva Jardim, 302, Bairro: Santo Antonio");
	Passageiro passageiro = new Passageiro(pessoa,4);
	
	System.out.println(passageiro.getPessoa());
	}

}
