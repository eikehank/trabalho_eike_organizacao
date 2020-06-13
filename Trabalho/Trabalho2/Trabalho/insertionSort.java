package Trabalho;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class insertionSort {

	 public static LinkedList<Long> organizar(LinkedList<Long> arq) {
		 	
		 	long tempoInicial = 0;
		 	long tempoFinal = 0;
		    int i, j;
		   
		   
		    tempoInicial = System.currentTimeMillis();
		    
		    for (i = 1; i < arq.size(); i++) {
		        Long chave = new Long(0);
		        chave = arq.get(i);
		        chave = arq.get(i);
		        chave = arq.get(i);
		        j = i;
		        while((j > 0) && (arq.get(j - 1) > chave)) {
		            arq.set(j,arq.get(j - 1));
		            j --;
		        }
		        arq.set(j,chave);
		        tempoFinal = System.currentTimeMillis();
		    }
		    JOptionPane.showMessageDialog(
					null, "Executado em = " + (tempoFinal - tempoInicial) + " ms", "AVISO", JOptionPane.WARNING_MESSAGE);
		    return arq;
	}
}