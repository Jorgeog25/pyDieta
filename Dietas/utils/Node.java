package utils;


public class Node <T>{

    T key;
    private Node<T> first, second, third, fourth, fifth;

    public Node(T key) {
        this.key = key;
        first = null;
        second = null;
        third = null;
        fourth = null;
        fifth = null;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T newKey) {
        this.key = newKey;
    }

    public void setFirst(Node<T> node) {
        this.first = node;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setSecond(Node<T> second) {
        this.second = second;
    }

    public Node<T> getSecond() {
        return second;
    }

    public void setThird(Node<T> third) {
        this.third = third;
    }

    public Node<T> getThird() {
        return third;
    }

    public void setFourth(Node<T> fourth) {
        this.fourth = fourth;
    }

    public Node<T> getFourth() {
        return fourth;
    }

    public void setFifth(Node<T> fifth) {
        this.fifth = fifth;
    }

    public Node<T> getFifth() {
        return fifth;
    }
}
