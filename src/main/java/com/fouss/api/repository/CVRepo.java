package com.fouss.api.repository;

import com.fouss.api.entity.CV;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface CVRepo extends JpaRepository<CV, Long> {
    void deleteCvById(Long id);

    Optional<CV> findCvById(Long id);
}
