package org.example;
import javafx.application.Application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Application.launch(Ecran.class, args);
    }
//        Magasin magasin = new Magasin();
//        Scanner scanner = new Scanner(System.in);
//        DataBase db = new DataBase() {
//            @Override
//            public void rechercherProduitParNom(String nomRechercher) {
//
//            }
//
//            @Override
//            public void afficherProduitsMoinsChersQue(double prix) {
//
//            }
//
//            @Override
//            public void afficherProduitsParCategorie(Class<?> categorie) {
//
//            }
//        };
//        db.creerTables();
//        while (true) {
//
//            System.out.println("\nOptions:");
//            System.out.println("1. Ajouter un produit");
//            System.out.println("2. Supprimer un produit");
//            System.out.println("3. Modifier un produit");
//            System.out.println("4. Rechercher un produit par nom");
//            System.out.println("5. Lister les produits par lettre");
//            System.out.println("6. Afficher le nombre de produits");
//            System.out.println("7. Afficher le produits moins chers ");
//            System.out.println("8. Afficher les produits par catégorie");
//            System.out.println("9. Afficher tous les produits");
//            System.out.println("0. Quitter");
//            System.out.print("Choisissez une option: ");
//            int choix = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choix) {
//                case 1:
//                    System.out.print("Entrez l'id du produit: ");
//                    String id = scanner.nextLine();
//                    System.out.print("Entrez le nom du produit: ");
//                    String nom = scanner.nextLine();
//                    System.out.print("Entrez le prix du produit: ");
//                    double prix = scanner.nextDouble();
//                    scanner.nextLine();
//                    String couleur = scanner.nextLine();
//                    scanner.nextLine();
//
//                    System.out.println("Type de produit (1: Electronique, 2: Alimentaire, 3: Vestimentaire): ");
//                    int type = scanner.nextInt();
//                    scanner.nextLine();
//                    Produit produit = null;
//
//                    switch (type) {
//                        case 1:
//                            System.out.println("Entrez la marque: ");
//                            String marque = scanner.nextLine();
//                            System.out.println("Entrez la couleur");
//                            couleur = scanner.nextLine();
//                            produit = new Electronique(id, nom, prix, marque, couleur);
//                            break;
//                        case 2:
//                            System.out.print("Entrez la date de fabrication du produit: ");
//                            String dateFab = scanner.nextLine();
//                            produit = new Alimentaire(id, nom, prix, dateFab);
//                            break;
//                        case 3:
//                            System.out.println("Entrez la taille du produit: ");
//                            String taille = scanner.nextLine();
//                            System.out.println("Entrez la couleur du produit: ");
//                            couleur = scanner.nextLine();
//
//                            produit = new Vestimentaire(id, nom, prix, taille, couleur);
//                            break;
//                        default:
//                            System.out.println("Type de produit invalide.");
//                    }
//
//                    if (produit != null) {
//                        magasin.ajouterProduit(produit);
//                    }
//                    break;
//                case 2:
//                    System.out.print("Entrez l'id du produit à supprimer: ");
//                    String idSupprimer = scanner.nextLine();
//                    magasin.supprimerProduit(idSupprimer);
//                    break;
//                case 3:
//                    System.out.print("Entrez l'id du produit à modifier: ");
//                    String idModifier = scanner.nextLine();
//                    System.out.print("Entrez le nouveau nom: ");
//                    String nouveauNom = scanner.nextLine();
//                    System.out.print("Entrez le nouveau prix: ");
//                    double nouveauPrix = scanner.nextDouble();
//                    magasin.modifierProduit(idModifier, nouveauNom, nouveauPrix);
//                    break;
//                case 4:
//                    System.out.print("Entrez le nom du produit à rechercher: ");
//                    String nomRechercher = scanner.nextLine();
//                    magasin.rechercherProduitParNom(nomRechercher);
//                    break;
//                case 5:
//                    System.out.print("Entrez la lettre: ");
//                    char lettre = scanner.next().charAt(0);
//                    magasin.listerProduitsParLettre(lettre);
//                    break;
//                case 6:
//                    magasin.afficherNombreProduits();
//                    break;
//                case 7:
//                    System.out.print("Entrez le prix maximum1" +
//                            ": ");
//                    double prixMax = scanner.nextDouble();
//                    magasin.afficherProduitsMoinsChersQue(prixMax);
//                    break;
//                case 8:
//                    System.out.println("Catégorie de produit (1: Electronique, 2: Alimentaire, 3: Vestimentaire): ");
//                    int categorie = scanner.nextInt();
//                    Class<?> classeCategorie = null;
//                    switch (categorie) {
//                        case 1:
//                            classeCategorie = Electronique.class;
//                            break;
//                        case 2:
//                            classeCategorie = Alimentaire.class;
//                            break;
//                        case 3:
//                            classeCategorie = Vestimentaire.class;
//                            break;
//                        default:
//                            System.out.println("Catégorie invalide.");
//                    }
//
//                    if (classeCategorie != null) {
//                        magasin.afficherProduitsParCategorie(classeCategorie);
//                    }
//                    break;
//                case 9:
//                    magasin.afficherTousProduits();
//                    break;
//                case 0:
//                    scanner.close();
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Option invalide.");
//            }
//        }
//    }
}
