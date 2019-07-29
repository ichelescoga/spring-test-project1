package com.javadevjournal.demoproject.com.javadevjournal.demoproject.service;

import com.javadevjournal.demoproject.com.javadevjournal.demoproject.model.Client;
import com.javadevjournal.demoproject.com.javadevjournal.demoproject.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }
}
