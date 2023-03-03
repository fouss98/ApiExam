package com.fouss.api.service;

/*
import com.fouss.api.entity.Offre;
import com.fouss.api.exception.UserNotFoundException;

import com.fouss.api.repository.offreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class offreService {

    private final offreRepo offreRepo;

    @Autowired
    public offreService(offreRepo offreRepo) {
        this.offreRepo = offreRepo;
    }

    public Offre addOff(Offre offre) {

        return offreRepo.save(offre);
    }

    public List<Offre> findAllOff() {
        return offreRepo.findAll();
    }

    public Offre updateOff(Offre offre) {
        return offreRepo.save(offre);
    }

    public Offre findOffById(Long id) {
        return offreRepo.findoffreById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteOff(Long id){
        offreRepo.deleteOffreById(id);
    }
}
*/