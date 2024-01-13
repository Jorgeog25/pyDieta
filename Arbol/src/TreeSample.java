package Arbol.src;

public class TreeSample {

    public static void main(String[] args) {
        Tree tree = new Tree();
        fillTree(tree);

        System.out.println("Arbol rellenado");

        tree.printTree(tree.root);

        System.out.println("Arbol impreso");



    }

    private static void fillTree(Tree tree){
        String paciente = "Paciente";
        String dia1 = "Dia 1";
        String dia2 = "Dia 2";
        String dia3 = "Dia 3";
        String dia4 = "Dia 4";
        String dia5 = "Dia 5";
        String ingesta1 = "Desayuno";
        String ingesta2 = "Almuerzo";
        String ingesta3 = "Comida";
        String ingesta4 = "Merienda";
        String ingesta5 = "Cena";

        tree.insertNode(tree.root, paciente, 0, 0);
        tree.insertNode(tree.root, dia1, 1, 0);
        tree.insertNode(tree.root, dia2, 2, 0);
        tree.insertNode(tree.root, dia3, 3, 0);
        tree.insertNode(tree.root, dia4, 4, 0);
        tree.insertNode(tree.root, dia5, 5, 0);

        tree.insertNode(tree.root, ingesta1, 1, 1);
        tree.insertNode(tree.root, ingesta2, 1, 2);
        tree.insertNode(tree.root, ingesta3, 1, 3);
        tree.insertNode(tree.root, ingesta4, 1, 4);
        tree.insertNode(tree.root, ingesta5, 1, 5);
    }


    
}
