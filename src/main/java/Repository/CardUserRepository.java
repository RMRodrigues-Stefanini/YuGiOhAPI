package Repository;

import Entities.CardUser;
import Entities.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardUserRepository extends JpaRepository<CardUser,Long> {
}
