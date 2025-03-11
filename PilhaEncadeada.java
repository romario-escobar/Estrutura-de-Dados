class PilhaEncadeada {
    private Nodo topo;

    public PilhaEncadeada() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public void push(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        novoNodo.proximo = topo;
        topo = novoNodo;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        int valor = topo.dado;
        topo = topo.proximo;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return topo.dado;
    }

    public void imprimirPilha() {
        Nodo atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}
