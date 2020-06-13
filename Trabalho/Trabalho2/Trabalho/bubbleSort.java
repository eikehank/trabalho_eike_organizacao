package Trabalho;

import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class bubbleSort {

	public static LinkedList<Long> organizar(LinkedList<Long> arq) {
		long tempoInicial = 0;
		long tempoFinal = 0;
		
		tempoInicial = System.currentTimeMillis();
	
		for (int i = 0; i < arq.size() - 1; i++) {
			for (int j = 1; j < arq.size() - i; j++) {
				if (arq.get(j - 1) > arq.get(j)) {
					Collections.swap(arq, j - 1, j);			
				}
			}
			tempoFinal = System.currentTimeMillis();
		}	
		JOptionPane.showMessageDialog(
				null, "Executado em = " + (tempoFinal - tempoInicial) + " ms", "AVISO", JOptionPane.WARNING_MESSAGE);
		return arq;
	}
}
