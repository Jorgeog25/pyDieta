package utils;

import core.IData;

public class Node <T>{

    public T key;
    public Node<T> first, second, third, fourth, fifth;

    public Node(T key) {
        this.key = key;
        first = null;
        second = null;
        third = null;
        fourth = null;
        fifth = null;
    }

    public IData getValue() {
        return (IData) key;
    }
}
