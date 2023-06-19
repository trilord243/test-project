package com.hotel.data;

public class ClientRepository {
    private Node first = null;

    private class Node {
        Client client;
        Node next;

        Node(Client client) {
            this.client = client;
        }
    }

    public Client save(Client client) {
        Node newNode = new Node(client);

        if (first == null) {
            first = newNode;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        return client;
    }

    public Client findById(String id) {
        Node current = first;
        while (current != null) {
            if (current.client.getId().equals(id)) {
                return current.client;
            }
            current = current.next;
        }

        return null; // Retorna null si no encuentra el cliente
    }

    public void deleteById(String id) {
        if (first == null) {
            return; // Lista está vacía, no hay nada para eliminar
        }

        // Si el primer cliente es el que se quiere eliminar
        if (first.client.getId().equals(id)) {
            first = first.next;
            return;
        }

        Node current = first;
        while (current.next != null) {
            if (current.next.client.getId().equals(id)) {
                current.next = current.next.next; // El cliente a eliminar se "salta"
                return;
            }
            current = current.next;
        }
    }
}
