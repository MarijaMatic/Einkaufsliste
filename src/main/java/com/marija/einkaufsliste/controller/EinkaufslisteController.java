package com.marija.einkaufsliste.controller;

import com.marija.einkaufsliste.model.Einkaufsliste;
import com.marija.einkaufsliste.repository.EinkaufslisteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/einkaufslisten"})
public class EinkaufslisteController {

    private EinkaufslisteRepository einkaufslisteRepository;

    public EinkaufslisteController(EinkaufslisteRepository einkaufslisteRepository){
        this.einkaufslisteRepository = einkaufslisteRepository;
    }


    @GetMapping(value = "/getall")
    public ResponseEntity<List<Einkaufsliste>> findAll(){
        List<Einkaufsliste> allEinkaufslisten = einkaufslisteRepository.findAll();
        return new ResponseEntity<>(allEinkaufslisten, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Einkaufsliste> findById(@PathVariable Long id){
        Einkaufsliste einkaufslisteById = einkaufslisteRepository.findById(id).get();
        return new ResponseEntity<>(einkaufslisteById, HttpStatus.OK);
    }

    @PostMapping(value = "/createnew", consumes = "application/json")
    public ResponseEntity<Einkaufsliste> createEinkaufliste(@RequestBody Einkaufsliste einkaufsliste){
        einkaufslisteRepository.save(einkaufsliste);
        return new ResponseEntity<>(einkaufsliste, HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteEinkaufsliste(@PathVariable Long id){
        einkaufslisteRepository.delete(einkaufslisteRepository.findById(id).get());
        return new ResponseEntity<>("Einkaufsliste " + id +" deleted", HttpStatus.ACCEPTED);
    }


}
