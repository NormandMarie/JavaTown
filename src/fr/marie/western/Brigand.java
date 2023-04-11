package fr.marie.western;

public class Brigand extends Humain  implements HorsLaLoi {

    String look;
    int nbrDame;
    double récompense;
    boolean estEnPrison;

    public Brigand(String nom) {
        super(nom, "tord-boyaux");
        this.look = "méchant";
        this.nbrDame = 0;
        this.récompense = 100;
        this.estEnPrison = false;
    }

    public Brigand(String nom, String boissonFavorite, String look, int nbrDame, double recompense) {
        super(nom, boissonFavorite);
        this.look = look;
        this.nbrDame = nbrDame;
        this.récompense = recompense;
        this.estEnPrison = false;
    }

    @Override
    public void sePresenter() {
        String etat = estEnPrison ? "en prison" : "en liberté";
        parler("Je suis " + this.quelEstTonNom() + ". J'ai enlevé " + nbrDame + " dames et ma prime s'éleve a : " + récompense + " $.");
        parler("Je suis actuellement " + etat + ".");
    }

    @Override

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + look;
    }

    @Override
    public void capture(Dame dame) {
        this.nbrDame += 1;
        dame.SeFaireKidnapper();
        parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais");
    }

    public void changerÉtat(boolean estEnPrison) {
        this.estEnPrison = estEnPrison;
    }

    @Override
    public void seFaireEmprisonner(Cowboy cowboy) {
        if (!estEnPrison) {
            estEnPrison = true;
            parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !");
        }
    }

    @Override
    public double prime() {
        return récompense;
    }
    @Override
    public void SetRecompense(double nouvelleRecompense) {
        this.récompense = nouvelleRecompense;
    }
}
