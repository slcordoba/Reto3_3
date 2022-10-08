package com.usa.ciclo3reto3.controller;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Client;
import com.usa.ciclo3reto3.entities.Cloud;
import com.usa.ciclo3reto3.service.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin(origins = "*")
public class CloudController {

    @Autowired
    private CloudService cloudService;
    @GetMapping("/all")
    public List<Cloud> getCloud(){
        return cloudService.getAll();
    }
    @PostMapping("/save")
    //@ResponseStatus(HttpStatus.CREATED)
    public Cloud save(@RequestBody Cloud p){
        return cloudService.save(p);
    }

    @GetMapping ("/{id}")
    public Optional<Cloud> getClouds(@PathVariable("id") int cloudId) {
        return cloudService.getCloud(cloudId);
    }

    @PostMapping ("update")
    public Cloud update(@RequestBody Cloud cloud){return cloudService.update(cloud);}

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int cloudId) {return cloudService.delete(cloudId);}


}
