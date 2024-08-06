package org.example;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Magasin {
    private ObservableList<Produit> produits = FXCollections.observableArrayList();

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    public Produit getProduitById(String id) {
        for (Produit produit : produits) {
            if (produit.getId().equals(id)) {
                return produit;
            }
        }
        return null;
    }

    public ObservableList<Produit> getProduits() {
        return produits;
    }

    public void chargerProduits() {
        String query = "SELECT * FROM produits";
        try (Connection connection = DataBase.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String id = String.valueOf(resultSet.getInt("id"));
                String nom = resultSet.getString("nom");
                double prix = resultSet.getDouble("prix");
                int quantite = resultSet.getInt("quantite");
                String type = resultSet.getString("type");

                Produit produit;
                switch (type.toLowerCase()) {
                    case "alimentaire":
                        produit = new Alimentaire(id, nom, prix, quantite, type);
                        break;
                    case "electronique":
                        produit = new Electronique(id, nom, prix, quantite, type);
                        break;
                    case "vestimentaire":
                        produit = new Vestimentaire(id, nom, prix, quantite, type);
                        break;
                    default:
                        produit = new Produit(id, nom, prix, quantite, type);
                        break;
                }
                ajouterProduit(produit);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
