package com.designpatterns.strategy;

import java.util.*;
public class DessinCatalogueParLigne implements DessinCatalogue {
   
    public List<VueVehicule> vuesVehicules;

    /**
     * Strategie d'affichage qui affiche  les vehicules par ligne.
     */
   public void dessiner(List<VueVehicule> vuesVehicules) {
      for (VueVehicule vue : vuesVehicules) {
        System.out.println(vue.getNom() + " : " + vue.getColeur() + " : " + vue.getType());
        System.out.println("--------------------------------------------------");
      }
   }
    
     
}
