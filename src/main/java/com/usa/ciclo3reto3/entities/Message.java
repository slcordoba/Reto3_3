package com.usa.ciclo3reto3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;


    @ManyToOne
    @JoinColumn(name = "cloudId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Cloud cloud;
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;


/*
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "message")
    @JsonIgnoreProperties({"message"})
    private List<Reservation> reservations;
*/
/*
    @ManyToOne
    @JoinColumn(name = "cloudId")
    @JsonIgnoreProperties("messages")
    private Cloud cloud;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties("messages")
    private Client client;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "message")
    @JsonIgnoreProperties("message")
    private List<Reservation> reservations;
*/

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Cloud getCloud() {
        return cloud;
    }

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
