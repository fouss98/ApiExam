package com.fouss.api.controller;

import com.fouss.api.entity.CV;
import com.fouss.api.service.CvService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:8285")
@RequestMapping("/cv")
public class CvResource {
    private final CvService cvService;

    public CvResource(CvService cvService) {
        this.cvService = cvService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<CV>> getAllCvs () {
        List<CV> cvs = cvService.findAllCv();
        return new ResponseEntity<>(cvs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<CV> getCvById (@PathVariable("id") Long id) {
        CV cv = cvService.findcvById(id);
        return new ResponseEntity<>(cv, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<CV> addCv(@RequestBody CV cv) {
        CV newCv = cvService.addCv(cv);
        return new ResponseEntity<>(newCv, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<CV> updatecv(@RequestBody CV cv) {
        CV updateCv = cvService.updateCv(cv);
        return new ResponseEntity<>(updateCv, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCv(@PathVariable("id") Long id) {
        cvService.deleteCv(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
