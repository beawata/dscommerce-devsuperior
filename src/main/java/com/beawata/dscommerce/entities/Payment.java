package com.beawata.dscommerce.entities;

import jakarta.persistence.*;

import java.time.Instant;


@Entity
@Table(name = "tb_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @OneToOne
    @MapsId
    private Order order;

    public Payment() {
    }

    public Payment(Long id, Order oder, Instant moment) {
        this.id = id;
        this.order = oder;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Order getOder() {
        return order;
    }

    public void setOder(Order oder) {
        this.order = oder;
    }
}
