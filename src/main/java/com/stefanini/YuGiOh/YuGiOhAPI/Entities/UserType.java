package com.stefanini.YuGiOh.YuGiOhAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

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
