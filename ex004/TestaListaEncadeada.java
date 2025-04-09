package ex004;

import java.util.Scanner;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("\n=== MENU LISTA ENCADEADA ===");
			System.out.println("1 - Adicionar professor");
			System.out.println("2 - Listar professores");
			System.out.println("3 - Verificar tamanho da lista");
			System.out.println("4 - Verificar se lista está vazia");
			System.out.println("5 - Apagar lista");
			System.out.println("6 - Remover professor por ID");
			System.out.println("7 - Buscar professor por ID (recursivo)");
			System.out.println("8 - Adicionar professores de teste");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1: {
				System.out.println("Digite o ID do professor: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o nome do professor: ");
				String nome = sc.nextLine();
				listaEncadeada.adicionar(new Professor(id, nome));
				System.out.println("Professor adicionado com sucesso!");
				break;
			}
			case 2:
				listaEncadeada.resetarIteracao();
				System.out.println("\n--- Lista de Professores ---");
				while (listaEncadeada.temProximo()) {
					Professor p = listaEncadeada.getPosicaoAtual().getValor();
					System.out.println("ID: " + p.getId() + " | Nome: " + p.getNome());
				}
				break;

			case 3:
				System.out.println("Tamanho da lista: " + listaEncadeada.verificarTamanho());
				break;

			case 4:
				System.out.println("A lista está vazia? " + listaEncadeada.verificarVazia());
				break;

			case 5:
				listaEncadeada.apagarLista();
				System.out.println("Lista apagada com sucesso.");
				break;

			case 6:
				System.out.print("Digite o ID do professor que deseja remover: ");
				int idRemover = sc.nextInt();
				boolean removido = listaEncadeada.remover(idRemover);
				if (removido) {
					System.out.println("Professor removido com sucesso.");
				} else {
					System.out.println("Professor não encontrado.");
				}
				break;

			case 7:
				System.out.print("Digite o ID do professor que deseja buscar: ");
				int idBuscar = sc.nextInt();
				Professor encontrado = listaEncadeada.buscarRecursivo(idBuscar);
				if (encontrado != null) {
					System.out.println("Professor encontrado: " + encontrado.getNome());
				} else {
					System.out.println("Professor não encontrado.");
				}
				break;
			case 8:
				listaEncadeada.adicionar(new Professor(1, "Marcos Antônio"));
				listaEncadeada.adicionar(new Professor(2, "Angela"));
				listaEncadeada.adicionar(new Professor(3, "Glaucia"));
				System.out.println("Professores de teste adicionados!");
				break;

			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);

		sc.close();
	}
}