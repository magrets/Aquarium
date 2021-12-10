public class App {
    public static void main(String[] args) throws Exception {
        Aquarium bocal = new Aquarium();
        byte choix = 0;

        System.out.println("Bienvenue dans l'aquarium !");
        
        do{
            System.out.println("Que voulez faire :");
            System.out.println("1. Ajouter un poisson");
            System.out.println("2. Ajouter une algue");
            System.out.println("3. Faire passer un tour");
            System.out.println("4. Quitter l'aquarium");

            choix = MySc.sc.nextByte();

            switch(choix){
                case 1:
                    bocal.ajoutePoisson();
                    break;
                case 2:
                    bocal.ajouteAlgue();
                    break;
                case 3:
                    bocal.passerTour();
                    break;
                case 4:
                    sortir();
                    break;
        }
    }while(choix != 4);
    
}

    static public void sortir(){
        MySc.sc.close();
        System.exit(0);
    }
}
