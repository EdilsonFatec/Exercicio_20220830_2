package view;

import controller.ThreadMatriz;

public class Principal {

	public static void main(String[] args) {
		int matriz[][]= new int [3][5];
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<5;j++) {
				matriz[i][j] = (int) (Math.random()*50);
			}
		}
		
		for (int i=0;i<3;i++) {
			ThreadMatriz threadmatriz = new ThreadMatriz(i,matriz);
			threadmatriz.start();
		}
	}
}
