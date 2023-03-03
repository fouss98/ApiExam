package com.fouss.api.repository;


import com.fouss.api.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategorieRepp extends JpaRepository<Categorie, Long> {
    void deleteCategById(Long id);

    Optional<Categorie> findCategById(Long id);
}
