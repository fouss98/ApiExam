package com.fouss.api.entity;




import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    @OneToMany(mappedBy = "categorie")
    private List<Offre> offres;

    public  Categorie(){

    }

    public Categorie(Long id,
                           String libelle,
                           List<Offre> offres) {
        this.id = id;
        this.libelle = libelle;
        this.offres = offres;
    }

    public List<Offre> getOffres() {
        return offres;
    }

    public void setOffres(List<Offre> offres) {
        this.offres = offres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
