package com.usa.ciclo3reto3.controller;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Client;
import com.usa.ciclo3reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @GetMapping("/all")
    public List<Client> getClient(){
        return clientService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client p){
        return clientService.save(p);
    }


    @GetMapping ("/{id}")
    public Optional<Client> getClients(@PathVariable("id") int clientId) {
        return clientService.getClient(clientId);
    }

    @PostMapping ("update")
    public Client update(@RequestBody Client client){return clientService.update(client);}

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int clientId) {return clientService.delete(clientId);}



}
