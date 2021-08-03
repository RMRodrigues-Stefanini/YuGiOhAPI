package com.stefanini.YuGiOh.YuGiOhAPI.Repository;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends JpaRepository<Cards,Long> {
}
