package questao_03;

import questao_02.SaldoInsuficienteException;
import questao_02.ValorInvalidoException;

public class ContaPoupanca extends Conta{

	private static final double JUROS_CONTA_POUPANCA = 0.10;

	public ContaPoupanca(int agencia, int conta, String titular) {
		super(agencia, conta, titular);
		
	}

	@Override
	public double getTributo() {
		return JUROS_CONTA_POUPANCA;
	}
	
	@Override
	public void depositar(double montante) throws ValorInvalidoException {
		montante = montante + getTributo();
		super.depositar(montante);
	}
	
	@Override
	public void sacar(double montante) throws SaldoInsuficienteException {
		super.sacar(montante);
	}

}
