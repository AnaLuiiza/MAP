package questao_01;

import questao_02.ValorInvalidoException;

public class MainConta {

	public static void main(String[] args) throws ValorInvalidoException {
		Conta conta = new Conta(232, 8787, "Rafael");
		conta.depositar(100);
		System.out.println(conta.getSaldo());

	}

}
