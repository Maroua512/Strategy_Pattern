package com.designpatterns.strategy;
import java.util.List;


public final class App {

    private App() {
    }

    public static void main(String[] args) {
         // Les donnees restent les memes lorsque la strategie d'affichage change.
         VueVehicule v1 = new VueVehicule("v1", "rouge", "voiture");
         VueVehicule v2 = new VueVehicule("v2", "bleu", "camion");
         VueVehicule v3 = new VueVehicule("v3", "vert", "moto");
         VueVehicule v4 = new VueVehicule("v4", "jaune", "velo");
         VueVehicule v5 = new VueVehicule("v5", "noir", "avion");

         // Premiere strategie : affichage de trois vehicules par ligne.
         DessinCatalogue dessinCatalogue = new DessinTroisVehiculesLigne();
         VueCatalogue vueCatalogue = new VueCatalogue(dessinCatalogue, List.of(v1, v2, v3,v4,v5));
         vueCatalogue.afficher();

         // Le contexte conserve les memes vehicules, mais utilise une autre strategie.
         // Cela demontre que l'algorithme d'affichage peut etre change a l'execution.
         vueCatalogue.setDessinCatalogue(new DessinCatalogueParLigne());

         // Deuxieme strategie : affichage d'un vehicule par ligne.
         vueCatalogue.afficher();

}}
