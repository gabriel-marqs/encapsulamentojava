package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Transacao;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String conta, nome;
		double saldo;
		char res;

		System.out.print("Informe o número da conta: ");
		conta = sc.nextLine();

		System.out.print("Informe o nome do titular: ");
		nome = sc.nextLine();

		Transacao transacao = new Transacao(conta, nome);

		System.out.print("Deseja fazer um depósito inicial? (s/n) ");
		res = sc.next().toLowerCase().charAt(0);

		if (res == 's') {
			System.out.print("Informe o valor do depósito inicial: R$ ");
			saldo = sc.nextDouble();
			transacao.depositar(saldo);
			//System.out.println("Saldo atualizado: R$ " + transacao.getSaldo());
		}

		System.out.println("Dados da conta:");
		System.out.println(transacao);

		System.out.print("Informe o valor do depósito: R$");
		saldo = sc.nextDouble();
		transacao.depositar(saldo);

		System.out.println("Dados da conta atualizados:");
		System.out.println(transacao);
		
		System.out.print("Informe o valor do saque: R$");
		saldo = sc.nextDouble();
		transacao.sacar(saldo);
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(transacao);

		sc.close();

	}

}
