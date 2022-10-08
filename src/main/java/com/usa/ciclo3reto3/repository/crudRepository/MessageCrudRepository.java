package com.usa.ciclo3reto3.repository.crudRepository;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
}
