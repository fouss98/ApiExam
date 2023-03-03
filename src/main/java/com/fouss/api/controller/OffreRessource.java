package com.fouss.api.controller;
/*

import com.fouss.api.entity.Offre;
import com.fouss.api.service.offreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OffreRessource {
    private final offreService offreService;

    public OffreRessource(offreService offreService) {
        this.offreService = offreService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Offre>> getAllCvs () {
        List<Offre> offres = offreService.findAllOff();
        return new ResponseEntity<>(offres, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Offre> getCvById (@PathVariable("id") Long id) {
        Offre offre = offreService.findOffById(id);
        return new ResponseEntity<>(offre, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Offre> addCv(@RequestBody Offre offre) {
        Offre newOff = offreService.addOff(offre);
        return new ResponseEntity<>(newOff, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Offre> updatecv(@RequestBody Offre offre) {
        Offre updateOff = offreService.updateOff(offre);
        return new ResponseEntity<>(updateOff, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCv(@PathVariable("id") Long id) {
        offreService.deleteOff(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
*/