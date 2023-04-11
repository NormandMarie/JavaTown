package fr.marie.western;

public class DameBrigand extends Humain implements HorsLaLoi {
    String look;
    int nbrpersonne;
    double récompense;
    boolean estEnPrison;

    public DameBrigand(String nom, String boissonFavorite) {
        super(nom,boissonFavorite);
        this.look = "romanesque";
        this.nbrpersonne = 0;
        this.récompense = 100;
        this.estEnPrison = false;
    }
    @Override
    public void seFaireEmprisonner(Cowboy cowboy) {
        if (!estEnPrison) {
            estEnPrison = true;
            parler("Damned, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !");
        }
    }
    @Override
    public void capture(Dame dame) {
        this.nbrpersonne += 1;
        dame.SeFaireKidnapper();
        parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais");
    }

    @Override
    public double prime() {
        return 0;
    }

    @Override
    public String quelEstTonNom() {
        return null;
    }

    @Override
    public void SetRecompense(double nouvelleRecompense) {
        this.récompense = nouvelleRecompense;
    }
}

