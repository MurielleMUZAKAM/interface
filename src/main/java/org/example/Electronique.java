package org.example;

public class Electronique extends Produit {
    private String marque;
    private String couleur;

    public Electronique(String id, String nom, double prix, int quantite, String marque) {
        super(id, nom, prix, quantite, "Electronique");
        this.marque = marque;
        this.couleur = couleur;
    }

    // Getters and setters
    public String getMarque() { return marque; }
    public void setMarque(String marque) { this.marque = marque; }
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
}
