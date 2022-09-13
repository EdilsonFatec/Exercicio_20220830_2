package controller;

public class ThreadMatriz extends Thread {
	private int linha;
	private int matriz [] [];
	
	public ThreadMatriz(int linha, int matriz[][]) {
		this.linha = linha;
		this.matriz = matriz;
	}

	public void run() {
		int soma=0;
		String texto="Soma da linha "+linha+": ";
		for (int i=0;i<5;i++) {
			soma=soma + matriz[linha][i];
			if (i>0) {
				texto = texto + " + ";
			}
			texto = texto + matriz [linha][i];
		}
		texto = texto + " = " + soma;
		System.out.println(texto);
	}
}
