package ex002;

import java.util.Scanner;

public class TestaLista {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==================== MENU ====================");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Pesquisar aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Ordenar alunos (A-Z)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe o ID do aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // limpar buffer

                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    Aluno novoAluno = new Aluno(id, nome);
                    listaEncadeada.adicionar(novoAluno);
                    System.out.println("Aluno adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Informe o ID do aluno que deseja remover: ");
                    int idRemover = sc.nextInt();

                    boolean removido = listaEncadeada.remover(idRemover);
                    if (removido) {
                        System.out.println("Aluno removido com sucesso.");
                    } else {
                        System.out.println("Aluno com esse ID não foi encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Informe o nome do aluno que deseja buscar: ");
                    String nomeBusca = sc.nextLine();

                    Aluno encontrado = listaEncadeada.pesquisar(nomeBusca);
                    if (encontrado != null) {
                        System.out.println("Aluno encontrado: " + encontrado.getId() + " - " + encontrado.getNome());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Listando todos os alunos:");
                    listaEncadeada.listar();
                    break;

                case 5:
                    listaEncadeada.ordenar();
                    System.out.println("Lista ordenada com sucesso!");
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}