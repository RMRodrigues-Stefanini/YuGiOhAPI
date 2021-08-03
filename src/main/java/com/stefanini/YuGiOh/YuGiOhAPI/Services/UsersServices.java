package com.stefanini.YuGiOh.YuGiOhAPI.Services;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Users;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.UsersRepository;
import com.sun.istack.NotNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsersServices {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> findAll() {return usersRepository.findAll();}

    public Users findById(Long id){ return checkId (id);}

    public Users save(Users users) { return (Users) usersRepository.save(users);}

    public Users update (@NotNull Users users){
        checkId((long) users.getId_User());
        return (Users) usersRepository.save(users);
    }

    public void deleteById(Long id){ usersRepository.deleteById(id);}

    public void delete (Users users){
        usersRepository.delete(users);
    }



    @SneakyThrows
    private Users checkId(Long id){
        return (Users) usersRepository.findById(id).
                orElseThrow(()->new RuntimeException("Id not found"));
    }
}
