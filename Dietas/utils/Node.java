package utils;

public class Node <T>{

    T key;
    Node<T> first, second, third, fourth, fifth;

    public Node(T key) {
        this.key = key;
        first = null;
        second = null;
        third = null;
        fourth = null;
        fifth = null;
    }
}
