package com.marija.einkaufsliste.repository;

import com.marija.einkaufsliste.model.Einkaufsliste;
import com.marija.einkaufsliste.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EinkaufslisteRepository extends CrudRepository<Einkaufsliste, Long> {
    List<Einkaufsliste> findAll();
    List<Einkaufsliste> findByItemListContaining(Item item);
}
