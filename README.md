Application de gestion de produits ecrite en JAVA par MBEY MUZAKAM Murielle et SIKUZANI BENDERA Naomie

.
                                                      PRESENTATION APPLICATION
                                                      
.                                                      
    Cette apllication a une interface qui s'affiche avec les informations recquises pour identifier un produit et des boutons au bas de la page
    pour les differents fonctionnalités de notre application.
    Chaque bouton est une fonctionnalité et lorsqu'on clique sur l'un d'eux, une boite de dialogue s'ouvre permettant  à l'utilisateur d'entrer les informations exigées 
    pour chacune de ses fonctionnalités.

.
                                                            FONCTIONNALITES
    *AJOUTER PRODUIT: Cette fonctionnalité permet d'ajouter et enregistrer un produit dans la base des données. Lorsque l'on clique sur le bouton "Ajouter Produit", une boite de dialogue
    s'affiche et dans celle=ci, il faudra inscrire les informations demandées qui sont:
                                                                                            --ID du produit
                                                                                            --Nom du produit
                                                                                            --Prix du produit
                                                                                            --Quantité du produit
                                                                                            --Type du produit. A ce stade, une liste deroulante est mise à la dispositions des 
                                                                                            utilisaeurs afin de voir et choisir parmis les propositions des types de produits que nous avons 
                                                                                            à savoir "Electronique, Vestimentaire et Alimentaire"
  Les imformations saisies, cliquer sur le bouton  "Ajouter" et les informatons sont ainsi ajoutées dans notre base des données avec succès.
  NB:Si toutes les informations requises ne sont pas saisie, l'opératon d'ajouter ne passera pas car on a besoin qu'elles soit toutes au complet pour que ça passe.

  **SUPPRIMER PRODUIT: Cette fonctionnalité permet de supprimer un produit grace a son ID. Le processus pour acceder à la fonctionnalité est le meme pour toutes.
  Une fois la boite de dialogue affichée, entrer l'ID du produit et appuyer sur le bouton "Supprimer". Le produit est supprimé avec succès.


***MODIFIER PRODUIT: Cette fonctionnalité permet de mettre à jour les informations d'un produit déjà existant dans la base de données. Lorsque l'on clique sur le bouton 
"Modifier Produit", une boîte de dialogue s'affiche et demande d'entrer le nom du produit que l'on souhaite modifier puis on clique le bouton "OK".
Une autre boite de dialogue s'affiche avec les informations actuelles du produit pré-remplies. Les utilisateurs peuvent alors modifier les champs suivants :
                                                                                                                                                                 --Nom du produit
                                                                                                                                                                 --Prix du produit
                                                                                                                                                                 --Quantité du produit
                                                                                                                                                                 --Type du produit




Étapes pour modifier un produit:
1. Rechercher le produit à modifier en utilisant son nom.
2. Cliquer sur le bouton "OK".
3. La boîte de dialogue s'ouvre avec les informations actuelles du produit.
4. Modifier les informations souhaitées.
5. Cliquer sur le bouton "Enregistrer" pour sauvegarder les modifications.

Les informations mises à jour sont alors enregistrées dans la base de données et le produit est mis à jour avec succès.
NB:Les informations d'un produit peuvemt etre ou ne pas etre modifiées et un produit peut subir des modicfications autant de fois voulues par l'utilisateur.
Voici une description pour la fonctionnalité **Rechercher Produits par Nom**, en suivant la même structure que la fonctionnalité de modification des produits :

****RECHERCHER PRODUITS: Cette fonctionnalité permet aux utilisateurs de rechercher des produits en utilisant leur nom. 
Tous les produits correspondant au nom saisi s'affichent dans une liste, facilitant ainsi la gestion et la visualisation des produits.

Étapes pour rechercher un produit par nom:
1. Lorsque le bouton activant la fonctionnalité est appuyé, la boite de dialogue est affichée demadant d'inserer le nom du produit.
2. Saisie du nom: L'utilisateur entre le nom complet ou partiel du produit dans le champ de recherche.
3. Affichage des résultats: Une fois le nom saisi, une liste de tous les produits correspondant au nom apparaît. Les informations affichées incluent :
                                                                                                                                                             --ID du produit
                                                                                                                                                             --Nom du produit
                                                                                                                                                            --Prix du produit
                                                                                                                                                             --Quantité du produit
                                                                                                                                                             --Type du produit

Cette fonctionnalité améliore l'expérience utilisateur en permettant une recherche rapide et efficace des produits par leur nom, facilitant ainsi la gestion des produits dans la base de données.

*****LISTER PRODUIT PAR LETTRE: Cette fonctionnalité permet aux utilisateurs de rechercher des produits en utilisant la première lettre de leur nom.
Tous les produits commençant par la lettre saisie s’affichent dans une liste, facilitant ainsi la gestion et la visualisation des produits.

Étapes pour lister les produits par lettre:
1. Lorsque le bouton activant la fonctionnalité est appuyé, la boite de dialogue est affichée demadant d'inserer la premiere lettre du nom du produit.
2.Saisir de la lettre: L’utilisateur entre la première lettre du produit dans le champ de saisie dans la boite de dialogue.
3.Affichage des résultats: Une fois la lettre saisie, une liste de tous les produits correspondant à cette lettre apparaît. Les informations affichées incluent :
                                                                                                                                                                    --ID du produit
                                                                                                                                                                    --Nom du produit
                                                                                                                                                                    --Prix du produit
                                                                                                                                                                    --Quantité du produit
                                                                                                                                                                     --Type du produit

Cette fonctionnalité améliore l’expérience utilisateur en permettant une recherche rapide et efficace des produits par leur première lettre, facilitant ainsi la gestion des produits dans la base de données.

.
                                                                            COMPILATION
                                                                            
Pour compiler et exécuter le code, il suffit de le faire dans le coe source et ainsi l'interface graphique est lancée permettant ainsi à l'utilisateur de l'utiliser.
