package com.designpatterns.strategy;
import java.util.List;
public class VueCatalogue {
    
    protected DessinCatalogue dessinCatalogue;
    protected List<VueVehicule> vueVehicule;

    public  VueCatalogue(DessinCatalogue dessinCatalogue , List<VueVehicule> vueVehicule) {
        this.dessinCatalogue = dessinCatalogue;
        this.vueVehicule = vueVehicule;
    }

    public void afficher() {
        dessinCatalogue.dessiner(vueVehicule);
    }
    public void setDessinCatalogue(DessinCatalogue dessinCatalogue) {
        this.dessinCatalogue = dessinCatalogue;
    }
        
}
