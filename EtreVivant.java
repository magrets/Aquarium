public class EtreVivant {
    protected String espece;
    protected boolean carnivore;
    protected boolean vivant;

    public EtreVivant(){
        vivant = true;
    }
    
    public void afficher(){
        System.out.println("Je suis un etre vivant");
    }

    public boolean mange(EtreVivant e){
        System.out.println("Je mange");
        
        return true;
    }

    public String getEspece(){
        return espece;
    }

    public boolean isVivant(){
        return vivant;
    }
}
