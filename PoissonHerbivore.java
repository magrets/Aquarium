public class PoissonHerbivore extends Poisson{
    
    public PoissonHerbivore(String e){
        super(e);
        carnivore = false;
    }

    public boolean mange(EtreVivant e){
        if(e.getEspece() == "algue" && !e.equals(this)){
            System.out.println(nom + " mange " + e.getEspece());
            return true;
        }else{
            System.out.println(nom + " ne mange pas " + e.getEspece());
            return false;
        }
    }
    
}
