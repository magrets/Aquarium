public class Poisson {
    private String nom;
    private String sexe;
    private String espece;
    private boolean carnivore;

    public Poisson(){
        System.out.println("Quel est le nom du poisson :");
        nom = MySc.sc.next();
        sexe = verifSexe();
        espece = verifEspece();
    }

    public void affichePoisson(){
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

    private String verifEspece(){
        String s = null;
        byte choix = 0;

        do{
            System.out.println("Quelle est l'espèce [1.Mérou, 2.Thon 3.Poisson-clown 4.Sole 5.Bar 6.Carpe] :");
            choix = MySc.sc.nextByte();

            switch(choix){
                case 1:
                    espece = "Mérou";
                    carnivore = true;
                    break;
                case 2:
                    espece = "Thon";
                    carnivore = true;
                    break;
                case 3:
                    espece = "Poisson-clown";
                    carnivore = false;
                    break;
                case 4:
                    espece = "Sole";
                    carnivore = false;
                    break;
                case 5:
                    espece = "Bar";
                    carnivore = true;
                    break;
                case 6:
                    espece = "Carpe";
                    carnivore = false;
                    break;
            }
        }while(choix > 0 && choix <= 7);
        return s;
    }

    public boolean mange(Poisson p){

        return false;
    }

    public boolean mange(Algue a){

        return false;
    }

    public String getNom(){
        return nom;
    }
}
