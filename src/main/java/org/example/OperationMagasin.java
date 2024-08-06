package org.example;


public interface OperationMagasin {
    void creerTables();
    void ajouterProduit(Produit produit);
    void supprimerProduit(String id);
    void modifierProduit(String id, String nouveauNom, double nouveauPrix);
    void rechercherProduitParNom(String nom, String id, String prix);
    void listerProduitsParLettre(char lettre);
    void afficherNombreProduits();
    void afficherProduitsMoinsChersQue(double prix);
    void afficherProduitsParCategorie(Class<?> categorie);
    void afficherTousProduits();



}
