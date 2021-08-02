package Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id_User;

    @Column(name="name_User")
    private String name_User;

    @Column(name="login")
    private int login;

    @Column(name="cpf")
    private String cpf;

    @ManyToOne
    @Column(name="id_UT")
    private UserType userType;
}
