package fr.marie.western;

public class Shérif extends Cowboy{

    int nbrBrigand;
    public Shérif(String nom) {
        super(nom);
        this.nbrBrigand = 0;
        this.adjectif = "honnêtes";
    }

    public void  coffre(){
        this.nbrBrigand += 1;
        parler("Au nom de la loi, je vous arrête !");
    }
    public void rechercher (HorsLaLoi horslaloi){
        System.out.println(quelEstTonNom() + "- placarde des affiches dans toute la ville");
        double nouvelleRecompense= horslaloi.prime()*2;
        horslaloi.SetRecompense(nouvelleRecompense);
        parler("OYEZ OYEZ BRAVE GENS !! "+ nouvelleRecompense +"$ a qui arrêtera " + horslaloi.quelEstTonNom() +", mort ou vif !!");
    }

    @Override
    public void sePresenter() {
        parler("Bonjour, je suis "+ this.quelEstTonNom() + " et j'ai  coffré : " + this.nbrBrigand + " Brigand.");
    }
    @Override
    public  String quelEstTonNom() {
        return "Shérif "+ super.quelEstTonNom() ;
    }
}
