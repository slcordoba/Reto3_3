package com.usa.ciclo3reto3.repository;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Cloud;
import com.usa.ciclo3reto3.repository.crudRepository.CloudCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CloudRepository {
    @Autowired
    private CloudCrudRepository cloudCrudRepository;

    public List<Cloud> getAll(){
        return (List<Cloud>) cloudCrudRepository.findAll();
    }

    public Optional<Cloud> getCloud(int id){
        return cloudCrudRepository.findById(id);
    }
    public Cloud save(Cloud c){
        return cloudCrudRepository.save(c);
    }
    public void delete(Cloud c){
        cloudCrudRepository.delete(c);
    }

}
