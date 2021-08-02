package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name = "Card_User")
public class CardUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_Card_User;

    @Column(name="id_User")
    @ManyToOne
    private Users users;

    @Column(name="id_Card")
    @ManyToOne
    private Cards cards;
}
