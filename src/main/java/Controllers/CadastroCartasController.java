package Controllers;

import Entities.Cards;
import Repository.CardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CadastroCartasController {

    @Autowired
    private CardsRepository cardsRepository;


    @PostMapping
    public ResponseEntity<Cards> createCards(@RequestBody Cards cards) {
        try {
            Cards _cards = cardsRepository
                    .save(new Cards(cards.getId_Card(), cards.getName_Card(), cards.getAtk(), cards.getDef(), cards.getImg(), cards.getCardType()));
            return new ResponseEntity<>(_cards, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            cardsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Cards> updateCards(@RequestBody Cards cards) {
        try {
            Cards _cards = cardsRepository
                    .save(new Cards(cards.getId_Card(), cards.getName_Card(), cards.getAtk(), cards.getDef(), cards.getImg(), cards.getCardType()));
            return new ResponseEntity<>(_cards, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
