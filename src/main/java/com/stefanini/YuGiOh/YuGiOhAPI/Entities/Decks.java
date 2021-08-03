package com.stefanini.YuGiOh.YuGiOhAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name = "Decks")
public class Decks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_Deck;


    @ManyToOne
    private CardUser cardUser;

    @Column(name="deck_Number")
    private int deck_Number;
}
