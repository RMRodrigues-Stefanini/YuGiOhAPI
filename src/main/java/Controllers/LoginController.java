package Controllers;

import Entities.Users;
import Repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

    @Autowired
    private UsersRepository usersRepository;


    @PostMapping
    public ResponseEntity<Users> createUsers(@RequestBody Users users) {
        try {
            Users _users = usersRepository
                    .save(new Users(users.getId_User(), users.getName_User(), users.getLogin(), users.getCpf(), users.getUserType()));
            return new ResponseEntity<>(_users, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        try {
            usersRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<Users> updateUsers(@RequestBody Users users) {
        try {
            Users _users = usersRepository
                    .save(new Users(users.getId_User(), users.getName_User(), users.getLogin(), users.getCpf(), users.getUserType()));
            return new ResponseEntity<>(_users, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
