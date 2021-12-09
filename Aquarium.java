import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Aquarium {
    private HashMap<String, Poisson> DicoPoisson;
    private ArrayList<Algue> listAlgues;

    public Aquarium(){
        DicoPoisson = new HashMap<String, Poisson>();
        listAlgues = new ArrayList<Algue>();
    }

    public void ajoutePoisson(){
        //Si ce poisson n'existe pas encore
        Poisson p = new Poisson();
        if(DicoPoisson.get(p.getNom()) == null){
            DicoPoisson.put(p.getNom(), p);
        }        
    }

    public void ajouteAlgue(){
        listAlgues.add(new Algue());
    }

    public void afficheAquarium(){
        Collection<Poisson> c = DicoPoisson.values();

        System.out.println("L'aquarium contient " + DicoPoisson.size() + " poisson(s) dont voici la liste :");
        for (Poisson p : c){
            p.affichePoisson();
        }
        System.out.println("Il y a aussi " + listAlgues.size() + " algue(s).");
    }
}
