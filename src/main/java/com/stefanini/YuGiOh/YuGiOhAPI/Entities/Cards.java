package com.stefanini.YuGiOh.YuGiOhAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Cards")
public class Cards {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_Card;

    @Column(name="name_Card")
    private String name_Card;

    @Column(name="atk")
    private int atk;

    @Column(name="def")
    private int def;

    @Column(name="img")
    private String img;

    @ManyToOne
    private CardType cardType;
}
