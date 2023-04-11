package fr.marie.western;

public class Cowboy extends Humain implements VisagePale{
    int popularité;
    String adjectif;
    public Cowboy(String nom) {
        super(nom, "whisky");
        this.popularité = 0;
        this.adjectif = "vaillant";
    }
    @Override
    public void sePresenter() {
        parler("Bonjour, je suis "+ this.quelEstTonNom() + " les gens disent que je suis "+ this.adjectif + "ma popularité est de:"+ this.popularité+".");
    }
    void exprimer(){
        parler("Prend ça, rascal !");
    }
    void libérer(Dame dame){
        dame.libérer(this);
        this.popularité += 1;
    }
    void tirer(Brigand brigand){
        parler("le " + this.adjectif + " " + this.quelEstTonNom() + " tire sur " + brigand.quelEstTonNom()+" " +brigand.look + ". PAN ! "  );
    }


    @Override
    public void scalp(Indien indien) {
        indien.nombreDePlumes += 1;
        parler("Aïe ma tête !");
    }
}

