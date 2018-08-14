package questao_01;

import questao_02.SaldoInsuficienteException;
import questao_02.ValorInvalidoException;

public class Conta {
	
	private int agencia;
	private int conta;
	private String titular;
	private double saldo;


	public Conta(int agencia, int conta, String titular, double saldo) {
		this(agencia,conta,titular);
		this.saldo = saldo;
	}
	
	public final void transferir(Conta origem, Conta destino, double montante) throws ValorInvalidoException, SaldoInsuficienteException {

		origem.sacar(montante);
		destino.depositar(montante);
	}
	
	
	public void depositar(double montante) throws ValorInvalidoException {
		
		if(montante > 0) {
			saldo += montante;	
		} else {
			throw new ValorInvalidoException();
		}
	}

	
	public void sacar(double montante) throws SaldoInsuficienteException {
		
		if(montante > 0 && saldo >= montante) {
			saldo -= montante;	
		} else {
			throw new SaldoInsuficienteException();
		}
	}
	
	
	public Conta(int agencia, int conta, String titular) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
	}

	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	
	public int getConta() {
		return conta;
	}

	
	public void setConta(int conta) {
		this.conta = conta;
	}

	
	public String getTitular() {
		return titular;
	}

	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	
	public double getSaldo() {
		return saldo;
	}


	 
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
