package ex005;

import java.util.Scanner;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n=== MENU LISTA DE NÚMEROS ===");
			System.out.println("1 - Adicionar número no início");
			System.out.println("2 - Adicionar número no fim");
			System.out.println("3 - Listar números");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite um número: ");
				int valorInicio = sc.nextInt();
				lista.adicionarNoInicio(valorInicio);
				break;

			case 2:
				System.out.print("Digite um número: ");
				int valorFim = sc.nextInt();
				lista.adicionarNoFim(valorFim);
				break;

			case 3:
				lista.resetarIteracao();
				System.out.print("Números na lista: ");
				while (lista.temProximo()) {
					int n = lista.getPosicaoAtual().getValor();
					System.out.print(n + " ");
				}
				System.out.println();
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		sc.close();
	}
}
