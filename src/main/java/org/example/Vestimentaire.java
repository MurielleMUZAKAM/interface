package org.example;

public class Vestimentaire extends Produit {
    private String taille;
    private String couleur;

    public Vestimentaire(String id, String nom, double prix, int quantite, String taille) {
        super(id, nom, prix, quantite, "Vestimentaire");
        this.taille = taille;
        this.couleur = couleur;
    }

    // Getters and setters
    public String getTaille() { return taille; }
    public void setTaille(String taille) { this.taille = taille; }
    public String getCouleur() { return couleur; }
    public void setCouleur(String couleur) { this.couleur = couleur; }
}
