package com.designpatterns.strategy;
import java.util.List;


public final class App {

    private App() {
    }

    public static void main(String[] args) {
       
         VueVehicule v1 = new VueVehicule("v1", "rouge", "voiture");
         VueVehicule v2 = new VueVehicule("v2", "bleu", "camion");
         VueVehicule v3 = new VueVehicule("v3", "vert", "moto");
         VueVehicule v4 = new VueVehicule("v4", "jaune", "velo");
         VueVehicule v5 = new VueVehicule("v5", "noir", "avion");

         DessinCatalogue dessinCatalogue = new DessinTroisVehiculesLigne();
         VueCatalogue vueCatalogue = new VueCatalogue(dessinCatalogue, List.of(v1, v2, v3,v4,v5));
         vueCatalogue.afficher();
         vueCatalogue.setDessinCatalogue(new DessinCatalogueParLigne());
         vueCatalogue.afficher();

}}
