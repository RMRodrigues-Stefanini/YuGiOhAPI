package Controllers;

import Entities.Cards;
import Entities.Decks;
import Entities.Users;
import Repository.CardsRepository;
import Repository.DecksRepository;
import Repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BancoCartasController {

    @Autowired
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