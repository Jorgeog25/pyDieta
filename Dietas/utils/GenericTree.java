package utils;

public class GenericTree<T> {

    public Node<T> root;

    public GenericTree() {
        root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void insertNode(Node<T> node, T key, int branch, int position) {
        switch (branch) {
            case 0:
                switch (position) {
                    case 0:
                        root = new Node<>(key);
                        break;
                }
                break;
            case 1:
                switch (position) {
                    case 0:
                        node.first = new Node<>(key);
                        break;
                    case 1:
                        node.first.first = new Node<>(key);
                        break;
                    case 2:
                        node.first.second = new Node<>(key);
                        break;
                    case 3:
                        node.first.third = new Node<>(key);
                        break;
                    case 4:
                        node.first.fourth = new Node<>(key);
                        break;
                    case 5:
                        node.first.fifth = new Node<>(key);
                        break;
                }
            case 2:
                switch (position) {
                    case 0:
                        node.second = new Node<>(key);
                        break;
                    case 1:
                        node.second.first = new Node<>(key);
                        break;
                    case 2:
                        node.second.second = new Node<>(key);
                        break;
                    case 3:
                        node.second.third = new Node<>(key);
                        break;
                    case 4:
                        node.second.fourth = new Node<>(key);
                        break;
                    case 5:
                        node.second.fifth = new Node<>(key);
                        break;
                }
            case 3:
                switch (position) {
                    case 0:
                        node.third = new Node<>(key);
                        break;
                    case 1:
                        node.third.first = new Node<>(key);
                        break;
                    case 2:
                        node.third.second = new Node<>(key);
                        break;
                    case 3:
                        node.third.third = new Node<>(key);
                        break;
                    case 4:
                        node.third.fourth = new Node<>(key);
                        break;
                    case 5:
                        node.third.fifth = new Node<>(key);
                        break;
                }
            case 4:
                switch (position) {
                    case 0:
                        node.fourth = new Node<>(key);
                        break;
                    case 1:
                        node.fourth.first = new Node<>(key);
                        break;
                    case 2:
                        node.fourth.second = new Node<>(key);
                        break;
                    case 3:
                        node.fourth.third = new Node<>(key);
                        break;
                    case 4:
                        node.fourth.fourth = new Node<>(key);
                        break;
                    case 5:
                        node.fourth.fifth = new Node<>(key);
                        break;
                }
            case 5:
                switch (position) {
                    case 0:
                        node.fifth = new Node<>(key);
                        break;
                    case 1:
                        node.fifth.first = new Node<>(key);
                        break;
                    case 2:
                        node.fifth.second = new Node<>(key);
                        break;
                    case 3:
                        node.fifth.third = new Node<>(key);
                        break;
                    case 4:
                        node.fifth.fourth = new Node<>(key);
                        break;
                    case 5:
                        node.fifth.fifth = new Node<>(key);
                        break;
                }
                break;
        }

    }
}