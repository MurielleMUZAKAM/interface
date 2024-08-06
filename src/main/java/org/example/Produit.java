package org.example;

public class Produit {
    private String id;
    private String nom;
    private double prix;
    private int quantite;
    private String type;

    public Produit(String id, String nom, double prix, int quantite, String type) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.type = type;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }
    public int getQuantite() { return quantite; }
    public void setQuantite(int quantite) { this.quantite = quantite; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
