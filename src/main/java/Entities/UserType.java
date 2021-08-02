package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "User_Type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_UT;

    @Column(name="name_UT")
    private String name_UT;
}
