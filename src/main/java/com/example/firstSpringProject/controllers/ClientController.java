package com.example.firstSpringProject.controllers;

import com.example.firstSpringProject.entity.Book;
import com.example.firstSpringProject.entity.Client;
import com.example.firstSpringProject.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ClientController {
    private final ClientService clientService;

//    public ClientController(ClientService clientService) {
//        this.clientService = clientService;
//    }

    @GetMapping("/client/")
    public List<Client> findAll()
    {
        return clientService.findAll();
    }

    @PostMapping("/add")
    public Client add(@RequestBody Client client) {
        clientService.add(client);
        return client;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        return  clientService.delete(id);
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable int id, @RequestBody Client client){
        return clientService.update(id, client);
    }

    @GetMapping("/client/{id}")
    public Client findById(@PathVariable int id) {
        return clientService.findById(id);
    }
}
