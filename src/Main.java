public class Main {
    public static void main(String[] args){
        ArvoreBinaria arvore = new ArvoreBinaria();
        // Adicionando valores à árvore
        arvore.adicionar(5);
        arvore.adicionar(3);
        arvore.adicionar(8);
        arvore.adicionar(2);
        arvore.adicionar(4);
        arvore.adicionar(7);
        arvore.adicionar(9);

        // Percorrendo a árvore em ordem
        System.out.println("Percorrendo em ordem:");
        arvore.percorrer();

        // Percorrendo a árvore em pré-ordem
        System.out.println("\nPercorrendo em pré-ordem:");
        arvore.percorrerPreOrdem();

        // Percorrendo a árvore em pós-ordem
        System.out.println("\nPercorrendo em pós-ordem:");
        arvore.percorrerPosOrdem();

        // Mostrando a árvore
        System.out.println("\nÁrvore Binária:");
        arvore.mostrarArvore();

        // Removendo um valor da árvore
        arvore.remover(3);

        // Mostrando a árvore após a remoção
        System.out.println("\nÁrvore Binária após remoção:");
        arvore.mostrarArvore();

    }
}