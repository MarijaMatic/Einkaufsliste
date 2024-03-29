package com.marija.einkaufsliste.repository;

import com.marija.einkaufsliste.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findAll();
}
