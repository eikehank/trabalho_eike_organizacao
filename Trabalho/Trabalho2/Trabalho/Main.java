package Trabalho;

import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		ler lerAquivo = new ler();
		LinkedList<Long> arq = new LinkedList<Long>();	
		salvar salvarArq = new salvar();
		busca binaria = new busca();	
		int op = 0;
		
		try {	
		
			op = Integer.parseInt(JOptionPane.showInputDialog(
			null, "Digite o método de organização"
			+ "\n(1)BubbleSort"
			+ "\n(2)QuickSort"
			+ "\n(3)InsertionSort", "AVISO", JOptionPane.WARNING_MESSAGE)); 
	
			switch (op) {
			case 1:			
				
				arq	= lerAquivo.ler("teste4000.txt");
			
			if (arq.isEmpty()) {	
			JOptionPane.showMessageDialog(
					null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);								
			}
			
				salvarArq.salvar(bubbleSort.organizar(arq));		
			
			break;				
			case 2: 
				
				arq	= lerAquivo.ler("teste4000.txt");
			
			if (arq.isEmpty()) {	
			JOptionPane.showMessageDialog(
					null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);								
			}
				
				salvarArq.salvar(quicksort.organizar(arq)); 
				// Não conseguimos implementar o metodo de busca no quickSort
					
			break;
			case 3:
				
				arq	= lerAquivo.ler("teste4000.txt");
			
			if (arq.isEmpty()) {	
			JOptionPane.showMessageDialog(
					null, "Erro ao ler arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);								
			}	
			
				salvarArq.salvar(insertionSort.organizar(arq));
			
			break;
			default:
				JOptionPane.showMessageDialog(
						null, "Entrada Invalida!", "AVISO", JOptionPane.WARNING_MESSAGE);
					System.exit(0);
			break;
		
			}

			op = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Informe o tipo de busca:\n(1)Binaria"));
	
			switch (op) {
			case 1:
				binaria.binaria(arq);	
			break;
			default:
			break;
  
		}
 
	} catch (NumberFormatException e) {
	System.exit(0);
	}
  }
}
