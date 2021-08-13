import javax.swing.JOptionPane;

public class EntendendoVetores {

	public static void main (String[]args) {
		int [] vetorA = new int[100]; // Forma 1
		int vetorB[] = new int[30]; // Forma 2
		int vetorC[] = {1,2,3,4,5,6,7,8,9,10,11};		// Forma 3 sem tamanho/dimensão, mas com os valores
		
		
		vetorA[0] = 50 ; // Atribuiu 50 na posiçao/indice 0 do vetorA
		vetorA[1] = 99 ; // Atribuiu 99 na posiçao/indice 1 do vetorA
		System.out.println(vetorA[0]);
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog( i + " Indique um valor: "));
		}
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		System.out.println("o tamanho do vetor é " + vetorA.length);
	}
}
