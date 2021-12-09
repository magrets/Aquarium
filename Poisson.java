public class Poisson {
    private String nom;
    private String sexe;

    public Poisson(){
        System.out.println("Quel est le nom du poisson :");
        nom = MySc.sc.next();
        sexe = verifSexe();
    }

    public void affichePoisson(){
        if(sexe.equals("male")){
            System.out.println(nom + " est un " + sexe);
        }else if(sexe.equals("femelle")){
            System.out.println(nom + " est une " + sexe);
        }
    }

    private String verifSexe(){
        String s = null;
        //do{
           // System.out.println("Quel est le sexe du poisson [male/femelle] :");
            s = MySc.sc.next();
            s = s.toLowerCase();
            System.out.println("s = " + s);
            if(s.equalsIgnoreCase("male") || s.charAt(0) == 'm'){
                s = "male";
            }else if(s.equalsIgnoreCase("femelle") || s.charAt(0) == 'f'){
                s =  "femelle";
            }
        //}while(s != "male" || s != "femelle");
        return s;
    }

    public String getNom(){
        return nom;
    }
}
