import java.util.Stack;

public class PilhaJavaUtil {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        System.out.println("Elemento no topo: " + pilha.peek());
        System.out.println("Removido: " + pilha.pop());
        System.out.println("Pilha atual: " + pilha);
    }
}
