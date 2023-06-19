package com.hotel.datastructures;

public class BSTNode<K extends Comparable<K>, V> {
    K key;
    V value;
    BSTNode<K, V> left;
    BSTNode<K, V> right;

    public BSTNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
