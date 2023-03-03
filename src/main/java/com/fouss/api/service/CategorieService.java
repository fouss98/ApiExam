package com.fouss.api.service;



import com.fouss.api.entity.CV;
import com.fouss.api.entity.Categorie;
import com.fouss.api.exception.UserNotFoundException;
import com.fouss.api.repository.CategorieRepp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategorieService {
    private final CategorieRepp ctegRepo;

    @Autowired
    public CategorieService(CategorieRepp ctegRepo) {
        this.ctegRepo = ctegRepo;
    }
    public Categorie addCategorie(Categorie categorie) {

        return ctegRepo.save(categorie);
    }

    public List<Categorie> findAllCategorie() {
        return ctegRepo.findAll();
    }

    public Categorie updateCv(Categorie categorie) {
        return ctegRepo.save(categorie);
    }

    public Categorie findcvById(Long id) {
        return ctegRepo.findCategById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteCategori(Long id){
        ctegRepo.deleteCategById(id);
    }
}
