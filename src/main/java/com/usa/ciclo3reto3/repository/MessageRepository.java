package com.usa.ciclo3reto3.repository;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Message;
import com.usa.ciclo3reto3.repository.crudRepository.CategoryCrudRepository;
import com.usa.ciclo3reto3.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getMessage(int id){
        return messageCrudRepository.findById(id);
    }
    public Message save(Message c){
        return messageCrudRepository.save(c);
    }
    public void delete(Message c){
        messageCrudRepository.delete(c);
    }

}
