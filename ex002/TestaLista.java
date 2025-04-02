package ex002;

public class TestaLista {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        // Criando alunos corretamente
        lista.adicionar(new Aluno("Carlos"));
        lista.adicionar(new Aluno("Ana"));
        lista.adicionar(new Aluno("João"));

        System.out.println("Antes de ordenar:");
        lista.listar(); // Deve exibir: Carlos, Ana, João (fora de ordem)

        lista.ordenar(); // Chama a ordenação

        System.out.println("Depois de ordenar:");
        lista.listar(); // Deve exibir: Ana, Carlos, João (ordenado)
    }
}

