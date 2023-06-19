package com.hotel.datastructures;

public class BinaryTree<K extends Comparable<K>, V> {
    private BSTNode<K, V> root;

    public void insert(K key, V value) {
        this.root = this.insert(this.root, key, value);
    }

    private BSTNode<K, V> insert(BSTNode<K, V> node, K key, V value) {
        if (node == null) {
            return new BSTNode<K, V>(key, value);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = this.insert(node.left, key, value);
        } else if (cmp > 0) {
            node.right = this.insert(node.right, key, value);
        } else {
            node.value = value;
        }

        return node;
    }

    public V find(K key) {
        return find(root, key);
    }

    private V find(BSTNode<K, V> node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return find(node.left, key);
        } else if (cmp > 0) {
            return find(node.right, key);
        } else {
            return node.value;
        }
    }
}