package ex003;

public class TestaLista {
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		
		int[] numeros = {5, 10, 7, 25, 30, 7, 18, 20, 25, 1, 3, 8, 11, 7, 40};
		for (int num : numeros) {
			lista.adicionar(num);
		}
		
		lista.buscarPosicoes(7);
	}
}
 