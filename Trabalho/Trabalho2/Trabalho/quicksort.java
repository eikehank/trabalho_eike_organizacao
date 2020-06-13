package Trabalho;


import java.util.LinkedList;


public class quicksort {

	public static LinkedList<Long> organizar(LinkedList<Long> arq) {

		if (arq.size() <= 1) {
			return arq;
		}

		int meio = (int) Math.ceil((double) arq.size() / 2);
		long comparador = arq.get(meio);

		LinkedList<Long> menor = new LinkedList<Long>();
		LinkedList<Long> maior = new LinkedList<Long>();

		for (int i = 0; i < arq.size(); i++) {
			if (arq.get(i) <= comparador) {
				if (i == meio) {
					continue;
				}
				maior.add(arq.get(i));
			
			} else {
				menor.add(arq.get(i));
			}
		}
		return concatenate(organizar(menor), comparador, organizar(maior));

	}

	private static LinkedList<Long> concatenate(LinkedList<Long> menor, long pivot, LinkedList<Long> maior) {

		LinkedList<Long> list = new LinkedList<Long>();

		for (int i = 0; i < menor.size(); i++) {
			list.add(menor.get(i));
		}

		list.add(pivot);

		for (int i = 0; i < maior.size(); i++) {
			list.add(maior.get(i));
		}

		return list;
	}

	// if (arq.isEmpty())
//			return arq; // start with recursion base case
//		LinkedList<Long> sorted; // this shall be the sorted list to return, no needd to initialise
//		LinkedList<Long> esquerda = new LinkedList<Long>(); // Vehicles smaller than pivot
//		LinkedList<Long> direita = new LinkedList<Long>(); // Vehicles greater than pivot
//		Long pivot = arq.get(0); // first Vehicle in list, used as pivot
//		int i;
//		Long j; // Variable used for Vehicles in the loop
//		
//		for (i = 1; i < arq.size(); i++) {
//			j = arq.get(i);
//			if (j.compareTo(pivot) < 0) // make sure Vehicle has proper compareTo method
//				esquerda.add(j);
//			else
//				direita.add(j);
//		}
//		esquerda = quickSort(esquerda); // capitalise 's'
//		direita = quickSort(direita); // sort both halfs recursively
//		esquerda.add(pivot); // add initial pivot to the end of the (now sorted) smaller Vehicles
//		esquerda.addAll(direita); // add the (now sorted) greater Vehicles to the smaller ones (now smaller is
//									// essentially your sorted list)
//		sorted = esquerda; // assign it to sorted; one could just as well do: return smaller
//
//		return sorted;
}
