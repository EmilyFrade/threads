package br.com.asaas.threads;

public class Principal {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new TarefasNumerosSequenciais());
		Thread thread2 = new Thread(new TarefasNumerosSequenciais());
		
		thread1.start();
		thread2.start();
	}
}
