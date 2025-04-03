package ex002;

public class TestaLista {
    public static void main(String[] args) {
        ListaEncadeada listaEncadeada = new ListaEncadeada();
        
        // Criando alunos corretamente
        addAluno(listaEncadeada);
        System.out.println("Todos os alunos foram adicionados");
       
        
        System.out.println("Antes de ordenar:");
        listaEncadeada.listar(); // Deve exibir: Carlos, Ana, João (fora de ordem)

        listaEncadeada.ordenar(); // Chama a ordenação

        System.out.println("Depois de ordenar:");
        listaEncadeada.listar(); // Deve exibir: Ana, Carlos, João (ordenado)
        
        boolean removido = listaEncadeada.remover(3);
    }
    
    public static void addAluno(ListaEncadeada listaEncadeada) {
    	Aluno aluno1 = new Aluno(1, "Carlos");
    	Aluno aluno2 = new Aluno(2, "Jorge");
    	Aluno aluno3 = new Aluno(3, "Lucas");
    	Aluno aluno4 = new Aluno(4, "Francisco");
    	
    	listaEncadeada.adicionar(aluno1);
    	listaEncadeada.adicionar(aluno2);
    	listaEncadeada.adicionar(aluno3);
    	listaEncadeada.adicionar(aluno4);
    }
}

