package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@Table(name = "Card_Type")
public class CardType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_CT;

    @Column(name="name_CT")
    private String name_CT;
}
