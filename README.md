<<<<<<< HEAD
## Architecture UML
Le diagramme correspond à l'implementation du patron strategie  présente dans le code  : 
```mermaid
classDiagram
   class VueVehicule{
    -nom String
    -coleur String
    -type  String
    +VueVehicule(nom : String ,coleur : String , type : String )
    +getNom() String
    +getColeur() String
    +getType() String

    }

    class VueCatalogue{
        #dessin DessinCatalogue
        #vuesVehicules List~VueVehicule~
        +VueCatalogue(dessin : DessinCatalogue ,vuesVehicules : List~VueVehicule ~)
        +setDessinCatalogue(dessin :DessinCatalogue ) void
        +afficher() void
    }
    
    class DessinCatalogue {
        <<Interface>>
        +dessiner(vuesVehicules : List~VueVehicule~) void
    }
    
    class DessinCatalogueParLigne {
        +dessiner(vuesVehicules : List~VueVehicule~) void
    }

    class DessinCatalogueTroisParLigne {
        +dessiner(vuesVehicules : List~VueVehicule~) void
    }
    
    DessinCatalogue <|.. DessinCatalogueParLigne
    DessinCatalogue <|.. DessinCatalogueTroisParLigne
    VueCatalogue "" --> "0..*" VueVehicule : vueVehicules
    VueCatalogue ""--> "1" 
```
=======
# Strategy_Pattern
>>>>>>> ba609ef0311f935bb240d453272e7e824c18ee1f
