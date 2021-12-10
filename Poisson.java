public class Poisson extends EtreVivant{
    protected String nom;
    protected String sexe;

    public Poisson(String e){
        super();
        System.out.println("Quel est le nom du poisson :");
        nom = MySc.sc.next();
        sexe = verifSexe();
        espece = e;
    }

    public void afficher(){
        if(sexe.equals("male")){
            System.out.print(nom + " est un " + sexe);
        }else if(sexe.equals("femelle")){
            System.out.print(nom + " est une " + sexe);
        }
        System.out.println(" c'est un(e) " + espece);
    }

    private String verifSexe(){
        String s = null;
        do{
            System.out.println("Quel est le sexe du poisson [male/femelle] :");
            s = MySc.sc.next();
            s = s.toLowerCase();
            if(s.equalsIgnoreCase("male") || s.charAt(0) == 'm'){
                s = "male";
            }else if(s.equalsIgnoreCase("femelle") || s.charAt(0) == 'f'){
                s =  "femelle";
            }
        }while(s != "male" && s != "femelle");
        return s;
    }        

    public String getNom(){
        return nom;
    }

    public boolean isCarnivore(){
        return carnivore;
    }
}
