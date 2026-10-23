package com.designpatterns.strategy;

import java.util.List;

public class DessinTroisVehiculesLigne implements DessinCatalogue {

     /**  
      * Strategie d'affichage qui organise les vehicules par groupes de trois.
 
      */
    public void dessiner(List<VueVehicule> vuesVehicules) {
        for (int debut = 0; debut < vuesVehicules.size(); debut += 3) {

            // Math.min permet d'afficher aussi le dernier groupe s'il contient moins de trois vehicules.
            int fin = Math.min(debut + 3, vuesVehicules.size());

            for (int index = debut; index < fin; index++) {
                if (index > debut) {
                    System.out.print("\t");
                }
                afficherVehicule(vuesVehicules.get(index));
            }

            System.out.println();
            System.out.println("--------------------------------------------------");
        }
    }

    private void afficherVehicule(VueVehicule vehicule) {
        System.out.print("Nom: " + vehicule.getNom()
                + ", Couleur: " + vehicule.getColeur()
                + ", Type: " + vehicule.getType());
    }
}
