package com.hotel.services;

import com.hotel.data.Client;
import com.hotel.data.ClientRepository;

public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client registerClient(String name, String lastName, Client.Gender gender) {
        Client client = new Client(name, lastName, gender);
        return clientRepository.save(client);
    }

    public Client findClientById(String id) {
        return clientRepository.findById(id);
    }
    
    public void updateClient(String id, String name, String lastName, Client.Gender gender) {
        Client client = clientRepository.findById(id);
        if(client != null) {
            client.setName(name);
            client.setLastName(lastName);
            client.setGender(gender);
            clientRepository.save(client);
        } else {
            // Handle client not found
        }
    }
    
    public void deleteClient(String id) {
        clientRepository.deleteById(id);
    }
}
