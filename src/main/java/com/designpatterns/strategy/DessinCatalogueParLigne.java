package com.designpatterns.strategy;

import java.util.List;
public class DessinCatalogueParLigne implements DessinCatalogue {
   
  
   public void dessiner(List<VueVehicule> vuesVehicules) {
      for (VueVehicule vue : vuesVehicules) {
        System.out.println(vue.getNom() + " : " + vue.getColeur() + " : " + vue.getType());
        System.out.println("--------------------------------------------------");
      }
   }
    
     
}
