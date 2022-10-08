package com.usa.ciclo3reto3.controller;

import com.usa.ciclo3reto3.entities.Cloud;
import com.usa.ciclo3reto3.entities.Message;
import com.usa.ciclo3reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageService messageService;
    @GetMapping("/all")
    public List<Message> getMessage(){
        return messageService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message p){
        return messageService.save(p);
    }


    @GetMapping ("/{id}")
    public Optional<Message> getMessages(@PathVariable("id") int messageId) {
        return messageService.getMessage(messageId);
    }

    @PostMapping ("update")
    public Message update(@RequestBody Message message){return messageService.update(message);}

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int messageId) {return messageService.delete(messageId);}


}
