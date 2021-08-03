package com.stefanini.YuGiOh.YuGiOhAPI.Controllers;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Decks;
import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Users;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.CardsRepository;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.DecksRepository;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BancoCartasController {

    UsersRepository usersRepository;

    @Autowired
    CardsRepository cardsRepository;

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<Users> getUsersById(@PathVariable("id") long id) {
        Optional<Users> usersData = usersRepository.findById(id);

        return usersData.map(users -> new ResponseEntity<>(users, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @GetMapping(value = "/card/{id}")
    public ResponseEntity<Cards> getCardById(@PathVariable("id") long id) {
        Optional<Cards> cardsData = cardsRepository.findById(id);

        return cardsData.map(cards -> new ResponseEntity<>(cards, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}