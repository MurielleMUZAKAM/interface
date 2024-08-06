package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBase implements OperationMagasin {
    private static final String URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_UDBL_DB";
    private static final String USER = "freedb_Murielle Mbey";
    private static final String PASSWORD = "vhZHns75v@53$B%";

    // Méthode pour établir une connexion à la base de données
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver not found", e);
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Méthode pour créer les tables nécessaires dans la base de données
    public void creerTables() {
        String sqlProduit = "CREATE TABLE IF NOT EXISTS Produits (" +
                "id VARCHAR(255) PRIMARY KEY, " +
                "nom VARCHAR(255), " +
                "prix DOUBLE)";
        try (Connection conn = getConnection();
             PreparedStatement pstmtProduit = conn.prepareStatement(sqlProduit)) {
            pstmtProduit.executeUpdate();
            System.out.println("Table Produits créée avec succès.");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la création de la table Produits: " + e.getMessage());
        }
    }

    // Méthode pour ajouter un produit à la base de données
    public void ajouterProduit(Produit produit) {
        String sql = "INSERT INTO Produits (id, nom, prix) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, produit.getId());
            pstmt.setString(2, produit.getNom());
            pstmt.setDouble(3, produit.getPrix());
            pstmt.executeUpdate();
            System.out.println("Produit ajouté à la base de données: " + produit);
        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du produit: " + e.getMessage());
        }
    }

    // Méthode pour supprimer un produit de la base de données
    public void supprimerProduit(String id) {
        String sql = "DELETE FROM Produits WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Produit supprimé de la base de données avec l'id: " + id);
            } else {
                System.out.println("Produit avec l'id " + id + " non trouvé dans la base de données.");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du produit: " + e.getMessage());
        }
    }

    // Méthode pour modifier un produit dans la base de données
    public void modifierProduit(String id, String nouveauNom, double nouveauPrix) {
        String sql = "UPDATE Produits SET nom = ?, prix = ? WHERE id = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nouveauNom);
            pstmt.setDouble(2, nouveauPrix);
            pstmt.setString(3, id);
            pstmt.executeUpdate();
            System.out.println("Produit modifié dans la base de données: " + id);
        } catch (SQLException e) {
            System.out.println("Erreur lors de la modification du produit: " + e.getMessage());
        }
    }

    @Override
    public void rechercherProduitParNom(String nom, String id, String prix) {

    }

    // Méthode pour rechercher un produit par nom
    public void rechercherProduitParNom(String nom) {
        String sql = "SELECT * FROM Produits WHERE nom = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String id = rs.getString("id");
                    double prix = rs.getDouble("prix");
                    System.out.println("Produit trouvé - ID: " + id + ", Nom: " + nom + ", Prix: " + prix);
                } else {
                    System.out.println("Produit avec le nom " + nom + " non trouvé.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche du produit: " + e.getMessage());
        }
    }

    // Méthode pour lister tous les produits par lettre
    public void listerProduitsParLettre(char lettre) {
        String sql = "SELECT * FROM Produits WHERE nom LIKE ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, lettre + "%");
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String id = rs.getString("id");
                    String nom = rs.getString("nom");
                    double prix = rs.getDouble("prix");
                    System.out.println("Produit (id: " + id + ") Nom: " + nom + ", Prix: " + prix);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération des produits: " + e.getMessage());
        }
    }

    // Méthode pour afficher le nombre total de produits
    public synchronized void afficherNombreProduits() {
        String sql = "SELECT COUNT(*) AS total FROM Produits";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt("total");
                System.out.println("Il y a " + count + " produits enregistrés");
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la récupération du nombre de produits : " + e.getMessage());
        }
    }

    @Override
    public void afficherProduitsMoinsChersQue(double prix) {

    }

    @Override
    public void afficherProduitsParCategorie(Class<?> categorie) {

    }

    // Méthode pour afficher tous les produits de la base de données
    public synchronized void afficherTousProduits() {
        String sql = "SELECT * FROM Produits";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String id = rs.getString("id");
                String nom = rs.getString("nom");
                double prix = rs.getDouble("prix");
                System.out.println("Produit (id: " + id + ") Nom: " + nom + ", Prix: " + prix);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
