import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Aquarium {
    private ArrayList<EtreVivant> listAquarium;

    public Aquarium(){
        listAquarium = new ArrayList<EtreVivant>();
    }

    public void ajoutePoisson(){
        Poisson p = quelleEspece();
        //Si ce poisson n'existe pas encore et qu'il a bien était créé

        if(p != null){
            listAquarium.add(p);
        }        
    }

    public void ajouteAlgue(){
        listAquarium.add(new Algue());
    }

    public void afficheAquarium(){
        System.out.println("L'aquarium contient " + listAquarium.size() + " poisson(s) et algues dont voici la liste :");
        for (EtreVivant etre : listAquarium){
            etre.afficher();
        }
    }

    private Poisson quelleEspece(){
        Poisson p;
        byte choix = 0;

        do{
            System.out.println("Quelle est l'espèce [1.Mérou, 2.Thon 3.Poisson-clown 4.Sole 5.Bar 6.Carpe] :");
            choix = MySc.sc.nextByte();

            switch(choix){
                case 1:
                    p = new PoissonCarnivore("Mérou");
                    break;
                case 2:
                p = new PoissonCarnivore("Thon");
                    break;
                case 3:
                p = new PoissonHerbivore("Poisson-clown");
                    break;
                case 4:
                p = new PoissonHerbivore("Sole");
                    break;
                case 5:
                p = new PoissonCarnivore("Bar");
                    break;
                case 6:
                p = new PoissonHerbivore("Carpe");
                    break;
                default:
                    p = null;
                    break;
            }
        }while(choix < 0 && choix >= 6);
        return p;
    }

    public void passerTour(){
        int random;
        EtreVivant e;
        Iterator<EtreVivant> itr = listAquarium.iterator();

        afficheAquarium();
        
        while(itr.hasNext()){
            random = tirageAleatoire();
            e = itr.next();
            if(e.getEspece() != "algue" && e.isVivant()){
                if(e.mange(listAquarium.get(random))){
                    listAquarium.get(random).vivant = false;
                }
            }
        }
        suprManger();
    }
    private void suprManger(){
        Iterator<EtreVivant> itr = listAquarium.iterator();
        EtreVivant e;

        while(itr.hasNext()){
            e = itr.next();
            if(!e.isVivant()){
                itr.remove();
            }
        }
    }

    private int tirageAleatoire(){
        Random random = new Random();
        return random.nextInt(listAquarium.size()-1); 
    }
}
