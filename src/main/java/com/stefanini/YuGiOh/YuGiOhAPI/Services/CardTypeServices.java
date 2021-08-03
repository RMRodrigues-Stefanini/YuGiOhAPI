package com.stefanini.YuGiOh.YuGiOhAPI.Services;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.CardType;
import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.CardTypeRepository;
import com.sun.istack.NotNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CardTypeServices {

    @Autowired
    CardTypeRepository cardTypeRepository;

    public List<CardType> findAll() {return cardTypeRepository.findAll();}

    public CardType findById(Long id){ return checkId (id);}

    public CardType save(CardType cardType) { return (CardType) cardTypeRepository.save(cardType);}

    public CardType update (@NotNull CardType cardType){
        checkId((long) cardType.getId_CT());
        return (CardType) cardTypeRepository.save(cardType);
    }

    public void deleteById(Long id){ cardTypeRepository.deleteById(id);}

    public void delete (CardType cardType){
        cardTypeRepository.delete(cardType);
    }



    @SneakyThrows
    private CardType checkId(Long id){
        return (CardType) cardTypeRepository.findById(id).
                orElseThrow(()->new RuntimeException("Id not found"));
    }
}
