public class PoissonCarnivore extends Poisson{

    public PoissonCarnivore(String e){
        super(e);
        carnivore = true;
    }
    
    public boolean mange(EtreVivant e){
        if(e.getEspece() != "algue" && !e.equals(this)){
            System.out.println(nom + " suce " + e.getEspece());
            return true;
        }else{
            System.out.println(nom + " sodomise " + e.getEspece());
            return false;
        }
    }
}
