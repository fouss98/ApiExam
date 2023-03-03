package com.fouss.api.service;

import com.fouss.api.entity.CV;
import com.fouss.api.exception.UserNotFoundException;
import com.fouss.api.repository.CVRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CvService {
    private final CVRepo cvRepo;

    @Autowired
    public CvService(CVRepo cvRepo) {
        this.cvRepo = cvRepo;
    }


    public CV addCv(CV cv) {
        //cv.setEmployeeCode(UUID.randomUUID().toString());
        return cvRepo.save(cv);
    }

    public List<CV> findAllCv() {
        return cvRepo.findAll();
    }

    public CV updateCv(CV cv) {
        return cvRepo.save(cv);
    }

    public CV findcvById(Long id) {
        return cvRepo.findCvById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteCv(Long id){
        cvRepo.deleteCvById(id);
    }
}
