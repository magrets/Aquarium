public class Algue extends EtreVivant{

    public Algue(){
        super();
        espece= "algue";
        carnivore = false;
    }

    public void afficher(){
        System.out.println("Je suis une algue");
    }

    public boolean mange(EtreVivant e){
        System.out.println("Une algue ne mange pas de :" + e.getEspece());
        return false;
    }
    
}
