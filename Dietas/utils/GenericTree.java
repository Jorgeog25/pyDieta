package utils;

public class GenericTree<T> {
    private Node<T> root;

    public GenericTree() {
        root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> newRoot) {
        this.root = newRoot;
    }

    public void insert(int branch, Node<T> node) {
        switch (branch) {
            case 1:
                root.setFirst(node);
                break;
            case 2:
                root.setSecond(node);
                break;
            case 3:
                root.setThird(node);
                break;
            case 4:
                root.setFourth(node);
                break;
            case 5:
                root.setFifth(node);
                break;
            default:
                break;
        } 
    }

    public void delete(int branch) {
        switch (branch) {
            case 1:
                root.setFirst(null);
                break;
            case 2:
                root.setSecond(null);
                break;
            case 3:
                root.setThird(null);
                break;
            case 4:
                root.setFourth(null);
                break;
            case 5:
                root.setFifth(null);
                break;
            default:
                break;
        } 
    }
}