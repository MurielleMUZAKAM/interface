package org.example;

public class Alimentaire extends Produit {
    private String dateFab;

    Alimentaire(String id, String nom, double prix, int quantite, String dateFab) {
        super(id, nom, prix, quantite, "Alimentaire");
        this.dateFab = dateFab;
    }

    // Getter and setter
    public String getDateFab() { return dateFab; }
    public void setDateFab(String dateFab) { this.dateFab = dateFab; }
}
