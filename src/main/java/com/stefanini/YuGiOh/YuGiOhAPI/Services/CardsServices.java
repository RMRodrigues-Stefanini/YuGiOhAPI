package com.stefanini.YuGiOh.YuGiOhAPI.Services;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.CardsRepository;
import com.sun.istack.NotNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardsServices {

    @Autowired
    CardsRepository cardsRepository;

    public List<Cards> findAll() {return cardsRepository.findAll();}

    public Cards findById(Long id){ return checkId (id);}

    public Cards save(Cards cards) { return (Cards) cardsRepository.save(cards);}

    public Cards update (@NotNull Cards cards){
        checkId((long) cards.getId_Card());
        return (Cards) cardsRepository.save(cards);
    }

    public void deleteById(Long id){ cardsRepository.deleteById(id);}

    public void delete (Cards cards){
        cardsRepository.delete(cards);
    }



    @SneakyThrows
    private Cards checkId(Long id){
        return (Cards) cardsRepository.findById(id).
                orElseThrow(()->new RuntimeException("Id not found"));
    }
}
