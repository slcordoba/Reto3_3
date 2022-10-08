package com.usa.ciclo3reto3.controller;

import com.usa.ciclo3reto3.entities.Category;
import com.usa.ciclo3reto3.entities.Message;
import com.usa.ciclo3reto3.entities.Reservation;
import com.usa.ciclo3reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getReservation(){
        return reservationService.getAll();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation p){
        return reservationService.save(p);
    }

    @GetMapping ("/{id}")
    public Optional<Reservation> getReservations(@PathVariable("id") int reservationId) {
        return reservationService.getReservation(reservationId);
    }

    @PostMapping ("update")
    public Reservation update(@RequestBody Reservation reservation){return reservationService.update(reservation);}

    @DeleteMapping("/{id}")
    public boolean delete (@PathVariable("id") int reservationId) {return reservationService.delete(reservationId);}



}
