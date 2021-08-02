package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name = "Decks")
public class Decks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
       private int  id_Deck;

    @Column(name="id_Card_User")
    @ManyToOne
    private CardUser cardUser;

    @Column(name="deck_Number")
    private int deck_Number;
}
