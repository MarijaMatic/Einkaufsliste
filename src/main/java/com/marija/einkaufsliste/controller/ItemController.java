package com.marija.einkaufsliste.controller;

import com.marija.einkaufsliste.model.Einkaufsliste;
import com.marija.einkaufsliste.model.Item;
import com.marija.einkaufsliste.repository.EinkaufslisteRepository;
import com.marija.einkaufsliste.repository.ItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping({"/items"})
public class ItemController {

    private ItemRepository itemRepository;
    private EinkaufslisteRepository einkaufslisteRepository;

    @GetMapping(value = "/findall")
    public ResponseEntity<List<Item>> findAll() {
        List<Item> all = itemRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Item> findById(@PathVariable Long id) {
        Item item = itemRepository.findById(id).get();
        return new ResponseEntity<>(item, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        Item item = itemRepository.findById(id).get();
        List<Einkaufsliste> einkaufslistes = einkaufslisteRepository.findByItemListContaining(item);
        einkaufslistes.forEach(einkaufsliste -> einkaufsliste.getItemList().remove(item));
        itemRepository.delete(item);
        return new ResponseEntity<>("Item successfully deleted", HttpStatus.ACCEPTED);
    }
}
