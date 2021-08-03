package com.stefanini.YuGiOh.YuGiOhAPI.Services;

import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Cards;
import com.stefanini.YuGiOh.YuGiOhAPI.Entities.Decks;
import com.stefanini.YuGiOh.YuGiOhAPI.Repository.DecksRepository;
import com.sun.istack.NotNull;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DecksServices {

    @Autowired
    DecksRepository decksRepository;

    public List<Decks> findAll() {return decksRepository.findAll();}

    public Decks findById(Long id){ return checkId (id);}

    public Decks save(Decks decks) { return (Decks) decksRepository.save(decks);}

    public Decks update (@NotNull Decks decks){
        checkId((long) decks.getId_Deck());
        return (Decks) decksRepository.save(decks);
    }

    public void deleteById(Long id){ decksRepository.deleteById(id);}

    public void delete (Decks decks){
        decksRepository.delete(decks);
    }


    @SneakyThrows
    private Decks checkId(Long id){
        return (Decks) decksRepository.findById(id).
                orElseThrow(()->new RuntimeException("Id not found"));
    }
}
