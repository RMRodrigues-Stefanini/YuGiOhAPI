package com.stefanini.YuGiOh.YuGiOhAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name = "Card_User")
public class CardUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_Card_User;


    @ManyToOne
    private Users users;


    @ManyToOne
    private Cards cards;
}
