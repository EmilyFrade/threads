package br.com.asaas.threads;

public class ImprimeString implements Runnable {
	private String texto;
	
	public ImprimeString(String texto) {
		this.texto = texto;
	}

	@Override
	public void run() {
		System.out.println(texto);
	}
}
