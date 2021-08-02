package Repository;

import Entities.Cards;
import Entities.Decks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecksRepository extends JpaRepository <Decks,Long>{
}
