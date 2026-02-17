package com.example.firstSpringProject.services;

import com.example.firstSpringProject.entity.Book;
import com.example.firstSpringProject.entity.Client;
import com.example.firstSpringProject.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;

//    public ClientService(ClientRepository clientRepository) {
//        this.clientRepository = clientRepository;
//    }

    public List<Client> findAll() {

        return clientRepository.findAll();
    }

    public Client add(Client client) {
        return clientRepository.save(client);
    }

    public String delete(int id) {
        if (clientRepository.existsById(id)) {
            Client client = clientRepository.findById(id).get();
            clientRepository.deleteById(id);
            return client.getName() + " deleted";
        }
        return "failed";
    }

    public String update(int id, Client client) {
        if (clientRepository.existsById(id)) {
            Client client1 = clientRepository.findById(id).get();
            client1.setName(client.getName());
            client1.setEmail(client.getEmail());
            client1.setPhone(client.getPhone());
            clientRepository.save(client1);
            return client1.getName()+" updated";
        }
        else
            return "id not found";
    }

    public Client findById(int id) {
        return clientRepository.findById(id).get();
    }
}
