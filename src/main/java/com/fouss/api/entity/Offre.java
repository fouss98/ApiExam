package com.fouss.api.entity;




import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "offres")
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    public Offre(){

    }

    public Offre(Long id,
                       String titre,
                       String description,
                       Categorie categorie) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.categorie = categorie;

    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

