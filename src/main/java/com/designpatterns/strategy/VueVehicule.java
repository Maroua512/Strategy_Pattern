package com.designpatterns.strategy;

public class VueVehicule {
    private final  String nom;
    private  final String couleur;
    private  final String type;

    public VueVehicule(String nom, String couleur, String type) {
        this.nom = nom;
        this.couleur = couleur;
        this.type = type;
    }

    public String getNom() {
        return this.nom;
    }
    public String getColeur(){
        return this.couleur;
    }
    public String getType() {
        return this.type;
    }
  
}
