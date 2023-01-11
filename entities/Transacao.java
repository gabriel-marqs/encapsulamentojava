package entities;

public class Transacao {
	
	private String conta;
	private String nome;
	private double saldo;
	
	

	public Transacao(String conta, String nome) {
		this.conta = conta;
		this.nome = nome;
	}
	
	
		public Transacao(String conta, String nome, double depositoInicial) {
		this.conta = conta;
		this.nome = nome;
		depositar(depositoInicial);
	}

		public double getSaldo() {
			return saldo;
		}
		
	public void depositar(double saldo) {
		this.saldo += saldo;
	}	

	public void sacar(double saldo) {
		this.saldo -= saldo + 5;
	}

	public String toString() {
		return "Conta: "
				+ conta
				+ ", Titular: "
				+ nome
				+ ", Saldo: "
				+ String.format("%.2f", saldo);
	}
}
