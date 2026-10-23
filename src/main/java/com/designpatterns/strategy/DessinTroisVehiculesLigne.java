package com.designpatterns.strategy;

import java.util.List;

public class DessinTroisVehiculesLigne implements DessinCatalogue {

    public void dessiner(List<VueVehicule> vuesVehicules) {
        for (int debut = 0; debut < vuesVehicules.size(); debut += 3) {
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
