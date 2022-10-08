package com.usa.ciclo3reto3.repository.crudRepository;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
}
